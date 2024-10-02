package com.mts.movie_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mts.movie_api.dto.MovieDTO;
import com.mts.movie_api.entities.Movie;
import com.mts.movie_api.repositories.MovieRepository;


@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	//fazendo uma busca paginada
	
	@Transactional(readOnly = true) // indicando que é somente leitura
	public Page<MovieDTO> findAll(Pageable pageable){
		   Page<Movie> result = movieRepository.findAll(pageable); //recebendo as paginas da entidade
		   Page<MovieDTO> page = result.map(x -> new MovieDTO(x)); //convertendo o resultado para DTO
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		   Movie result = movieRepository.findById(id).get();//para acessar o objeto que está dentro do Optional, é necessário .get()
		   MovieDTO dto = new MovieDTO(result); //convertendo o resultado para DTO
		return dto;
	}
}
