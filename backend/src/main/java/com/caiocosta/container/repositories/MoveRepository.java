package com.caiocosta.container.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocosta.container.entities.Move;

public interface MoveRepository extends JpaRepository<Move, Long> {
	
}
