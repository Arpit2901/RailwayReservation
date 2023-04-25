package com.railway.entity;

import java.sql.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ticket_fare")
public class TicketFare {

	@Id
	private int class_Id;
	private Date to_Date;
	private Date from_Date;
	private double to_Km;
	private double from_Km;
	private int fare;

	public TicketFare(Date to_Date, Date from_Date, double to_Km, double from_Km, int fare, int class_Id) {
		super();
		this.to_Date = to_Date;
		this.from_Date = from_Date;
		this.to_Km = to_Km;
		this.from_Km = from_Km;
		this.fare = fare;
		this.class_Id = class_Id;
	}

	public TicketFare() {
	}

	public Date getTo_Date() {
		return to_Date;
	}

	public void setTo_Date(Date to_Date) {
		this.to_Date = to_Date;
	}

	public Date getFrom_Date() {
		return from_Date;
	}

	public void setFrom_Date(Date from_Date) {
		this.from_Date = from_Date;
	}

	public double getTo_Km() {
		return to_Km;
	}

	public void setTo_Km(double to_Km) {
		this.to_Km = to_Km;
	}

	public double getFrom_Km() {
		return from_Km;
	}

	public void setFrom_Km(double from_Km) {
		this.from_Km = from_Km;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getClass_Id() {
		return class_Id;
	}

	public void setClass_Id(int class_Id) {
		this.class_Id = class_Id;
	}
}
