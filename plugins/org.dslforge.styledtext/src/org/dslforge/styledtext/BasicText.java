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
package org.dslforge.styledtext;

import static org.eclipse.rap.rwt.RWT.getClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import org.apache.log4j.Logger;
import org.dslforge.styledtext.jface.ICompletionProposal;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.rap.json.JsonArray;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.ClientFileLoader;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.rap.rwt.widgets.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;

/**
 * A basic implementation of a styled text widget.
 */
public class BasicText extends Composite {

	private static final long serialVersionUID = 131001464693386296L;

	static final Logger logger = Logger.getLogger(BasicText.class);
	
	private static final String REMOTE_TYPE = "org.dslforge.styledtext.BasicText";
	private static final int TextChanged = 47;
	private static final int Save = 48;
	private static final int CaretEvent = 49;
	private static final int ContentAssist = 50;
	
	private static final String ACE_LIBRARY_KEY = "org.eclipse.rap.incubator.basictext.ace";
	private static final String ACE_LIBRARY_VALUE = "https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.6/ace.js";
	private static final String ACE_SEARCHBOX_KEY = "org.eclipse.rap.incubator.basictext.ace.ext-searchbox";
	private static final String ACE_SEARCHBOX_VALUE = "https://cdnjs.cloudflare.com/ajax/libs/ace/1.2.6/ext-searchbox.js";
	
	private final BasicTextOperationHandler operationHandler = new BasicTextOperationHandler(this);
	private RemoteObject remoteObject;
	private List<IPath> resources = new ArrayList<IPath>();
	private String url = "";
	private String status = "";
	private ITextSelection selection = TextSelection.emptySelection();
	private List<Annotation> annotations = new ArrayList<Annotation>();
	private List<String> scope = new ArrayList<String>();
	private List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
	private List<TextRange> markers = new ArrayList<TextRange>();
	private int style;
	private Listener listener;
	private String clipboard;
	private Position cursorPosition;
	private DefaultContent content;
	
	private class Position {
		private final int row;
		private final int column;
		public Position(int newRow, int newColumn) {
			this.row = newRow;
			this.column = newColumn;
		}
	}
	
	public class BasicTextListener implements Listener {

		private static final long serialVersionUID = 1L;

		EventListener eventListener;

		public BasicTextListener(EventListener listener) {
			this.eventListener = listener;
		}

