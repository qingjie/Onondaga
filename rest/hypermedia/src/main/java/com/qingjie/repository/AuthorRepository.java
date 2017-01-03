package com.qingjie.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.qingjie.domain.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
