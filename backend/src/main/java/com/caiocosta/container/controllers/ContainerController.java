package com.caiocosta.container.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiocosta.container.dto.ContainerDTO;
import com.caiocosta.container.services.ContainerService;

@RestController
@RequestMapping(value = "/containers")
public class ContainerController {
	
	@Autowired
	private ContainerService service;
	
	@GetMapping
	public Page<ContainerDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
	@GetMapping(value = "/{id}")
	public ContainerDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PutMapping
	public ContainerDTO saveContainer(@RequestBody ContainerDTO dto) {
		ContainerDTO containerDTO = service.saveContainer(dto);
		return containerDTO;
	}	
}
