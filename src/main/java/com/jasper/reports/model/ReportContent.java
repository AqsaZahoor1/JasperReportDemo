package com.jasper.reports.model;

public class ReportContent {
	
	private String no;
	private String rank;
	private String name;
	private String unit;
	private String address;
	
	
	public ReportContent() {
	this.no="123";
		this.rank = "rank";
		this.name = "name";
		this.unit = "unit";
		this.address = "address";
	}

	public String getRank() {
		return rank;
	}
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
