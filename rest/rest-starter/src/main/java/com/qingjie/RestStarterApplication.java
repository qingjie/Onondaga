package com.qingjie;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qingjie.domain.Author;
import com.qingjie.domain.Post;
import com.qingjie.repository.AuthorRepository;
import com.qingjie.repository.PostRepository;

@SpringBootApplication
public class RestStarterApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestStarterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestStarterApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(AuthorRepository authorRepository, PostRepository postrepository) {
		return args -> {
			Author author = new Author("Qingjie", "Zhao", "zhaqingjie@gmail.com");
			authorRepository.save(author);

			Post post = new Post("Spring Boot Rocks!");
			post.setSlug("spring-data-rocks");
			post.setTeaser("Post Teaser");
			post.setBody("Post Body");
			post.setPostedOn(new Date());
			post.setAuthor(author);
			postrepository.save(post);

			Post rest = new Post("Rest is what all the cool kids are doing.");
			rest.setSlug("reset-is-cool");
			rest.setTeaser("rest-teaser");
			rest.setBody("REST BODY");
			rest.setPostedOn(new Date());
			rest.setAuthor(author);
			postrepository.save(rest);

		};
	}

}
