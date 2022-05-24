package com.caiocosta.container.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiocosta.container.dto.MoveDTO;
import com.caiocosta.container.entities.Container;
import com.caiocosta.container.entities.Move;
import com.caiocosta.container.repositories.ContainerRepository;
import com.caiocosta.container.repositories.MoveRepository;

@Service
public class MoveService {
	
	@Autowired
	private MoveRepository repository;
	private ContainerRepository containerRepository;
	
	@Transactional(readOnly = true)
	public Page<MoveDTO> findAll(Pageable pageable) {
		Page<Move> result = repository.findAll(pageable);
		Page<MoveDTO> page = result.map(x -> new MoveDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MoveDTO findById(Long id) {
		Move result = repository.findById(id).get();
		MoveDTO dto = new MoveDTO(result);
		return dto;
	}
	
	@Transactional
	public MoveDTO saveMove(MoveDTO dto) {
		Move moveReturn = new Move();
		Container container = containerRepository.findById(dto.getContainer().getNameContainer());
		if(!(container == null)) {
			Move move = new Move();
			move.setMovimentation(dto.getMovimentation());
			move.setStartDate(dto.getStartDate());
			move.setFinalDate(dto.getFinalDate());
			move.setStartHour(dto.getStartHour());
			move.setFinalHour(dto.getFinalHour());
			
			move = repository.saveAndFlush(move);
			moveReturn = move;
		}
		return new MoveDTO(moveReturn);
	}
}
