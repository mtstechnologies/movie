package com.mts.movie_api.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User {

	private Long id;
	private String email;
}
