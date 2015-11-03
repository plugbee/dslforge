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
package org.dslforge.xtext.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import org.eclipse.rap.json.JsonArray;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.remote.AbstractOperationHandler;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.OperationHandler;
import org.eclipse.rap.rwt.remote.RemoteObject;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.rap.rwt.widgets.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;


@SuppressWarnings("serial")
public class BasicText extends Composite {
	
	private static final String REMOTE_TYPE = "org.dslforge.xtext.common.BasicText";
	
	private final String BASE_PATH = "src-js/org/dslforge/xtext/common/";
	private final String ACE_PATH = "src-js/org/dslforge/xtext/common/ace/";
	private final String ANTLR_PATH = "src-js/org/dslforge/xtext/common/antlr/";
	private final String TEMPLATE_PATH = "src-js/org/dslforge/xtext/common/ace/snippets/";
	
	private List<String> aceFiles = new ArrayList<String>();
	private List<String> antlrFiles = new ArrayList<String>();
	
	private RemoteObject remoteObject;
	
	private String url = "";
	private String text = "";
	private String status = "";
	private String command = "";
	private String issue = "";
	private List<String> scope = new ArrayList<String>();

	public BasicText(Composite parent, int style) {
		super(parent, style);
		initAce();
		initAntlr();
		registerResources();
		loadJavaScript();
		createConnection();
	}

	protected void initAce() {
		getAceFiles().add("ace.js");
		getAceFiles().add("ext-language_tools.js");
	}
	
	protected void initAntlr() {
		getAntlrFiles().add("antlr-all-min.js");
	}

	protected void createConnection() {
		Connection connection = RWT.getUISession().getConnection();
		setRemoteObject(createRemoteObject(connection));
		getRemoteObject().setHandler(operationHandler);
		getRemoteObject().set("parent", WidgetUtil.getId(this));
		getRemoteObject().listen("Set", true);
		getRemoteObject().listen("Notify", true);
		getRemoteObject().listen("Modify", true);
		getRemoteObject().listen("Call", true);
	}

	protected RemoteObject createRemoteObject(Connection connection) {
		return connection.createRemoteObject(REMOTE_TYPE);
	}
	
	private final OperationHandler operationHandler = new AbstractOperationHandler() {
		@Override
		public void handleSet(JsonObject properties) {
			JsonValue command = properties.get("command");
			if (command!=null) {
				if (command.asString().equals(IWidgetConstants.COMMAND_SAVE)) {
					JsonValue textValue = properties.get("text");
					if (textValue != null) {
						System.out.println("Text: " + textValue);
						text = textValue.asString();
						executeSaveRequest(textValue);
					}
				} else {
					JsonValue textValue = properties.get("text");
					text = textValue.asString();
					executeValidateRequest(textValue);
				}
			}
		}
			
		@Override
		public void handleNotify(String event, JsonObject properties) {
			System.out.println("got notification");
		}
		
		@Override
		public void handleCall(String method, JsonObject properties) {
			JsonValue textValue = properties.get("text");
			if (textValue != null) {
				System.out.println("Text: " + textValue);
			}
		}
	};
	
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

	private String eventTypeToString(int eventType) {
		return "Modify";
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

	protected JavaScriptLoader getJavaScriptLoader() {
		JavaScriptLoader jsLoader = RWT.getClient().getService(JavaScriptLoader.class);
		return jsLoader;
	}
	
	protected ResourceManager getResourceManager() {
		ResourceManager resourceManager = RWT.getResourceManager();
		return resourceManager;
	}
	
	protected void loadJavaScript() {
		JavaScriptLoader jsLoader = getJavaScriptLoader();
		ResourceManager resourceManager = getResourceManager();
		
		loadGlobalIndexScripts(jsLoader, resourceManager);
		
		loadAceScripts(jsLoader, resourceManager);		
		
		loadTemplateScripts(jsLoader, resourceManager);
		
		loadAntlrScripts(jsLoader, resourceManager);

	}
	
	protected void loadTemplateScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		// TODO Auto-generated method stub
	}

