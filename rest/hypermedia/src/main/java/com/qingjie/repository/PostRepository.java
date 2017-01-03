package com.qingjie.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.qingjie.domain.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
	List<Post> findByTitleContaining(@Param("title") String title);
}
