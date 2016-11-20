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
package org.dslforge.antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.tool.ANTLRErrorListener;
import org.antlr.tool.ErrorManager;
import org.antlr.tool.Message;
import org.antlr.tool.ToolMessage;
import org.apache.log4j.Logger;

public class AntlrErrorListener implements ANTLRErrorListener {

	static final Logger logger = Logger.getLogger(AntlrErrorListener.class);

	private List<String> output;

	public AntlrErrorListener() {
		output = new ArrayList<String>();
	}
	
	@Override
	public void info(String message) {
		handleInfo(message);
	}

	@Override
	public void error(Message message) {
		String type = ErrorManager.getMessageType(message.msgID);
		if (type.startsWith("error")) {
			handleError(message);
		} else {
			handleWarning(message);
		}
	}

	@Override
	public void warning(Message message) {
		handleWarning(message);
	}

	@Override
	public void error(ToolMessage message) {
		handleToolError(message);
	}

	protected void handleInfo(String message) {
		logger.info("ANTLR says: " + message);
	}

	protected void handleError(Message message) {
		String messageType = ErrorManager.getMessageType(message.msgID);
		if( message.line!=-1) {
			logger.info("ANTLR Error: [" + messageType + ", id=" + message.msgID + ", line=" + message.line + ", column=" + message.column + "] : "
					+ message);	
		}
	}

	protected void handleWarning(Message message) {
		String messageType = ErrorManager.getMessageType(message.msgID);
		if( message.line!=-1) {
			logger.info("ANTLR Warning: [" + messageType + ", id=" + message.msgID + ", line=" + message.line + ", column=" + message.column + "] : "
					+ message);	
		}
	}

	protected void handleToolError(ToolMessage message) {
		String messageType = ErrorManager.getMessageType(message.msgID);
		if( message.line!=-1) {
			logger.info("ANTLR Tool Error: [" + messageType + ", id=" + message.msgID + ", line=" + message.line + ", column=" + message.column + "] : "
					+ message);	
		}
	}

	List<String> getOutput() {
		return output;
	}
}