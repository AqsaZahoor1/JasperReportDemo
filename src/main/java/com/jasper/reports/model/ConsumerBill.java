package com.jasper.reports.model;

import jakarta.persistence.Entity;

public class ConsumerBill {
	
	
	int consumer_no;;
	String billing_month;
	String issue_date ;
	String due_date ;
	String meter_no ;
	String total ;
	
	
	public ConsumerBill() {
		this.consumer_no = 1;
		this.billing_month = "April";
		this.issue_date = "April";
		this.due_date = "April";
		this.total = "1000";
		this.meter_no="90879";
	}
	public String getMeter_no() {
		return meter_no;
	}
	public void setMeter_no(String meter_no) {
		this.meter_no = meter_no;
	}
	public int getConsumer_no() {
		return consumer_no;
	}
	public void setConsumer_no(int consumer_no) {
		this.consumer_no = consumer_no;
	}
	public String getBilling_month() {
		return billing_month;
	}
	public void setBilling_month(String billing_month) {
		this.billing_month = billing_month;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "ConsumerBill [consumer_no=" + consumer_no + ", billing_month=" + billing_month + ", issue_date="
				+ issue_date + ", due_date=" + due_date + ", total=" + total + "]";
	}

}
