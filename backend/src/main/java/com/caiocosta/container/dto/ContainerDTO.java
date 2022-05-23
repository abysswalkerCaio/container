package com.caiocosta.container.dto;

import com.caiocosta.container.entities.Container;

public class ContainerDTO {
	private Long id;
	private String nameClient;
	private String nameContainer;
	private String type;
	private String status;
	private String category;
	
	public ContainerDTO() {
		
	}

	public ContainerDTO(Long id, String nameClient, String nameContainer, String type, String status, String category) {
		this.id = id;
		this.nameClient = nameClient;
		this.nameContainer = nameContainer;
		this.type = type;
		this.status = status;
		this.category = category;
	}
	
	public ContainerDTO(Container container) {
		id = container.getId();
		nameClient = container.getNameClient();
		nameContainer = container.getNameContainer();
		type = container.getType();
		status = container.getStatus();
		category = container.getCategory();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getNameContainer() {
		return nameContainer;
	}

	public void setNameContainer(String nameContainer) {
		this.nameContainer = nameContainer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
