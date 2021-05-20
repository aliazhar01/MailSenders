package com.work.logger;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailSender {
	
	public static void main(String[] args) {
		JavaMailSenderImpl impl=new JavaMailSenderImpl();
		impl.setHost("smtp.gmail.com");
		impl.setPort(587);
		impl.setUsername("hashsir0101@gmail.com");
		impl.setPassword("hashhash");
		
		Properties javaproperties=new Properties();
		javaproperties.put("mail.smtp.starttls.enable", "true");
		javaproperties.put("mail.smtp.auth", "true");
		javaproperties.put("mail.transport.protocol", "smtp");
		javaproperties.put("mail.debug", "true");
		
		
		impl.setJavaMailProperties(javaproperties);
		
		String []bccs= {"sidravali123@gmail.com","mdarbazrtr@gmail.com"};
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("hashsir0101@gmail.com");
		message.setTo("ajjuhospet96@gmail.com");
		message.setBcc(bccs);
		message.setSubject("demo mail sender");
		message.setText("hello everyone \n  iam xyzabc\n from hospet");
		
		impl.send(message);
		
	}

}
