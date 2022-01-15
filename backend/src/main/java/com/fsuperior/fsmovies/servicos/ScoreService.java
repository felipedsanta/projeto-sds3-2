package com.fsuperior.fsmovies.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsuperior.fsmovies.dto.MovieDTO;
import com.fsuperior.fsmovies.dto.ScoreDTO;
import com.fsuperior.fsmovies.entidades.Movie;
import com.fsuperior.fsmovies.entidades.Score;
import com.fsuperior.fsmovies.entidades.User;
import com.fsuperior.fsmovies.repositorios.MovieRepository;
import com.fsuperior.fsmovies.repositorios.ScoreRepository;
import com.fsuperior.fsmovies.repositorios.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO  salvarScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = scoreRepository.saveAndFlush(score);
	
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
	
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
	


}
