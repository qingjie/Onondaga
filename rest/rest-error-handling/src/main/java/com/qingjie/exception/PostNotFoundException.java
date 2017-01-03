package com.qingjie.exception;

public class PostNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2313971822075592244L;

	public PostNotFoundException(String msg) {
		super(msg);
	}
}
