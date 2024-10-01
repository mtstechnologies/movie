package com.mts.movie_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.movie_api.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
