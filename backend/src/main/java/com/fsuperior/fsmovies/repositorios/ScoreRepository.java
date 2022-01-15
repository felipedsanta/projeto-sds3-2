package com.fsuperior.fsmovies.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsuperior.fsmovies.entidades.Score;
import com.fsuperior.fsmovies.entidades.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}
