package com.mts.movie_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.movie_api.entities.Score;
import com.mts.movie_api.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
