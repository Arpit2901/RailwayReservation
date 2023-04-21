package com.railway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "seat_availability")
public class SeatAvailability {

	private int train_no;
	private int class_Code;
	private int number_Of_seats;

	public SeatAvailability(int train_no, int class_Code, int number_Of_seats) {
		super();
		this.train_no = train_no;
		this.class_Code = class_Code;
		this.number_Of_seats = number_Of_seats;
	}

	public SeatAvailability() {
	}

	public int getTrain_no() {
		return train_no;
	}

	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}

	public int getClass_Code() {
		return class_Code;
	}

	public void setClass_Code(int class_Code) {
		this.class_Code = class_Code;
	}

	public int getNumber_Of_seats() {
		return number_Of_seats;
	}

	public void setNumber_Of_seats(int number_Of_seats) {
		this.number_Of_seats = number_Of_seats;
	}

}
