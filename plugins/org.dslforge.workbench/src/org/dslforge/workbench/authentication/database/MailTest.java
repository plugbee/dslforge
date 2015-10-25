/**
 * <copyright>
 *
 * Copyright (c) 2015 DSLFORGE. All rights reserved.
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
package org.dslforge.workbench.authentication.database;

//File Name SendEmail.java

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailTest {
	
//	static Authenticator authenticator = new Authenticator() {
//	    protected PasswordAuthentication getPasswordAuthentication() {
//	        return new PasswordAuthentication("amlajmi@gmail.com", "4Q*Zb8AD");
//	    }
//	};
	
	public static void main(String[] args) {
	
		Properties properties = new Properties();
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.host", "ns0.ovh.net");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		
		
		
		// Recipient's email ID needs to be mentioned.
		String to = "amine.lajmi@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "postmaster@dslforge.com";

		// Assuming you are sending email from localhost
		//String host = "localhost";

		// Get system properties
		//Properties properties = System.getProperties();

		// Setup mail server
		//properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		//Session session = Session.getDefaultInstance(properties, authenticator);

		Session session = Session.getInstance(properties,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("postmaster@dslforge.com", "xu3p5wcb");
					}
				  });
		
		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field
			message.setSubject("This is the Subject Line!");

			// Now set the actual message
			message.setText("This is actual message");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
