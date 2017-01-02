package com.qingjie;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qingjie.domain.Post;
import com.qingjie.repository.PostRepository;
import com.qingjie.service.DataLoader;

@SpringBootApplication
public class H2DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(H2DemoApplication.class);

	@Autowired
	PostRepository postRepository;

	@Autowired
	DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);

	}

	@PostConstruct
	void seePosts() {
		logger.info("seePosts() is called... ");
		for (Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}

	}

}
