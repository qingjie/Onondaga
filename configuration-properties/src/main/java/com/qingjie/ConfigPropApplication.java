package com.qingjie;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigPropApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(ConfigPropApplication.class, args);

		MyAppConfig config = (MyAppConfig) cxt.getBean("myAppConfig");

		System.out.println(config.toString());
		
		
		
	}
}
