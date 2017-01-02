package com.qingjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qingjie.domain.Author;
import com.qingjie.repository.AuthorRepository;

@Controller
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	AuthorRepository authorRepositpry;

	@RequestMapping("/list")
	@ResponseBody
	public Iterable<Author> list() {
		return authorRepositpry.findAll();
	}

}
