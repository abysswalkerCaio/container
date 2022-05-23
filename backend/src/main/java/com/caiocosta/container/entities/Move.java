package com.caiocosta.container.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Entity
@Table(name = "tb_move")
public class Move {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "container_id")
	private Container container;
	
	private String movimentation;
	private String startDate;
	private String finalDate;
	private String startHour;
	private String finalHour;
	
	public Move() {
		
	}

	public Move(Long id, Container container, String movimentation, String startDate, String finalDate,
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
