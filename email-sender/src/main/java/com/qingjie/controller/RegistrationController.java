package com.qingjie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.domain.User;
import com.qingjie.service.NotificationService;

@RestController
public class RegistrationController {

	private Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private NotificationService notificationService;

	public RegistrationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@RequestMapping("/signup")
	public String signup() {
		return "Please sign up for our service.";
	}

	@RequestMapping("/signup-success")
	public String signupSuccess() {

		User user = new User();
		user.setFirstName("Qingjie");
		user.setLastName("Zhao");
		user.setEmailAddress("dongyaocun@gmail.com");

		try {
			notificationService.sendNotification(user);
		} catch (MailException e) {
			// TODO Auto-generated catch block
			logger.info("Error sending email: "+ e.getMessage());
			e.printStackTrace();
		}

		return "Thank you for registering with us.";
	}

}
