package com.fsuperior.fsmovies.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsuperior.fsmovies.entidades.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
