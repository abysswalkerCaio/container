package com.caiocosta.container.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiocosta.container.entities.Container;

public interface ContainerRepository extends JpaRepository<Container, Long> {
	
}
