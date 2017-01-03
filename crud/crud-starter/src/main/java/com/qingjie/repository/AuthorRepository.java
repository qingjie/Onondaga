package com.qingjie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	List<Author> findAllByOrderByLastNameAscFirstNameAsc();

}
