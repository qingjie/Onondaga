package com.qingjie;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.abc.User;

@ComponentScan({ "com.qingjie", "com.abc" })
@SpringBootApplication
public class OnondagaApplication {

	@Bean
	public User user() {
		return new User("Qingjie", "Zhao");
	}

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(OnondagaApplication.class, args);

		String[] beanNames = cxt.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String name : beanNames) {
			System.out.println(name);
		}
		
		System.out.println(cxt.getBean("user").toString());
	}
}
