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
	
	@GetMapping(value = "/{id}")
	public ReportDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PutMapping
	public ReportDTO saveReport(@RequestBody ReportDTO dto) {
		ReportDTO reportDTO = service.saveReport(dto);
		return reportDTO;
	}
}
