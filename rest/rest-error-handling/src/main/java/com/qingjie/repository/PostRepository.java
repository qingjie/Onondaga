package com.qingjie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);
}
