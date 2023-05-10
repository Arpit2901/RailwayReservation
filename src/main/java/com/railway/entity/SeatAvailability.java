package com.railway.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "seat_availability")
public class SeatAvailability {
	@Id
	private int id;
	private String class_Code;
	private int number_Of_seats;

	public SeatAvailability() {
	}

	public SeatAvailability(int id, String class_Code, int number_Of_seats) {
		super();
		this.id = id;
		this.class_Code = class_Code;
		this.number_Of_seats = number_Of_seats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClass_Code() {
		return class_Code;
	}

	public void setClass_Code(String class_Code) {
		this.class_Code = class_Code;
	}

	public int getNumber_Of_seats() {
		return number_Of_seats;
	}

	public void setNumber_Of_seats(int number_Of_seats) {
		this.number_Of_seats = number_Of_seats;
	}

}
