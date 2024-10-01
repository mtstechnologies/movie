package com.mts.movie_api.entities;


import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Score {

	
	private ScorePk id = new ScorePk();//chave composta

	private Double punctuation;
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
}
