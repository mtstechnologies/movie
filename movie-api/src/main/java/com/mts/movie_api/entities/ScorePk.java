package com.mts.movie_api.entities;


import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class ScorePk implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * Serializable é uma interface em Java que marca uma classe como sendo 
	 * capaz de ser convertida em uma sequência de bytes para 
	 * armazenamento ou transmissão. É bastante comum quando se trabalha com 
	 * JPA e múltiplas chaves primárias.
	 * 
	 */

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
