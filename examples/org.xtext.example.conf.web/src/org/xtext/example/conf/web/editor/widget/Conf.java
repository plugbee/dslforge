/*******************************************************************************
 * Copyright (c) 2013 DSLFORGE.
 ******************************************************************************/
package org.xtext.example.conf.web.editor.widget;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.dslforge.rap.xtext.common.BasicText;
import org.eclipse.rap.json.JsonObject;
import org.eclipse.rap.json.JsonValue;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.client.service.JavaScriptLoader;
import org.eclipse.rap.rwt.lifecycle.WidgetUtil;
import org.eclipse.rap.rwt.remote.AbstractOperationHandler;
import org.eclipse.rap.rwt.remote.Connection;
import org.eclipse.rap.rwt.remote.OperationHandler;
import org.eclipse.rap.rwt.service.ResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;

public class Conf extends BasicText {

	private static final long serialVersionUID = 1L;

	public static final String REMOTE_TYPE = "org.xtext.example.conf.web.editor.widget.Conf";
	
	protected static final String BASE_PATH = "src-js/org/xtext/example/conf/web/";
	
	protected static final String ANTLR_PATH = "src-js/org/xtext/example/conf/web/parser/";
	
	protected List<String> aceFiles = new ArrayList<String>();
	
	protected List<String> antlrFiles = new ArrayList<String>();
	
	private String text = "";

	private String command = "";
	
	public Conf(Composite parent, int style) {
		super(parent, style);
		initAce();
		initAntlr();
		registerResources();
		loadJavaScript();
		createConnection();
		setStatus("edit");
	}
	
	protected void initAce() {
		aceFiles.add("ace/ace.js");
		aceFiles.add("ace/theme-eclipse.js");
		aceFiles.add("ace/ext-language_tools.js");
		aceFiles.add("ace/worker-conf.js");
		aceFiles.add("ace/mode-conf.js");
		aceFiles.add("global-index.js");
	}
	
	protected void initAntlr() {
		antlrFiles.add("antlr-all-min.js");
		antlrFiles.add("InternalConfParser.js");
		antlrFiles.add("InternalConfLexer.js");
	}
	
	@SuppressWarnings("serial")
	private final OperationHandler operationHandler = new AbstractOperationHandler() {
		@Override
		public void handleSet(JsonObject properties) {
			JsonValue textValue = properties.get("text");
			if (textValue != null) {
				text = textValue.asString();
				fireEvent(textValue);
			}
//			JsonValue commandValue = properties.get("command");
//			if (commandValue != null && commandValue.asString().equals("save")) {
//				fireEvent(commandValue);
//			}
		}
	};

	protected void createConnection() {
		Connection connection = RWT.getUISession().getConnection();
		remoteObject = connection.createRemoteObject(REMOTE_TYPE);
		remoteObject.setHandler(operationHandler);
		remoteObject.set("parent", WidgetUtil.getId(this));
	}
	
	protected void loadJavaScript() {
		//System.out.println("[dslforge] - Loading javascript files");
		JavaScriptLoader jsLoader = getJavaScriptLoader();
		ResourceManager resourceManager = getResourceManager();
		loadAceScripts(jsLoader, resourceManager);
		loadAntlrScripts(jsLoader, resourceManager);
	}

	protected JavaScriptLoader getJavaScriptLoader() {
		JavaScriptLoader jsLoader = RWT.getClient().getService(JavaScriptLoader.class);
		return jsLoader;
	}

	protected ResourceManager getResourceManager() {
		ResourceManager resourceManager = RWT.getResourceManager();
		return resourceManager;
	}

	protected void loadAceScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		for (int i=0; i<aceFiles.size();i++) {
			//System.out.println("[dslforge] - Loading " + aceFiles.get(i));
			  jsLoader.require(resourceManager.getLocation(BASE_PATH + aceFiles.get(i)));		
		}
	}

	protected void loadAntlrScripts(JavaScriptLoader jsLoader, ResourceManager resourceManager) {
		for (int i=0; i<antlrFiles.size();i++) {
			//System.out.println("[dslforge] - Loading " + antlrFiles.get(i));
		    jsLoader.require(resourceManager.getLocation(ANTLR_PATH + antlrFiles.get(i)));
		}
	}
	
	protected void registerResources() {
		ResourceManager resourceManager = getResourceManager();
		boolean isRegistered = resourceManager.isRegistered(aceFiles.get(0));
		if (!isRegistered) {
			try {
				registerAceResources(resourceManager);
				registerAntlrResources(resourceManager);
			} catch (IOException ioe) {
				throw new IllegalArgumentException("Failed to load resources", ioe);
			}
		}
	}

	protected void registerAntlrResources(ResourceManager resourceManager) throws IOException {
		for (String fileName : antlrFiles) {
			//System.out.println("[dslforge] - Registering " + ANTLR_PATH + fileName);
			register(resourceManager, fileName, ANTLR_PATH);
		}
	}

	protected void registerAceResources(ResourceManager resourceManager) throws IOException {
		for (String fileName : aceFiles) {
			//System.out.println("[dslforge] - Registering " + BASE_PATH + fileName);
			register(resourceManager, fileName, BASE_PATH);
		}
	}

	protected void register(ResourceManager resourceManager, String fileName, String path)
			throws IOException {
		ClassLoader classLoader = getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(path + fileName);
		try {
			resourceManager.register(path + fileName, inputStream);
		} finally {
			inputStream.close();
		}
	}

	protected ClassLoader getClassLoader() {
		ClassLoader classLoader = Conf.class.getClassLoader();
		return classLoader;
	}

	@Override
	public void setLayout(Layout layout) {
		throw new UnsupportedOperationException("Cannot change internal layout of DSL Editor");
	}

	@Override
	public void setFont(Font font) {
		super.setFont(font);
		remoteObject.set("font", getCssFont());
	}

	@Override
	public void dispose() {
		super.dispose();
		if (remoteObject!=null)
			remoteObject.destroy();
	}

	public void setText(String text) {
		checkWidget();
		if (text == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.text = text;
		remoteObject.set("text", text);
	}

	public String getText() {
		checkWidget();
		return text;
	}

	public void setStatus(String command) {
		checkWidget();
		if (command == null) {
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		}
		this.command = command;
		remoteObject.set("command", command);
	}
	
	public String getCommand() {
		checkWidget();
		return command;
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
}
