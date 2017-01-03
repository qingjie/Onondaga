package com.qingjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.domain.Author;
import com.qingjie.repository.AuthorRepository;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	AuthorRepository authorRepository;

	@Autowired
	public AuthorController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/")
	public Iterable<Author> list() {
		return authorRepository.findAll();
	}

	@RequestMapping("/{id}")
	public Author read(@PathVariable(value = "id") long id) {
		return authorRepository.findOne(id);
	}

}
