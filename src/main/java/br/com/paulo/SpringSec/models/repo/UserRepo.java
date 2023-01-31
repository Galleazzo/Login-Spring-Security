package br.com.paulo.SpringSec.models.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulo.SpringSec.models.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	
	
}
