package com.railway.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Train {
	@Id
	@Column(name = "Train_no")
	private int tNumber;
	@Column(name = "Train_name")
	private String tName;
	private int distance;
	@Column(name = "Start_time")
	private String sTime;
	@Column(name = "End_time")
	private String eTime;
	private String departureS;
	private String arrivalS;

	public Train() {
		super();
	}

	public Train(int tNumber, String tName, int distance, String sTime, String eTime, String departureS,
			String arrivalS) {
		super();
		this.tNumber = tNumber;
		this.tName = tName;
		this.distance = distance;
		this.sTime = sTime;
		this.eTime = eTime;
		this.departureS = departureS;
		this.arrivalS = arrivalS;
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
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getsTime() {
		return sTime;
	}

	public void setsTime(String sTime) {
		this.sTime = sTime;
	}

	public String geteTime() {
		return eTime;
	}

	public void seteTime(String eTime) {
		this.eTime = eTime;
	}

	public String getarrivalS() {
		return arrivalS;
	}
	public void setarrivalS(String arrivalS) {
		this.arrivalS = arrivalS;
	}
	
	
}
