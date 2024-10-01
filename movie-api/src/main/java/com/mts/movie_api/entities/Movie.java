package com.mts.movie_api.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Movie {

	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
}
