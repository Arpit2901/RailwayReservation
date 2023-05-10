package com.railway.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "seatDisplay", joinColumns = @JoinColumn(name = "numb", referencedColumnName = "train_no"), inverseJoinColumns = @JoinColumn(name = "Seatavailability", referencedColumnName = "id"))
	private List<SeatAvailability> seats;

	public Train() {
		super();
	}

	public Train(int tNumber, String tName, int distance, String sTime, String eTime, String departureS,
			String arrivalS, List<SeatAvailability> seats) {
		super();
		this.tNumber = tNumber;
		this.tName = tName;
		this.distance = distance;
		this.sTime = sTime;
		this.eTime = eTime;
		this.departureS = departureS;
		this.arrivalS = arrivalS;
		this.seats = seats;
	}

	public List<SeatAvailability> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatAvailability> seats) {
		this.seats = seats;
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

	public String getDepartureS() {
		return departureS;
	}

	public void setDepartureS(String departureS) {
		this.departureS = departureS;
	}

	public String getArrivalS() {
		return arrivalS;
	}

	public void setArrivalS(String arrivalS) {
		this.arrivalS = arrivalS;
	}

}
