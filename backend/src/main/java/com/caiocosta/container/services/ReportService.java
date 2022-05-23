package com.caiocosta.container.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiocosta.container.dto.ReportDTO;
import com.caiocosta.container.entities.Report;
import com.caiocosta.container.repositories.ReportRepository;

@Service
public class ReportService {
	
	@Autowired
	private ReportRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ReportDTO> findAll(Pageable pageable) {
		Page<Report> result = repository.findAll(pageable);
		Page<ReportDTO> page = result.map(x -> new ReportDTO(x));
		return page;
	}
}
