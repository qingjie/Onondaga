package com.qingjie.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Secured("ROLE_GUEST")
	@RequestMapping("/list")
	public String list() {
		return "list posts ...";
	}

	@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts() {
		return "list drafts ...";
	}

	@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@RequestMapping("/add")
	public String addPost() {
		foo();
		return "add posts ...";
	}
	
	
	private void foo(){
		
	}
}
