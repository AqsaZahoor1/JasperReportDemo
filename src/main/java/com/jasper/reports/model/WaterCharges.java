package com.jasper.reports.model;

public class WaterCharges {
	
	private String water_charges;
	private String arrears;
	private String total_amount;
	public String getWater_charges() {
		return water_charges;
	}
	public void setWater_charges(String water_charges) {
		this.water_charges = water_charges;
	}
	public String getArrears() {
		return arrears;
	}
	public void setArrears(String arrears) {
		this.arrears = arrears;
	}
	public String getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}
	public WaterCharges() {
		this.water_charges = "100 Rs";
		this.arrears = "arrears";
		this.total_amount = "100";
	}
	
	
}
