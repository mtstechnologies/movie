package com.mts.movie_api.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Lombok para gerar getters, setters e outros métodos
@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePk id = new ScorePk();//chave composta

	private Double punctuation;
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
}
