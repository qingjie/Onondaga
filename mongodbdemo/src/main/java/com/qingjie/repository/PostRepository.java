package com.qingjie.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qingjie.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, BigInteger> {

	/*
	 * I will return the last post that was created.
	 */
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
