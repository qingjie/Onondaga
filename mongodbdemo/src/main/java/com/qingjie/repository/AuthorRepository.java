package com.qingjie.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, BigInteger> {

}