		/**
		 * Process StyledText events by invoking the event's handler.
		 *
		 * @param e the event to handle
		 */
		public void handleEvent(Event e) {
			switch (e.type) {
			case SWT.Modify:
				ModifyEvent modifyEvent = new ModifyEvent(e);
				((ITextModifyListener) eventListener).handleTextModified(modifyEvent);
				break;
			case Save:
				TextSavedEvent textSavedEvent = new TextSavedEvent(e);
				((ITextSaveListener) eventListener).handleTextSaved(textSavedEvent);
				break;
			case TextChanged:
				TextChangedEvent textChangedEvent = new TextChangedEvent(e);
				((ITextChangeListener) eventListener).handleTextChanged(textChangedEvent);
				break;
			case ContentAssist:
				VerifyEvent verifyEvent = new VerifyEvent(e);
				((IContentAssistListener) eventListener).verifyKey(verifyEvent);
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
		createRemoteObject();
		installListeners();
		installDefaultContent();
		setupClient();
	}

	private void installDefaultContent() {
		content = new DefaultContent();
	}

	protected void loadJsResources(List<IPath> resources) {
		for (int i = 0; i < resources.size(); i++) {
			getJavaScriptLoader().requireJs(getResourceManager().getLocation(resources.get(i).toString()));
		}
	}

	protected void setupClient() {
		getClient().getService(ClientFileLoader.class).requireJs(System.getProperty(ACE_LIBRARY_KEY, ACE_LIBRARY_VALUE));
//		addBaseResource(new Path("org/dslforge/styledtext/ace/ace.js"));
		getClient().getService(ClientFileLoader.class).requireJs(System.getProperty(ACE_SEARCHBOX_KEY, ACE_SEARCHBOX_VALUE)); 
		addBaseResource(new Path("org/dslforge/styledtext/ace/ext-language_tools.js"));
		addBaseResource(new Path("org/dslforge/styledtext/ace/ext-tooltip.js"));
		addBaseResource(new Path("org/dslforge/styledtext/ace/theme-basic.js"));
		addBaseResource(new Path("org/dslforge/styledtext/global-index.js"));
		registerJsResources(getBaseResources(), BasicText.class.getClassLoader());
		loadJsResources(getBaseResources());
	}

	protected void registerJsResources(List<IPath> resources, ClassLoader loader) {
		ResourceManager resourceManager = getResourceManager();
		try {
			for (IPath filePath : resources) {
				boolean isRegistered = resourceManager.isRegistered(filePath.toString());
				if (!isRegistered) {
					logger.debug("Registering resource " + filePath.toString());
					registerResource(resourceManager, loader, filePath.toString());
				}
			}
		} catch (IOException ioe) {
			logger.error(ioe.getMessage(), ioe);
		}
	}

	/**
	 * Adds event listeners
	 */
	void installListeners() {

		listener = new Listener() {
			private static final long serialVersionUID = 1L;

			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Dispose:
					handleDispose(event);
					break;
				case SWT.MenuDetect:
					handleMenuDetect(event);
					break;
				case SWT.Modify:
					handleTextModify(event);
					break;
				case SWT.Selection:
					handleTextSelected(event);
					break;
				case SWT.FocusIn:
					handleFocusGained(event);
					break;
				case SWT.FocusOut:
					handleFocusLost(event);
					break;
				case TextChanged:
					handleTextChanged(event);
					break;
				case CaretEvent:
					handleCaretChanged(event);
					break;
				case Save:
					handleTextSave(event);
					break;
				case ContentAssist:
					handleContentAssist(event);
					break;
				}
			}
		};
		addListener(SWT.Dispose, listener);
		addListener(SWT.MenuDetect, listener);
		addListener(SWT.FocusIn, listener);
		addListener(SWT.FocusOut, listener);
		addListener(SWT.Selection, listener);
		addListener(CaretEvent, listener);
	}

	protected void handleCaretChanged(Event event) {
		JsonObject data = (JsonObject) event.data;
		if (data != null && data instanceof JsonObject) {
			JsonObject position = (JsonObject) data.get("value");
			if (position.get("row") != null) {
				int row = position.get("row").asInt();
				int column = position.get("column").asInt();
				this.cursorPosition = new Position(row, column);
			}
		}
	}

	protected void handleTextSelected(Event event) {
		JsonObject coordinates = (JsonObject) event.data;
		int rowStart =  coordinates.get("rowStart").asInt();
		int rowEnd = coordinates.get("rowEnd").asInt();
		int columnStart = coordinates.get("columnStart").asInt();
		int columnEnd = coordinates.get("columnEnd").asInt();
		int startOffset = getOffsetAtPosition(rowStart, columnStart);
		int endOffset = getOffsetAtPosition(rowEnd, columnEnd);
		int length = endOffset - startOffset;
		this.selection = new TextSelection(startOffset, length);
	}

	/**
	 * Handles a text modify event
	 * 
	 * @param event
	 */
	void handleTextModify(Event event) {
		if (event.text != null) {
			content.setText(event.text);
		}
		notifyListeners(TextChanged, event);
	}

	/**
	 * Handles a text changed event.
	 * 
	 * @param event
	 */
	void handleTextChanged(Event event) {
		notifyListeners(SWT.Modify, event);
		notifyListeners(TextChanged, event);
	}
	
	/**
	 * Handles a text save event
	 * 
	 * @param event
	 */
	void handleTextSave(Event event) {
		if (event.text != null) {
			setText(event.text, false);
		}
		notifyListeners(Save, event);
	}

	/**
	 * Handles a text save event
	 * 
	 * @param event
	 */
	void handleContentAssist(Event event) {
		if (event.text != null) {
			setText(event.text, false);
		}
		notifyListeners(ContentAssist, event);
	}
	/**
	 * Handles a menu detect event
	 * 
	 * @param event
	 */
	void handleMenuDetect(Event event) {
		// do nothing by default.
	}

