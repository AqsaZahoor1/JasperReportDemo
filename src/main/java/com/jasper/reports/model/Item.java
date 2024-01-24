package com.jasper.reports.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
		
	private String name;
	  public Item() {
		this.id = (long) 12.00;
		this.name = "Aqsa";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Item(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	  
}
