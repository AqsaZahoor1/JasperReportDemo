package com.jasper.reports.model;

public class ElectricityCharges {


	String present_reading;
	String units_consumed;
	String auth_ors;
	String previous_reading;
	String balance_units;
	String tv_fee;
	String meter_rent;
	String arrears;
	String current_bill;
	String with_date;

	public String getWith_date() {
		return with_date;
	}

	public void setWith_date(String with_date) {
		this.with_date = with_date;
	}

	public ElectricityCharges() {
		super();
		this.previous_reading = "1.00";
		this.present_reading = "2.00";
		this.units_consumed = "3.00";
		this.auth_ors = "4.00";
		this.balance_units = "5.00";
		this.tv_fee = "1.00";
		this.meter_rent = "2.00";
		this.arrears = "3.00";
		this.current_bill = "4.00";
		this.with_date = "5.00";
	}

	public String getPresent_reading() {
		return present_reading;
	}

	public void setPresent_reading(String present_reading) {
		this.present_reading = present_reading;
	}

	public String getUnits_consumed() {
		return units_consumed;
	}

	public void setUnits_consumed(String units_consumed) {
		this.units_consumed = units_consumed;
	}

	public String getAuth_ors() {
		return auth_ors;
	}

	public void setAuth_ors(String auth_ors) {
		this.auth_ors = auth_ors;
	}

	public String getPrevious_reading() {
		return previous_reading;
	}

	public void setPrevious_reading(String previous_reading) {
		this.previous_reading = previous_reading;
	}

	public String getBalance_units() {
		return balance_units;
	}

	public void setBalance_units(String balance_units) {
		this.balance_units = balance_units;
	}

	public String getTv_fee() {
		return tv_fee;
	}

	public void setTv_fee(String tv_fee) {
		this.tv_fee = tv_fee;
	}

	public String getMeter_rent() {
		return meter_rent;
	}

	public void setMeter_rent(String meter_rent) {
		this.meter_rent = meter_rent;
	}

	public String getArrears() {
		return arrears;
	}

	public void setArrears(String arrears) {
		this.arrears = arrears;
	}

	public String getCurrent_bill() {
		return current_bill;
	}

	public void setCurrent_bill(String current_bill) {
		this.current_bill = current_bill;
	}

	@Override
	public String toString() {
		return "ElectricityCharges [present_reading=" + present_reading + ", units_consumed=" + units_consumed
				+ ", auth_ors=" + auth_ors + ", previous_reading=" + previous_reading + ", balance_units="
				+ balance_units + ", tv_fee=" + tv_fee + ", meter_rent=" + meter_rent + ", arrears=" + arrears
				+ ", current_bill=" + current_bill + ", with_in_date=" + with_date + "]";
	}
	

}
