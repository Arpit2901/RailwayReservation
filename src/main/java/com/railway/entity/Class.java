package com.railway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class Class {

	@Id
	private int class_Id;
	private String coach_Prefix;
	private int class_Code;
	private String class_Name;
	private int seat_Per_coach;

	public Class(int class_Id, String coach_Prefix, int class_Code, String class_Name, int seat_Per_coach) {
		super();
		this.class_Id = class_Id;
		this.coach_Prefix = coach_Prefix;
		this.class_Code = class_Code;
		this.class_Name = class_Name;
		this.seat_Per_coach = seat_Per_coach;
	}

	public Class() {
	}

	public int getClass_Id() {
		return class_Id;
	}

	public void setClass_Id(int class_Id) {
		this.class_Id = class_Id;
	}

	public String getCoach_Prefix() {
		return coach_Prefix;
	}

	public void setCoach_Prefix(String coach_Prefix) {
		this.coach_Prefix = coach_Prefix;
	}

	public int getClass_Code() {
		return class_Code;
	}

	public void setClass_Code(int class_Code) {
		this.class_Code = class_Code;
	}

	public String getClass_Name() {
		return class_Name;
	}

	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}

	public int getSeat_Per_coach() {
		return seat_Per_coach;
	}

	public void setSeat_Per_coach(int seat_Per_coach) {
		this.seat_Per_coach = seat_Per_coach;
	}

}
