package com.jasper.reports.model;

public class FurCharges {
	
	private String fur_charges;
	private String arrears;
	private String total_amount;
	
	public String getFur_charges() {
		return fur_charges;
	}
	public void setFur_charges(String fur_charges) {
		this.fur_charges = fur_charges;
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
	public FurCharges() {
		this.fur_charges = "100 Rs";
		this.arrears = "arrears";
		this.total_amount = "100";
	}
	
	
}
