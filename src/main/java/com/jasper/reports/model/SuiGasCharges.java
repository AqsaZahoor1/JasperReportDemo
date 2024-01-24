package com.jasper.reports.model;

public class SuiGasCharges {


	String present_reading;
	String gas_consumed;
	String units;
	String previous_reading;
	String meter_rent;
	String total;
	String grand_total;
	String arrears;

	public SuiGasCharges() {
		super();
		this.previous_reading = "1.00";
		this.present_reading = "2.00";
		this.gas_consumed = "3.00";
		this.units = "4.00";
		this.meter_rent = "5.00";
		this.total = "4.00";
		this.grand_total = "5.00";
		this.arrears = "4.00";
	}

	public String getPresent_reading() {
		return present_reading;
	}

	public void setPresent_reading(String present_reading) {
		this.present_reading = present_reading;
	}

	public String getGas_consumed() {
		return gas_consumed;
	}

	public void setGas_consumed(String gas_consumed) {
		this.gas_consumed = gas_consumed;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getPrevious_reading() {
		return previous_reading;
	}

	public void setPrevious_reading(String previous_reading) {
		this.previous_reading = previous_reading;
	}

	public String getMeter_rent() {
		return meter_rent;
	}

	public void setMeter_rent(String meter_rent) {
		this.meter_rent = meter_rent;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getGrand_total() {
		return grand_total;
	}

	public void setGrand_total(String grand_total) {
		this.grand_total = grand_total;
	}

	public String getArrears() {
		return arrears;
	}

	public void setArrears(String arrears) {
		this.arrears = arrears;
	}


}