	/**
	 * Handles a focus gained event
	 * 
	 * @param event
	 */
	void handleFocusGained(Event event) {
		JsonObject data = (JsonObject) event.data;
		if (data != null && data instanceof JsonObject) {
			JsonObject position = (JsonObject) data.get("value");
			int row = position.get("row").asInt();
			int column = position.get("column").asInt();
			this.cursorPosition = new Position(row, column);
		}
	}
	
	/**
	 * Handles a focus lost event
	 * 
	 * @param event
	 */
	void handleFocusLost(Event event) {
		if (event.text != null) {
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
		content = null;
		listener = null;
	}

	/**
	 * Called by StyledText to add itself as an Observer to content changes.
	 *
	 * @param listener
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
	public void addTextChangeListener(ITextChangeListener listener) {
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(TextChanged, typedListener);
	}

	/**
	 * Adds a modify listener. A Modify event is sent by the widget when the
	 * widget text has changed.
	 *
	 * @param listener
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
	public void addTextModifyListener(ITextModifyListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(SWT.Modify, typedListener);
	}

	/**
	 * Adds a save listener. A Text save event is sent by the widget when the
	 * client emits a save request.
	 *
	 * @param listener
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
	public void addTextSaveListener(ITextSaveListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(Save, typedListener);
	}

	/**
	 * Adds a focus listener.
	 *
	 * @param listener
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
	public void addFocusListener(FocusListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(SWT.FocusOut, typedListener);
		addListener(SWT.FocusIn, typedListener);
	}
	
	/**
	 * Adds a content assist listener.
	 *
	 * @param listener
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
	public void addContentAssistListener(IContentAssistListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		BasicTextListener typedListener = new BasicTextListener(listener);
		addListener(ContentAssist, typedListener);
	}

	@Override
	public void addListener(int eventType, Listener listener) {
		boolean wasListening = isListening(eventType);
		super.addListener(eventType, listener);
		boolean isListening = isListening(eventType);
		String remoteType = eventTypeToString(eventType);
		if (remoteType != null && !wasListening && isListening) {
			getRemoteObject().listen(remoteType, true);
		}
	}

	/**
	 * Notifies listeners when events are sent from the client.
	 * 
	 * @param eventName
	 * @param properties
	 */
	public void notifyListeners(String eventName, JsonObject properties) {
		JsonValue value = properties.get("value");
		Event event = new Event();
		event.type = stringToTypeEvent(eventName);
		event.text = (value != null && value.isString() ? value.asString() : "");
		event.data = properties;		
		listener.handleEvent(event);
	}

	/**
	 * Removes the specified text change listener.
	 *
	 * @param listener
	 *            the listener
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
	 * @param listener
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
	public void removeTextModifyListener(ITextModifyListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.Modify, listener);
	}

	/**
	 * Removes the specified save listener.
	 *
	 * @param listener
	 *            the listener which should no longer be notified
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
	public void removeTextSaveListener(ITextSaveListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(Save, listener);
	}

	/**
	 * Removes the specified focus listener.
	 *
	 * @param focusListener
	 *            the listener which should no longer be notified
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
	public void removeFocusListener(FocusListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.FocusOut, listener);
		removeListener(SWT.FocusIn, listener);
	}

	/**
	 * Removes the specified content assist listener.
	 *
	 * @param listener
	 *            the listener which should no longer be notified
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
	public void removeContentAssistListener(IContentAssistListener listener) {
		checkWidget();
		if (listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		removeListener(ContentAssist, listener);
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
	 * @return the string identifier of the event type
	 */
	String eventTypeToString(int eventType) {
		if (eventType == TextChanged)
			return ITextOperationConstants.EVENT_TEXT_CHANGED;
		if (eventType == CaretEvent)
			return ITextOperationConstants.EVENT_CARET_CHANGED;
		if (eventType == Save)
			return ITextOperationConstants.EVENT_SAVE;
		if (eventType == ContentAssist)
			return ITextOperationConstants.EVENT_CONTENT_ASSIST;
		if (eventType == SWT.Modify)
			return ITextOperationConstants.EVENT_MODIFY;
		if (eventType == SWT.FocusOut)
			return ITextOperationConstants.EVENT_FOCUS_OUT;
		if (eventType == SWT.FocusIn)
			return ITextOperationConstants.EVENT_FOCUS_IN;
		if (eventType == SWT.Selection)
			return ITextOperationConstants.EVENT_SELECTION;
		return null;
	}

	/**
	 * Get the event type given its String identifier
	 * 
	 * @param eventName
	 * @return the integer identifier of the event
	 */
	int stringToTypeEvent(String eventName) {
		if (eventName.equals(ITextOperationConstants.EVENT_TEXT_CHANGED))
			return TextChanged;
		if (eventName.equals(ITextOperationConstants.EVENT_CARET_CHANGED))
			return CaretEvent;
		if (eventName.equals(ITextOperationConstants.EVENT_SAVE))
			return Save;
		if (eventName.equals(ITextOperationConstants.EVENT_CONTENT_ASSIST))
			return ContentAssist;
		if (eventName.equals(ITextOperationConstants.EVENT_MODIFY))
			return SWT.Modify;
		if (eventName.equals(ITextOperationConstants.EVENT_FOCUS_OUT))
			return SWT.FocusOut;
		if (eventName.equals(ITextOperationConstants.EVENT_FOCUS_IN))
			return SWT.FocusIn;
		if (eventName.equals(ITextOperationConstants.EVENT_SELECTION))
			return SWT.Selection;
		return -1;
	}

	@Override
	public void dispose() {
		if (getRemoteObject() != null)
			getRemoteObject().destroy();
		super.dispose();
	}

	/**
	 * Returns the JavaScript loader responsible for loading JavaScript files at runtime
	 * 
	 * @return the JavaScript loader
	 */
	private ClientFileLoader getJavaScriptLoader() {
		return RWT.getClient().getService(ClientFileLoader.class);
	}

	/**
	 * Returns the instance of the resource manager for the current application context.
	 * 
	 * @return the resource manager
	 */
	private ResourceManager getResourceManager() {
		return RWT.getResourceManager();
	}

	/**
	 * Register JavaScript resource with the given <em>filePath</em>
	 * 
	 * @param resourceManager
	 * @param filePath
	 * @throws IOException
	 */
	private void registerResource(ResourceManager resourceManager, ClassLoader classLoader, String filePath) throws IOException {
		logger.debug("Registering file: " + filePath);
		InputStream inputStream = classLoader.getResourceAsStream(filePath);
		try {
			resourceManager.register(filePath, inputStream);
		} finally {
			inputStream.close();
		}
	}

	/**
	 * Returns the widget class loader
	 * 
	 * @return the widget class loader
	 */
	protected ClassLoader getClassLoader() {
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
		if (!editable) {
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
		content.setText(text);
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
	 * Sets the file URL associated to the widget
	 * 
	 * @param status
	 */
	public void setURL(String url) {
		checkWidget();
		if (url == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.url = url;
		getRemoteObject().set("url", url);
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
		for (Annotation a : annotations) {
			array.add(a.getValue());
		}
		getRemoteObject().set("annotations", array);
	}

	/**
	 * Sets the language scope
	 * 
	 * @param scope
	 */
	public void setScope(List<String> scope) {
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

	/**
	 * Sets the content assist proposals
	 * 
	 * @param proposals
	 */
	public void setProposals(List<ICompletionProposal> proposals) {
		checkWidget();
		if (proposals == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.proposals = proposals;
		JsonArray values = new JsonArray();
		for (ICompletionProposal proposal : proposals) {
			JsonObject value = new JsonObject();
			value.add("display", proposal.getDisplayString());
			value.add("replacement", proposal.getReplacementString());
			value.add("type", proposal.getAdditionalProposalInfo());
			values.add(value);
		}
		getRemoteObject().set("proposals", values);
	}
	
	/**
	 * Adds a marker for the given text range
	 * 
	 * @param text range
	 */
	public void addMarker(TextRange range) {
		checkWidget();
		if (range == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.markers.add(range);
		
		JsonObject properties = new JsonObject();
		properties.add("rowStart", range.rowStart);
		properties.add("columnStart", range.columnStart);
		properties.add("rowEnd", range.rowEnd);
		properties.add("columnEnd", range.columnEnd);
		getRemoteObject().call("addMarker", properties);
	}
	
	/**
	 * Removes a marker for the given text range
	 * 
	 * @param text range
	 */
	public void removeMarker(TextRange range) {
		checkWidget();
		if (range == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.markers.remove(range);
		
		JsonObject properties = new JsonObject();
		properties.add("rowStart", range.rowStart);
		properties.add("columnStart", range.columnStart);
		properties.add("rowEnd", range.rowEnd);
		properties.add("columnEnd", range.columnEnd);
		getRemoteObject().call("removeMarker", properties);
	}
	
	/**
	 * Clears all the markers
	 */
	public void clearMarkers() {
		checkWidget();
		this.markers.clear();
		JsonObject properties = new JsonObject();
		getRemoteObject().call("clearMarkers", properties);
	}

	/**
	 * Sets markers for the given text ranges
	 * 
	 * @param text ranges
	 */
	public void setMarkers(List<TextRange> ranges) {
		checkWidget();
		if (ranges == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.markers = ranges;
		JsonArray values = new JsonArray();
		for (TextRange range : ranges) {
			values.add(range.getValue());
		}
		getRemoteObject().set("markers", values);
	}

	/**
	 * Sets the receiver's background color to the color specified by the
	 * argument, or to the default system color for the control if the argument
	 * is null.
	 *
	 * @param color
	 *            the new color (or null)
	 *
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_INVALID_ARGUMENT - if the argument has been
	 *                disposed</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public void setBackground(Color color) {
		checkWidget();
		JsonObject properties = new JsonObject();
		properties.add("R", color.getRed());
		properties.add("G", color.getGreen());
		properties.add("B", color.getBlue());
		getRemoteObject().set("background", properties);
	}
	
	/**
	 * Set the maximum content length 
	 * 
	 * @param maxContentLength
	 */
	public void setMaxLength(int maxContentLength) {
		checkWidget();
		JsonValue object = JsonValue.valueOf(maxContentLength);
		getRemoteObject().set("maxLength", object);
	}
	
	/**
	 * Sets the selection to the specified text range identified by offset/length
	 * 
	 * @param offset the offset of the selection
	 * @param length the length of the selection
	 */
	public void setSelection(int offset, int length) {
		checkWidget();
		this.selection = (offset >= 0 && length >= 0) ? new TextSelection(offset, length)
				: TextSelection.emptySelection();
		final int rowStart = getLineAtOffset(offset);
		final int rowEnd = getLineAtOffset(offset+length);
		final int columnStart = offset - getOffsetAtLine(rowStart);
		final int columnEnd = (offset+length) - getOffsetAtLine(rowEnd);
		TextRange range = new TextRange(rowStart, columnStart,rowEnd, columnEnd);
		JsonObject properties = new JsonObject();
		properties.add("rowStart", range.rowStart);
		properties.add("columnStart", range.columnStart);
		properties.add("rowEnd", range.rowEnd);
		properties.add("columnEnd", range.columnEnd);
		getRemoteObject().call("setSelection", properties);
	}
	/**
	 * Sets the selection to the specified text range identified by row/column
	 * 
	 * @param rowStart
	 * @param rowEnd
	 * @param columnStart
	 * @param columnEnd
	 */
	public void setSelection(int rowStart, int rowEnd, int columnStart,  int columnEnd) {
		checkWidget();
		TextRange range = new TextRange(rowStart, columnStart,rowEnd, columnEnd);
		JsonObject properties = new JsonObject();
		properties.add("rowStart", range.rowStart);
		properties.add("columnStart", range.columnStart);
		properties.add("rowEnd", range.rowEnd);
		properties.add("columnEnd", range.columnEnd);
		getRemoteObject().call("setSelection", properties);
	}
	
	/**
	 * Selects all the text in the widget.
	 */
	public void selectAll() {
		checkWidget();		
		getRemoteObject().call("selectAll", new JsonObject());
	}


	/**
	 * Returns the current text selection
	 * 
	 * @return the text selection
	 */
	public ITextSelection getSelection() {
		checkWidget();
		if (selection!=null)
			return selection;
		return TextSelection.emptySelection();
	}

	/**
	 * Returns the editable state.
	 *
	 * @return whether or not the receiver is editable
	 *
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public boolean getEditable() {
		checkWidget();
		return (style & SWT.READ_ONLY) == 0;
	}

	/**
	 * Get the text value
	 * 
	 * @return the text value
	 */
	public String getText() {
		checkWidget();
		return content.getTextRange(0, getCharCount());
	}

	/**
	 * Get the resource URL
	 * 
	 * @return the URL value
	 */
	public String getURL() {
		checkWidget();
		return url;
	}
	
	/**
	 * Get the validation status
	 * 
	 * @return the validation status
	 */
	public String getStatus() {
		checkWidget();
		return status;
	}

	/**
	 * Get the language scope
	 * 
	 * @return the language scope
	 */
	public List<String> getScope() {
		checkWidget();
		return scope;
	}
	
	/**
	 * Get the content assist proposals
	 * 
	 * @return the content assist proposals
	 */
	public List<ICompletionProposal> getProposals() {
		checkWidget();
		return proposals;
	}

	/**
	 * Get the current annotations
	 * 
	 * @return the current annotations
	 */
	public List<Annotation> getAnnotations() {
		checkWidget();
		return annotations;
	}

	/**
	 * Get the current markers
	 * 
	 * @return the current markers
	 */
	public List<TextRange> getMarkers() {
		checkWidget();
		return markers;
	}

	/**
	 * Get the text font
	 * 
	 * @return the text font
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

	/**
	 * Returns the remote object which manages the communication with the client
	 * 
	 * @return the remote object
	 */
	protected RemoteObject getRemoteObject() {
		return remoteObject;
	}

	/**
	 * Sets the handle of the remote object
	 * 
	 * @param remoteObject
	 */
	protected void setRemoteObject(RemoteObject remoteObject) {
		this.remoteObject = remoteObject;
	}

	/**
	 * Returns the path list of the base widget resources
	 * 
	 * @return the paths of the base widget resources
	 */
	protected List<IPath> getBaseResources() {
	 	return resources;
	}

	/**
	 * Use this to add additional script files on startup
	 * 
	 * @param path
	 */
	protected void addBaseResource(IPath path) {
		getBaseResources().add(path);
	}

	/**
	 * Opens a client/server connection.
	 */
	void createRemoteObject() {
		Connection connection = RWT.getUISession().getConnection();
		setRemoteObject(createRemoteObject(connection));
		getRemoteObject().setHandler(operationHandler);
		getRemoteObject().set("parent", WidgetUtil.getId(this));
	}

	/**
	 * Create a RAP Remote object which will handle the client/server
	 * interaction
	 */
	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}

	/**
	 * Clients may trigger method calls on the server
	 * 
	 * @param method
	 *            : the method to call
	 * @param properties
	 *            : the method arguments
	 */
	protected void invoke(String method, JsonObject properties) {
		if (method.equals("getProposals")) {
			Event event = new Event();
			event.data = properties;
			handleContentAssist(event);
		}
	}

	/**
	 * Performs a copy to the clip board of the given string
	 * 
	 * @param toCopy
	 */
	public void copy(String toCopy) {
		this.clipboard = toCopy;
	}

	/**
	 * Performs a paste from the clip board to the text widget
	 */
	public void paste() {
		JsonObject properties = new JsonObject();
		properties.add("rowStart", this.cursorPosition.row);
		properties.add("columnStart", this.cursorPosition.column);
		properties.add("text", this.clipboard);
		getRemoteObject().call("insertText", properties);
	}
	
	/**
	 * Returns the current cursor position
	 * 
	 * @return the cursor position
	 */
	public Position getCursorPosition() {
		return cursorPosition;
	}

	/**
	 * Cuts the text identified by the text selection
	 * 
	 * @param selection
	 */
	public void cut(TextSelection selection) {
		checkWidget ();
		if ((style & SWT.READ_ONLY) != 0) return;
		this.clipboard = selection.getText();
		JsonObject properties = new JsonObject();
		properties.add("rowStart", this.cursorPosition.row);
		properties.add("columnStart", this.cursorPosition.column);
		properties.add("text", this.clipboard);
		getRemoteObject().call("removeText", properties);
	}

	/**
	 * Converts a row/column position to an offset
	 * 
	 * @param row
	 * @param column
	 * @return the equivalent offset
	 */
	public int getOffsetAtPosition(int row, int column) {
		int offsetAtLine = content.getOffsetAtLine(row);
		int offset=offsetAtLine + column;
		logger.debug("getOffsetAtPosition [row: " + row + ", column : " + column + "] => offset: "+ offset);
		return offset;
	}

	/**
	 * Returns the logical offset of the given line.
	 * 
	 * @param row index of line
	 */
	public int getOffsetAtLine(int row) {
		int offsetAtLine = content.getOffsetAtLine(row);
		return offsetAtLine;
	}

	
	/**
	 * Returns the current cursor position as an offset
	 * 
	 * @return
	 */
	public int getOffsetAtCursorPosition() {
		Position position = getCursorPosition();
		return getOffsetAtPosition(position.row, position.column);
	}
	
	/**
	 * Gets the number of characters.
	 *
	 * @return number of characters in the widget
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 */
	public int getCharCount() {
		checkWidget();
		return content.getCharCount();
	}
	
	/**
	 * Returns the line at the given line index without delimiters.
	 * Index 0 is the first line of the content. When there are not
	 * any lines, getLine(0) is a valid call that answers an empty string.
	 * <p>
	 *
	 * @param lineIndex index of the line to return.
	 * @return the line text without delimiters
	 * 
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 * @exception IllegalArgumentException <ul>
	 *   <li>ERROR_INVALID_RANGE when the line index is outside the valid range (< 0 or >= getLineCount())</li> 
	 * </ul>
	 * @since 3.4
	 */
	public String getLine(int lineIndex) {
		checkWidget();
		if (lineIndex < 0 || 
			(lineIndex > 0 && lineIndex >= content.getLineCount())) {
			SWT.error(SWT.ERROR_INVALID_RANGE);		
		}
		return content.getLine(lineIndex);
	}
	
	/**
	 * Returns the line at the specified offset in the text
	 * where 0 &lt; offset &lt; getCharCount() so that getLineAtOffset(getCharCount())
	 * returns the line of the insert location.
	 *
	 * @param offset offset relative to the start of the content.
	 * 	0 <= offset <= getCharCount()
	 * @return line at the specified offset in the text
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 * @exception IllegalArgumentException <ul>
	 *   <li>ERROR_INVALID_RANGE when the offset is outside the valid range (< 0 or > getCharCount())</li> 
	 * </ul>
	 */
	public int getLineAtOffset(int offset) {
		checkWidget();
		if (offset < 0 || offset > getCharCount()) {
			SWT.error(SWT.ERROR_INVALID_RANGE);
		}
		return content.getLineAtOffset(offset);
	}
	
	/** 
	 * Gets the number of text lines.
	 *
	 * @return the number of lines in the widget
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 */
	public int getLineCount() {
		checkWidget();
		return content.getLineCount();
	}
	
	/**
	 * Returns the line delimiter used for entering new lines by key down
	 * or paste operation.
	 *
	 * @return line delimiter used for entering new lines by key down
	 * or paste operation.
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 */
	public String getLineDelimiter() {
		checkWidget();
		return content.getLineDelimiter();
	}

	/**
	 * Returns whether the given offset is inside a multi byte line delimiter.
	 * Example: 
	 * "Line1\r\n" isLineDelimiter(5) == false but isLineDelimiter(6) == true
	 * 
	 * @return true if the given offset is inside a multi byte line delimiter.
	 * false if the given offset is before or after a line delimiter.
	 */
	boolean isLineDelimiter(int offset) {
		int line = content.getLineAtOffset(offset);
		int lineOffset = content.getOffsetAtLine(line);	
		int offsetInLine = offset - lineOffset;
		// offsetInLine will be greater than line length if the line 
		// delimiter is longer than one character and the offset is set
		// in between parts of the line delimiter.
		return offsetInLine > content.getLine(line).length();
	}
	
	/**
	 * Moves the caret in front of the first character of the widget content.
	 */
	public void doContentStart() {
		JsonObject properties = new JsonObject();
		getRemoteObject().call("moveCursorFileStart", properties);
	}
	
	/**
	 * Moves the caret after the last character of the widget content.
	 */
	public void doContentEnd() {
		JsonObject properties = new JsonObject();
		getRemoteObject().call("moveCursorFileEnd", properties);
	}
}