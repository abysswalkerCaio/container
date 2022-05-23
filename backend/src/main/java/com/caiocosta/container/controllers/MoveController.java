package com.caiocosta.container.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiocosta.container.dto.MoveDTO;
import com.caiocosta.container.services.MoveService;

@RestController
@RequestMapping(value = "/moves")
public class MoveController {

	@Autowired
	private MoveService service;
	
	@GetMapping
	public Page<MoveDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
	
}
