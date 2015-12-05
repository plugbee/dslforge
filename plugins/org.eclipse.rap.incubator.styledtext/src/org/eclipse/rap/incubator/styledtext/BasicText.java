/**
 * <copyright>
 *
 * Copyright (c) 2015 PlugBee. All rights reserved.
 * 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 which 
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Amine Lajmi - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.rap.incubator.styledtext;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.json.JsonArray;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.rap.rwt.widgets.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
/**
 * A basic implementation of a styled text widget.
 * 
 * @author Amine Lajmi
 *
 */
public class BasicText extends Composite {

	static final long serialVersionUID = 1L;	
	static final String REMOTE_TYPE = "org.eclipse.rap.incubator.styledtext.BasicText";
	static final int TextChanged = 47;
	static final int Save = 48;
	
	final BasicTextOperationHandler operationHandler = new BasicTextOperationHandler(this);
	RemoteObject remoteObject;
	List<IPath> resources = new ArrayList<IPath>();
	String text = "";
	String status = "";
	String command = "";
	List<Annotation> annotations = new ArrayList<Annotation>();
	List<String> scope = new ArrayList<String>();
	boolean isDirty=false;
	int style;
	Listener listener;
	
	public class BasicTextListener implements Listener {

		private static final long serialVersionUID = 1L;

		EventListener eventListener;

		public BasicTextListener(EventListener listener) {
			this.eventListener = listener;
		}

		/**
		 * Process StyledText events by invoking the event's handler.
		 *
		 * @param the
		 *            event to handle
		 */
		public void handleEvent(Event e) {
			switch (e.type) {
			case SWT.Modify:
				ModifyEvent modifyEvent = new ModifyEvent(e);
				((ModifyListener) eventListener).modifyText(modifyEvent);
				break;
			case Save:
				TextSavedEvent textSavedEvent = new TextSavedEvent(e);
				((ITextSaveListener) eventListener).handleTextSaved(textSavedEvent);
				break;
			case TextChanged:
				TextChangedEvent textChangedEvent = new TextChangedEvent(e);
				((ITextChangeListener) eventListener).handleTextChanged(textChangedEvent);
				break;
			}
		}
	}

	/**
	 * Creates a fresh Basic Text widget
	 * 
	 * @param parent
	 * @param style
	 */
	public BasicText(Composite parent, int style) {
		super(parent, style);
		super.setForeground(getForeground());
		this.style = style;
		if ((style & SWT.READ_ONLY) != 0) {
			setEditable(false);
		}
		addClientResources();
		registerClientResources();
		loadClientResources();
		createRemoteObject();
		
		installListeners();
	}

	/**
	 * Handles a text changed event.
	 * 
	 * @param event
	 */
	void handleTextChanged(Event event) {
		System.out.println("[BasicText] handleTextChanged");
		setDirty(true);
		notifyListeners(TextChanged, event);
	}

