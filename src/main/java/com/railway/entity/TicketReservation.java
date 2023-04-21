package com.railway.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ticket_reservation")
public class TicketReservation {

	@Id
	private int pnr_No;
	private Date to_Date;
	private Date from_Date;
	private String to_Station;
	private String from_Station;
	private int train_No;

	public TicketReservation(int pnr_No, Date to_Date, Date from_Date, String to_Station, String from_Station,
			int train_No) {
		super();
		this.pnr_No = pnr_No;
		this.to_Date = to_Date;
		this.from_Date = from_Date;
		this.to_Station = to_Station;
		this.from_Station = from_Station;
		this.train_No = train_No;
	}

	public TicketReservation() {
	}

	public int getPnr_No() {
		return pnr_No;
	}

	public void setPnr_No(int pnr_No) {
		this.pnr_No = pnr_No;
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

	public String getTo_Station() {
		return to_Station;
	}

	public void setTo_Station(String to_Station) {
		this.to_Station = to_Station;
	}

	public String getFrom_Station() {
		return from_Station;
	}

	public void setFrom_Station(String from_Station) {
		this.from_Station = from_Station;
	}

	public int getTrain_No() {
		return train_No;
	}

	public void setTrain_No(int train_No) {
		this.train_No = train_No;
	}

}
