package com.qingjie;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.domain.Author;
import com.qingjie.domain.Post;
import com.qingjie.repository.AuthorRepository;
import com.qingjie.repository.PostRepository;

@Service
public class DatabaseLoader {
	private static final Logger logger = LoggerFactory.getLogger(MongoDBApplication.class);
	private final PostRepository postRepository;
	private final AuthorRepository authorRepository;

	@Autowired
	public DatabaseLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	private void initDatabase() {
		authorRepository.deleteAll();

		Author author = new Author();
		author.setFirstName("Qingjie");
		author.setLastName("Zhao");
		author.setEmail("zhaoqingjie@gmail.com");
		authorRepository.save(author);

		postRepository.deleteAll();
		Post post = new Post();
		post.setTitle("post-title");
		post.setSlug("post-slug");
		post.setTeaser("post-teaser");
		post.setBody("post-body");
		post.setPostedOn(new Date());
		post.setAuthor(author);
		postRepository.save(post);
	}

}