	/**
	 * Adds event listeners
	 */
	void installListeners() {

		listener = new Listener() {
			private static final long serialVersionUID = 1L;
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Dispose: handleDispose(event); break;
				case SWT.MenuDetect: handleMenuDetect(event); break;
				case SWT.Modify: handleTextModify(event); break;
				case SWT.FocusOut: handleFocusLost(event); break;
				case TextChanged: handleTextChanged(event);	break;
				case Save: handleTextSave(event); break;
				}
			}
		};
		addListener(SWT.Dispose, listener);
		addListener(SWT.MenuDetect, listener);
		addListener(SWT.FocusIn, listener);
		addListener(SWT.FocusOut, listener);
	}

	/**
	 * Handles a text modify event
	 * 
	 * @param event
	 */
	void handleTextModify(Event event) {
		setDirty(true);
		text = event.text;
		notifyListeners(TextChanged, event);
	}

	/**
	 * Handles a text save event
	 * 
	 * @param event
	 */
	void handleTextSave(Event event) {
		if (event.text!=null){
			setText(event.text, false);
		}
		notifyListeners(Save, event);
		setDirty(false);
	}

	/**
	 * Handles a menu detect event
	 * 
	 * @param event
	 */
	void handleMenuDetect(Event event) {
		//do nothing.
	}

	/**
	 * Handles a focus lost event
	 * 
	 * @param event
	 */
	void handleFocusLost(Event event) {
		if (event.text!=null){
			setText(event.text, false);
		}
	}
	
	/**
	 * Handles dispose event
	 * 
	 * @param event
	 */
	void handleDispose(Event event) {
		removeListener(SWT.Dispose, listener);
		notifyListeners(SWT.Dispose, event);
		event.type = SWT.None;
		text = null;
		listener = null;
	}

	/**
	 * Called by StyledText to add itself as an Observer to content changes. See
	 * TextChangeListener for a description of the listener methods that are
	 * called when text changes occur.
	 * <p>
	 *
	 * @param listener
	 *            the listener
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void addTextChangeListener(ITextChangeListener listener) {
		System.out.println("[DSLFORGE] - Adding TextChangeListener");
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(TextChanged, typedListener);
	}

	/**
	 * Adds a modify listener. A Modify event is sent by the widget when the
	 * widget text has changed.
	 *
	 * @param modifyListener
	 *            the listener
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void addTextModifyListener(ITextModifyListener modifyListener) {
		System.out.println("[DSLFORGE] - Adding TextModifyListener");
		checkWidget();
		if (modifyListener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(modifyListener);
		addListener(SWT.Modify, typedListener);
	}

	/**
	 * Adds a save listener. A Text save event is sent by the widget when the
	 * client emits a save request.
	 *
	 * @param modifyListener
	 *            the listener
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void addTextSaveListener(ITextSaveListener iTextSaveListener) {
		System.out.println("[DSLFORGE] - Adding TextSaveListener");
		checkWidget();
		if (iTextSaveListener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(iTextSaveListener);
		addListener(Save, typedListener);
	}

	/**
	 * Adds a focus listener.
	 *
	 * @param modifyListener
	 *            the listener
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void addFocusListener(FocusListener focusListener) {
		System.out.println("[DSLFORGE] - Adding FocusListener");
		checkWidget();
		if (focusListener == null) SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(focusListener);
		addListener(SWT.FocusOut, typedListener);
		addListener(SWT.FocusIn, typedListener);
	}

	@Override
	public void addListener(int eventType, Listener listener) {
		boolean wasListening = isListening(eventType);
		super.addListener(eventType, listener);
		boolean isListening = isListening(eventType);
		String remoteType = eventTypeToString(eventType);
		if (remoteType != null && !wasListening && isListening) {
			System.out.println("	- Adding listener for: " + remoteType);
			getRemoteObject().listen(remoteType, true);
		}
	}

	public void notifyListeners(String eventName, JsonObject properties) {
		JsonValue value = properties.get("value");
		Event event = new Event();
		event.type = stringToTypeEvent(eventName);
		event.text = (value != null ? value.asString() : "");
		listener.handleEvent(event);
	}

	/**
	 * Removes the specified text change listener.
	 *
	 * @param modifyListener
	 *            the listener which should no longer be notified
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void removeTextChangeListener(ITextChangeListener listener) {
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(TextChanged, listener);
	}

	/**
	 * Removes the specified modify listener.
	 *
	 * @param modifyListener
	 *            the listener which should no longer be notified
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void removeTextModifyListener(ITextModifyListener modifyListener) {
		checkWidget();
		if (modifyListener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.Modify, modifyListener);
	}

	/**
	 * Removes the specified save listener.
	 *
	 * @param modifyListener
	 *            the listener which should no longer be notified
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void removeTextSaveListener(ITextSaveListener iTextSaveListener) {
		checkWidget();
		if (iTextSaveListener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(Save, iTextSaveListener);
	}

	/**
	 * Removes the specified focus listener.
	 *
	 * @param modifyListener
	 *            the listener which should no longer be notified
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT when listener is null</li>
	 *                </ul>
	 */
	public void removeFocusListener(FocusListener focusListener) {
		checkWidget();
		if (focusListener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.FocusOut, listener);
		removeListener(SWT.FocusIn, listener);
	}

	@Override
	public void removeListener(int eventType, Listener listener) {
		boolean wasListening = isListening(eventType);
		super.removeListener(eventType, listener);
		boolean isListening = isListening(eventType);
		String remoteType = eventTypeToString(eventType);
		if (remoteType != null && wasListening && !isListening) {
			getRemoteObject().listen(remoteType, false);
		}
	}

	/**
	 * Get the event type string given its integer identifier
	 * 
	 * @param eventType
	 * @return
	 */
	String eventTypeToString(int eventType) {
		if (eventType == TextChanged)
			return ITextOperationConstants.EVENT_TEXT_CHANGED;
		if (eventType == Save)
			return ITextOperationConstants.EVENT_SAVE;
		if (eventType == SWT.Modify)
			return ITextOperationConstants.EVENT_MODIFY;
		if (eventType == SWT.FocusOut)
			return ITextOperationConstants.EVENT_FOCUS_OUT;
		if (eventType == SWT.FocusIn)
			return ITextOperationConstants.EVENT_FOCUS_IN;
		return null;
	}

	/**
	 * Get the event type given its String name
	 * 
	 * @param eventName
	 * @return
	 */
	int stringToTypeEvent(String eventName) {
		if (eventName.equals(ITextOperationConstants.EVENT_TEXT_CHANGED))
			return TextChanged;
		if (eventName.equals(ITextOperationConstants.EVENT_SAVE))
			return Save;
		if (eventName.equals(ITextOperationConstants.EVENT_MODIFY))
			return SWT.Modify;
		if (eventName.equals(ITextOperationConstants.EVENT_FOCUS_OUT))
			return SWT.FocusOut;
		if (eventName.equals(ITextOperationConstants.EVENT_FOCUS_IN))
			return SWT.FocusIn;
		return -1;
	}

	@Override
	public void dispose() {
		if (getRemoteObject() != null)
			getRemoteObject().destroy();
		super.dispose();
	}

	private JavaScriptLoader getJavaScriptLoader() {
		return RWT.getClient().getService(JavaScriptLoader.class);
	}

	private ResourceManager getResourceManager() {
		return RWT.getResourceManager();
	}

	/**
	 * Loads the JavaScript files
	 */
	private void loadClientResources() {
		for (int i = 0; i < getResources().size(); i++) {
			getJavaScriptLoader().require(getResourceManager().getLocation(getResources().get(i).toOSString()));
		}
	}

	/**
	 * Register the contributed JavaScript resources
	 */
	private void registerClientResources() {
		ResourceManager resourceManager = getResourceManager();
		boolean isRegistered = resourceManager.isRegistered(getResources().get(0).toOSString());
		if (!isRegistered) {
			try {
				for (IPath filePath : getResources()) {
					registerResource(resourceManager, filePath.toOSString());
				}
			} catch (IOException ioe) {
				throw new IllegalArgumentException("Failed to load resources", ioe);
			}
		}
	}

	/**
	 * Register JavaScript resource with the given <em>filePath</em>
	 * 
	 * @param resourceManager
	 * @param filePath
	 * @throws IOException
	 */
	private void registerResource(ResourceManager resourceManager, String filePath) throws IOException {
		System.out.println("[DSLFORGE] - Registering file: " + filePath);
		ClassLoader classLoader = getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(filePath);
		try {
			resourceManager.register(filePath, inputStream);
		} finally {
			inputStream.close();
		}
	}

	private ClassLoader getClassLoader() {
		ClassLoader classLoader = BasicText.class.getClassLoader();
		return classLoader;
	}

	/**
	 * Sets whether the widget content can be edited.
	 * </p>
	 *
	 * @param editable
	 *            if true content can be edited, if false content can not be
	 *            edited
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public void setEditable(boolean editable) {
		checkWidget();
	    this.style &= ~SWT.READ_ONLY;
	    if( !editable ) {
	      this.style |= SWT.READ_ONLY;
	    }
		getRemoteObject().set("editable", editable);
	    
	}

	@Override
	public void setLayout(Layout layout) {
		super.setLayout(layout);
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		getRemoteObject().set("font", getCssFont());
	}

	/**
	 * Sets the widget text. If <em>propagate</em> is true, the client is
	 * notified otherwise the setting is not propagated to the client. The
	 * latter is used to avoid infinite notification loop between the client and
	 * the server.
	 * 
	 * @param text
	 * @param propagate
	 */
	public void setText(String text, boolean propagate) {
		checkWidget();
		if (text == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.text = text;
		if (propagate)
			getRemoteObject().set("text", text);
	}

	/**
	 * Sets the widget text.
	 * 
	 * @param text
	 */
	public void setText(String text) {
		setText(text, true);
	}

	/**
	 * Sets the validation status
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		checkWidget();
		if (status == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.status = status;
		getRemoteObject().set("status", status);
	}
	
	/**
	 * Sets an annotation on the text widget
	 * 
	 * @param annotation
	 */
	public void setAnnotations(List<Annotation> annotations) {
		checkWidget();
		if (annotations == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.annotations = annotations;
		JsonArray array = new JsonArray();
		for (Annotation  a : annotations) {
			array.add(a.getValue());
		}
		getRemoteObject().set("annotations", array);
	}

	/**
	 * Sets the language scope
	 * 
	 * @param scope
	 */
	public void setLanguageScope(List<String> scope) {
		checkWidget();
		if (scope == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.scope = scope;
		JsonArray array = new JsonArray();
		for (String s : scope) {
			array.add(s);
		}
		getRemoteObject().set("scope", array);
	}

	void setDirty(boolean value) {
		isDirty=value;
	}
	
	/**
	   * Returns the editable state.
	   *
	   * @return whether or not the receiver is editable
	   *
	   * @exception SWTException <ul>
	   *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	   *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	   * </ul>
	   */
	  public boolean getEditable() {
	    checkWidget();
	    return (style & SWT.READ_ONLY) == 0;
	  }

	/**
	 * Get the text value
	 * 
	 * @return
	 */
	public String getText() {
		checkWidget();
		return text;
	}

	/**
	 * Get the validation status
	 * 
	 * @return
	 */
	public String getStatus() {
		checkWidget();
		return status;
	}

	/**
	 * Get the language scope
	 * 
	 * @return
	 */
	public List<String> getScope() {
		checkWidget();
		return scope;
	}

	/**
	 * Get the validation issue
	 * 
	 * @return
	 */
	public List<Annotation> getAnnotations() {
		checkWidget();
		return annotations;
	}

	/**
	 * Returns whether the widget is dirty
	 * @return
	 */
	public boolean isDirty() {
		checkWidget();
		return isDirty;
	}
	
	public void highlightRange() {
		int rowStart = 1;
		int columnStart = 1;
		int rowEnd = 2;
		int columnEnd = 5;
		TextRange range = new TextRange(rowStart, columnStart, rowEnd, columnEnd);
		addMarker(range,"ace_selected_word", "text");
	}

	private void addMarker(TextRange range, String string, String string2) {
		checkWidget();
		if (status == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		getRemoteObject().call("addMarker", null);
		
//		this.annotations = annotations;
//		JsonArray array = new JsonArray();
//		for (Annotation  a : annotations) {
//			array.add(a.getValue());
//		}
//		getRemoteObject().set("annotations", array);
	}

	/**
	 * Get the text font
	 * 
	 * @return
	 */
	private String getCssFont() {
		StringBuilder result = new StringBuilder();
		if (getFont() != null) {
			FontData data = getFont().getFontData()[0];
			result.append(data.getHeight());
			result.append("px ");
			result.append(data.getName());
		}
		return result.toString();
	}

	private RemoteObject getRemoteObject() {
		return remoteObject;
	}

	private void setRemoteObject(RemoteObject remoteObject) {
		this.remoteObject = remoteObject;
	}

	private List<IPath> getResources() {
		return resources;
	}

	/**
	 * Add the initial JavaScript files for setting up ACE editor
	 */
	void addClientResources() {
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/ace.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/theme-eclipse.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/ext-language_tools.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/ext-documentation.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/ext-tooltip.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/ext-searchbox.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/ace/snippets/text.js"));
		addJavaScriptResource(new Path("src-js/org/eclipse/rap/incubator/styledtext/global-index.js"));
	}

	/**
	 * Use this to add additional script files on startup
	 * 
	 * @param path
	 */
	void addJavaScriptResource(IPath path) {
		getResources().add(path);
	}


	/**
	 * Opens a RAP client/server connection.
	 */
	void createRemoteObject() {
		Connection connection = RWT.getUISession().getConnection();
		setRemoteObject(createRemoteObject(connection));
		getRemoteObject().setHandler(operationHandler);
		getRemoteObject().set("parent", WidgetUtil.getId(this));
	}
	
	/**
	 * Create a RAP Remote object which will handle the client/server interaction
	 */
	RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}

	/**
	 * Clients may trigger method calls on the server
	 * 
	 * @param method : the method to call
	 * @param properties : the method arguments
	 */
	void invoke(String method, JsonObject properties) {
		System.out.println("[BasicText] Invoking method " + method);
	}
}