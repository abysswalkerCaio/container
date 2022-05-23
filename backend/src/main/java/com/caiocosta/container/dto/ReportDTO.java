package com.caiocosta.container.dto;

import com.caiocosta.container.entities.Container;
import com.caiocosta.container.entities.Move;
import com.caiocosta.container.entities.Report;

public class ReportDTO {
	private Long id;
	private Container container;
	private Move move;
	
	public ReportDTO() {
		
	}
	
	public ReportDTO(Long id, Container container, Move move) {
		this.id = id;
		this.container = container;
		this.move = move;
	}
	
	public ReportDTO(Report report) {
		id = report.getId();
		container = report.getContainer();
		move = report.getMove();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}
}
