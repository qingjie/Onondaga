package com.qingjie.repository;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
