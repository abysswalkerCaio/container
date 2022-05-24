package com.caiocosta.container.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caiocosta.container.dto.ReportDTO;
import com.caiocosta.container.entities.Container;
import com.caiocosta.container.entities.Move;
import com.caiocosta.container.entities.Report;
import com.caiocosta.container.repositories.ContainerRepository;
import com.caiocosta.container.repositories.MoveRepository;
import com.caiocosta.container.repositories.ReportRepository;

@Service
public class ReportService {
	
	@Autowired
	private ReportRepository repository;
	private ContainerRepository containerRepository;
	private MoveRepository moveRepository;
	
	@Transactional(readOnly = true)
	public Page<ReportDTO> findAll(Pageable pageable) {
		Page<Report> result = repository.findAll(pageable);
		Page<ReportDTO> page = result.map(x -> new ReportDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ReportDTO findById(Long id) {
		Report result = repository.findById(id).get();
		ReportDTO dto = new ReportDTO(result);
		return dto;
	}
	
	@Transactional
	public ReportDTO saveReport(ReportDTO dto) {
		Report reportReturn = new Report();
		Container container = containerRepository.findById(dto.getContainer().getNameContainer());
		Move move = moveRepository.findById(dto.getMove().getStartDate());
		if (!(container == null) && !(move == null)) {
			Report report = new Report();
			report = repository.saveAndFlush(report);
			reportReturn = report;
		}
		return new ReportDTO(reportReturn);
	}
}
