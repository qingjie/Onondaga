package com.qingjie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@RequestMapping("/posts/")
	public String list() {
		return "list posts...";
	}

	//should change this method, because the admin and user forward same post url
	@RequestMapping("/admin/posts/create")
	public String addPost() {
		return "add posts...";
	}

}
