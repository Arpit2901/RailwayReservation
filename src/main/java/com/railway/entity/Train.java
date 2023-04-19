package com.railway.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
	private int tNumber;
	private String tName;
	private String departureS;
	private String arrivalS;
	public Train(int tNumber, String tName, String departureS, String arrivalS) {
		super();
		this.tNumber = tNumber;
		this.tName = tName;
		this.departureS = departureS;
		this.arrivalS = arrivalS;
	}
	
	public Train() {
		super();
	}

	public int gettNumber() {
		return tNumber;
	}
	public void settNumber(int tNumber) {
		this.tNumber = tNumber;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getdepartureS() {
		return departureS;
	}
	public void setdepartureS(String departureS) {
		this.departureS = departureS;
	}
	public String getarrivalS() {
		return arrivalS;
	}
	public void setarrivalS(String arrivalS) {
		this.arrivalS = arrivalS;
	}
	
	
}
