package com.railway.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pay_info")
public class PayInfo {

	@Id
	private int payment_Id;
	private String pay_mode;
	private double amount;
	private Date pay_Date;
	private int pnr_No;

	public PayInfo(int payment_Id, String pay_mode, double amount, Date pay_Date, int pnr_No) {
		super();
		this.payment_Id = payment_Id;
		this.pay_mode = pay_mode;
		this.amount = amount;
		this.pay_Date = pay_Date;
		this.pnr_No = pnr_No;
	}

	public PayInfo() {
		
	}

	public int getPayment_Id() {
		return payment_Id;
	}

	public void setPayment_Id(int payment_Id) {
		this.payment_Id = payment_Id;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getPay_Date() {
		return pay_Date;
	}

	public void setPay_Date(Date pay_Date) {
		this.pay_Date = pay_Date;
	}

	public int getPnr_No() {
		return pnr_No;
	}

	public void setPnr_No(int pnr_No) {
		this.pnr_No = pnr_No;
	}
	
	
}
