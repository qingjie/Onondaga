package com.qingjie.repository;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
