package com.caiocosta.container.dto;

import com.caiocosta.container.entities.Container;
import com.caiocosta.container.entities.Move;

public class MoveDTO {
	private Long id;
	private Container container;
	private String movimentation;
	private String startDate;
	private String finalDate;
	private String startHour;
	private String finalHour;
	
	public MoveDTO() {
		
	}

	public MoveDTO(Long id, Container container, String movimentation, String startDate, String finalDate,
			String startHour, String finalHour) {
		super();
		this.id = id;
		this.container = container;
		this.movimentation = movimentation;
		this.startDate = startDate;
		this.finalDate = finalDate;
		this.startHour = startHour;
		this.finalHour = finalHour;
	}
	
	public MoveDTO(Move move) {
		super();
		id = move.getId();
		container = move.getContainer();
		movimentation = move.getMovimentation();
		startDate = move.getStartDate();
		finalDate = move.getFinalDate();
		startHour = move.getStartHour();
		finalHour = move.getFinalHour();
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

	public String getMovimentation() {
		return movimentation;
	}

	public void setMovimentation(String movimentation) {
		this.movimentation = movimentation;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getFinalHour() {
		return finalHour;
	}

	public void setFinalHour(String finalHour) {
		this.finalHour = finalHour;
	}
}
