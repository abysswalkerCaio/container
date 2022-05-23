package com.caiocosta.container.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
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
}
