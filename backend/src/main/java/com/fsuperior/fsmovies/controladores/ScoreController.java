package com.fsuperior.fsmovies.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsuperior.fsmovies.dto.MovieDTO;
import com.fsuperior.fsmovies.dto.ScoreDTO;
import com.fsuperior.fsmovies.servicos.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO salvarScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = service.salvarScore(dto);
		return movieDTO;
	}

}
