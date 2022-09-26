package com.cv.srm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.srm.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);
}
