package com.caiocosta.container.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiocosta.container.dto.ContainerDTO;
import com.caiocosta.container.entities.Container;
import com.caiocosta.container.repositories.ContainerRepository;

@Service
public class ContainerService {

	@Autowired
	private ContainerRepository repository;

	@Transactional(readOnly = true)
	public Page<ContainerDTO> findAll(Pageable pageable) {
		Page<Container> result = repository.findAll(pageable);
		Page<ContainerDTO> page = result.map(x -> new ContainerDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ContainerDTO findById(Long id) {
		Container result = repository.findById(id).get();
		ContainerDTO dto = new ContainerDTO(result);
		return dto;
	}
	
	@Transactional
	public ContainerDTO saveContainer(ContainerDTO dto) {
		Container container = new Container();
		container.setNameClient(dto.getNameClient());
		container.setNameContainer(dto.getNameContainer());
		container.setType(dto.getType());
		container.setStatus(dto.getStatus());
		container.setCategory(dto.getCategory());
		
		container = repository.saveAndFlush(container);
		
		return new ContainerDTO(container);
	}
}
