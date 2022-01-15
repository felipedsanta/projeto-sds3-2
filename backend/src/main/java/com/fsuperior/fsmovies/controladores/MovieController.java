package com.fsuperior.fsmovies.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsuperior.fsmovies.dto.MovieDTO;
import com.fsuperior.fsmovies.servicos.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@GetMapping
	public Page<MovieDTO> buscarTodos(Pageable pageable) {
		return service.buscarTodos(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}

}
