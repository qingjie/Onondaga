package com.qingjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.qingjie.domain.User;

@Service
public class NotificationService {

	private JavaMailSender javaMailSender;

	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;

	}

	@Async
	public void sendNotification(User user) throws MailException,InterruptedException {

		System.out.println("Sleeping now...");
		Thread.sleep(10000);
		System.out.println("Sending email...");
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setFrom("zhaoqingjie@gmail.com");
		mail.setSubject("Subject1");
		mail.setText("Text1");
		javaMailSender.send(mail);

	}
}
