package com.mts.movie_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.movie_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
