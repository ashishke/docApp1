package com.helper;



public class MailSender {
	
	
public boolean sendMail( String to) {
		
		String message=" Your Appointment confirmed!! ";
        String subject="Confirmation mail";
        
        String from ="ashishkeskar0@gmail.com";
        
        mailService.sendEmail(message, subject, to, from);
        
       
        return true;
	}

}
