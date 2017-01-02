package com.qingjie.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.domain.Author;
import com.qingjie.domain.Post;
import com.qingjie.repository.AuthorRepository;
import com.qingjie.repository.PostRepository;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;

	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@PostConstruct
	private void loadData() {
		Author author = new Author("Qingjie", "Zhao");
		authorRepository.save(author);

		Post post = new Post("Spring Data Rocks");
		post.setBody("Post body here...");
		post.setPostedOn(new Date());
		post.setAuthor(author);
		postRepository.save(post);
	}
}
