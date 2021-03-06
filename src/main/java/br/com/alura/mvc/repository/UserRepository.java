package br.com.alura.mvc.repository;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	User findByUsername(String username);
}
