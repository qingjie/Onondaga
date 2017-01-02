package com.qingjie.repository;

import org.springframework.data.repository.CrudRepository;

import com.qingjie.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);

}
