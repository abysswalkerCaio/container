package com.caiocosta.container.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiocosta.container.dto.MoveDTO;
import com.caiocosta.container.entities.Move;
import com.caiocosta.container.repositories.MoveRepository;

@Service
public class MoveService {
	
	@Autowired
	private MoveRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MoveDTO> findAll(Pageable pageable) {
		Page<Move> result = repository.findAll(pageable);
		Page<MoveDTO> page = result.map(x -> new MoveDTO(x));
		return page;
	}
}
