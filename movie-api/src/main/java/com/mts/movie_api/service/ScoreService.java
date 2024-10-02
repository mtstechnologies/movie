package com.mts.movie_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mts.movie_api.dto.MovieDTO;
import com.mts.movie_api.dto.ScoreDTO;
import com.mts.movie_api.entities.Movie;
import com.mts.movie_api.entities.Score;
import com.mts.movie_api.entities.User;
import com.mts.movie_api.repositories.MovieRepository;
import com.mts.movie_api.repositories.ScoreRepository;
import com.mts.movie_api.repositories.UserRepository;

@Service
public class ScoreService {


	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		User user = userRepository.findByEmail(dto.getEmail());
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}

		Movie movie = movieRepository.findById(dto.getMovieId()).get();

		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setPoints(dto.getScore());

		score = scoreRepository.saveAndFlush(score);

		//acessando uma lista avaliações relacionadas a um determinado filme
		double sum = 0.0;
		for(Score s : movie.getScores()) { //percorrendo todas as avaliações de um determinado filme
			sum = sum + s.getPoints();
		}

		double avg = sum / movie.getScores().size(); //o método size pega o tamanho da coleção

		movie.setScore(avg);
		movie.setCount(movie.getScores().size());

		movie = movieRepository.save(movie);	

		return new MovieDTO(movie);
	}
}
