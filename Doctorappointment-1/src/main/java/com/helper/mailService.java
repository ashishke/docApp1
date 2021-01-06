package com.helper;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mailService {
	
	
	 static void sendEmail(String message, String subject, String to, String from) {
			// TODO Auto-generated method stub
			
			//variable for gmail
			String host="smtp.gmail.com";
			
			//get the system property
			Properties properties= System.getProperties();
			System.out.println("property "+properties);
			
			//settings important info to properties object
			
			//host set
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.auth", "true");
			//System.out.println("after property..........");
			
			//Step:1 to get session object
			Session session=Session.getInstance(properties, new Authenticator(){
				
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					// TODO Auto-generated method stub
					return new PasswordAuthentication("xyz@gmail.com", "xxxx");
				}

				
			} );
			session.setDebug(true);
			//step:2 compose the message
			MimeMessage m=new MimeMessage(session);
			
			try{
			//from email
			m.setFrom(from);
			
			//adding recipient
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject
			m.setSubject(subject);
			
			//adding text
			m.setText(message);
			System.out.println("befor send...................");
			//send 
			
			//step:3 send message using transport class
			Transport.send(m);
			
			System.out.println("sucess...");
			} catch (Exception e) {
			e.printStackTrace();
			}
			
			
		}
		
		

}
