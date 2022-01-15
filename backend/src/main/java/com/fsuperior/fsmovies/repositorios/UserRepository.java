package com.fsuperior.fsmovies.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsuperior.fsmovies.entidades.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
