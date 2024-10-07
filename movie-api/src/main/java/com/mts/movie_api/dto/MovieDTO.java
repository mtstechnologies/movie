package com.mts.movie_api.dto;

import com.mts.movie_api.entities.Movie;

import lombok.Data;

@Data
public class MovieDTO {

	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	
	//abaixo estou recebendo o objeto Movie e copiando para o meu DTO
	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}
}