package com.mts.movie_api.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Lombok para gerar getters, setters e outros métodos
@Entity
@Table(name = "tb_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>(); 
	
	//Ao usar SET fazendo uma referencia para todo o conjunto de 
	//avaliação do filme, garantindo que não haverá repetição
	
	
	public Set<Score> getScores() {
		return scores;
	}
	
	
}