	protected void loadGlobalIndexScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		jsLoader.require(resourceManager.getLocation(getBasePath() + "global-index.js"));		
	}
	
	protected void loadAceScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		for (int i=0; i<getAceFiles().size();i++) {
			jsLoader.require(resourceManager.getLocation(getAcePath() + getAceFiles().get(i)));		
		}
	}
	
	protected void loadAntlrScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		for (int i=0; i< getAntlrFiles().size();i++) {
		    jsLoader.require(resourceManager.getLocation(getAntlrPath() + getAntlrFiles().get(i)));
		}
	}

	protected void registerResources() {
		ResourceManager resourceManager = getResourceManager();
		boolean isRegistered = resourceManager.isRegistered(getAceFiles().get(0));
		if (!isRegistered) {
			try {
				
				registerGlobalIndexResources(resourceManager);
				
				registerAceResources(resourceManager);
				
				registerTemplateResources(resourceManager);
				
				registerAntlrResources(resourceManager);
				
			} catch (IOException ioe) {
				throw new IllegalArgumentException("Failed to load resources", ioe);
			}
		}
	}

	protected void register(ResourceManager resourceManager, String fileName, String path)
			throws IOException {
		System.out.println("[DSLFORGE] - Registering file: "+ path + fileName);
		ClassLoader classLoader = getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(path + fileName);
		try {
			resourceManager.register(path + fileName, inputStream);
		} finally {
			inputStream.close();
		}
	}

	protected void registerAntlrResources(ResourceManager resourceManager) throws IOException {
		for (String fileName : getAntlrFiles()) {
			register(resourceManager, fileName, getAntlrPath());
		}
	}

	protected void registerTemplateResources(ResourceManager resourceManager) throws IOException {
		//Nothing to do here.
	}
	
	protected void registerGlobalIndexResources(ResourceManager resourceManager) throws IOException {
		register(resourceManager, "global-index.js", getBasePath());
	}
	
	protected void registerAceResources(ResourceManager resourceManager) throws IOException {
		for (String fileName : getAceFiles()) {
			register(resourceManager, fileName, getAcePath());
		}
	}

	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = BasicText.class.getClassLoader();
		return classLoader;
	}

	@Override
	public void setLayout(Layout layout) {
		super.setLayout(layout);
	}

	@Override
	public void dispose() {
		super.dispose();
		if (getRemoteObject()!=null)
			getRemoteObject().destroy();
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		getRemoteObject().set("font", getCssFont());
	}
	
	public void setText(String text) {
		checkWidget();
		if (text == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.text = text;
		getRemoteObject().set("text", text);
	}

	public void setCommand(String command) {
		checkWidget();
		if (command == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.command = command;
		getRemoteObject().set("command", command);
	}
	
	public void setStatus(String status) {
		checkWidget();
		if (status == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.status = status;
		getRemoteObject().set("status", status);
	}

	public void setIssue(JsonObject issue) {
		checkWidget();
		if (issue == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		JsonValue jsonValue = issue.get("info");
		if (jsonValue!=null)
			this.issue = jsonValue.asString();
		getRemoteObject().set("issue", issue);
	}
	
	@Deprecated
	public void setIssue(String issue) {
		checkWidget();
		if (issue == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.issue = issue;
		getRemoteObject().set("issue", issue);
	}

	public void setUrl(String url) {
		checkWidget();
		if (url == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.url = url;
		getRemoteObject().set("url", url);
	}

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

	public String getText() {
		checkWidget();
		return text;
	}

	public String getStatus() {
		checkWidget();
		return status;
	}

	public String getCommand() {
		checkWidget();
		return command;
	}
	
	public String getUrl() {
		checkWidget();
		return url;
	}

	public List<String> getScope() {
		checkWidget();
		return scope;
	}

	public String getIssue() {
		checkWidget();
		return issue;
	}

	public String getCssFont() {
		StringBuilder result = new StringBuilder();
		if (getFont() != null) {
			FontData data = getFont().getFontData()[0];
			result.append(data.getHeight());
			result.append("px ");
			result.append(data.getName());
		}
		return result.toString();
	}

	public interface IRequestListener extends EventListener {
		//nothing at this level
	}
	
	public interface IValidateRequestListener extends IRequestListener {
		void reparse(JsonValue value);
		void validateResource();
	}	
	
	public interface ISaveRequestListener extends IValidateRequestListener {
		void save(JsonValue value);
	}
	
	private final List<IRequestListener> listeners = new ArrayList<IRequestListener>();
	
	public void addSaveListener(ISaveRequestListener list) {
		listeners.add(list);
	}

	public void removeSaveListener(ISaveRequestListener list) {
		listeners.remove(list);
	}

	public void addValidationListener(IValidateRequestListener list) {
		listeners.add(list);
	}

	public void removeValidationListener(IValidateRequestListener list) {
		listeners.remove(list);
	}
	
	protected void executeValidateRequest(JsonValue value) {		
		for (IRequestListener listener : listeners){
			if (listener instanceof IValidateRequestListener) {
				((IValidateRequestListener) listener).reparse(value);
				((IValidateRequestListener) listener).validateResource();
			}
		}
	}
	
	protected void executeSaveRequest(JsonValue value) {		
		for (IRequestListener listener : listeners){
			if (listener instanceof ISaveRequestListener) {
				((ISaveRequestListener)listener).reparse(value);
				((ISaveRequestListener)listener).save(value);
			}
		}
	}
	
	protected RemoteObject getRemoteObject() {
		return remoteObject;
	}

	protected void setRemoteObject(RemoteObject remoteObject) {
		this.remoteObject = remoteObject;
	}
	
	protected String getBasePath() {
		return BASE_PATH;
	}

	protected String getAcePath() {
		return ACE_PATH;
	}

	protected String getAntlrPath() {
		return ANTLR_PATH;
	}
	
	protected String getTemplatePath() {
		return TEMPLATE_PATH;
	}
	
	protected List<String> getAceFiles() {
		return aceFiles;
	}

	protected List<String> getAntlrFiles() {
		return antlrFiles;
	}
}