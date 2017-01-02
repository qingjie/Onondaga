package com.qingjie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.NotificationService;

@RestController
public class PageController {

	private NotificationService notificationService;

	@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@RequestMapping("/")
	public String home() {
		return notificationService.toString() + "@ Onondaga!";
	}

}
