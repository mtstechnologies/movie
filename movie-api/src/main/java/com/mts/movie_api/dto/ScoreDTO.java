package com.mts.movie_api.dto;

import lombok.Data;

@Data
public class ScoreDTO {

	private Long movieId;
	private String email;
	private Double score;
}