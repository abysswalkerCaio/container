package com.caiocosta.container.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiocosta.container.dto.ReportDTO;
import com.caiocosta.container.services.ReportService;

@RestController
@RequestMapping(value = "/reports")
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@GetMapping
	public Page<ReportDTO> findAll(Pageable pageable) {
		return service.findAll(pageable);
	}
}
