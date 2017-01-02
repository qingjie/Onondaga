package com.qingjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(ProfileApplication.class, args);

		System.out.println(cxt.getBean("datasource").toString());

	}
}
