package com.railway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "station")
public class Station {

	@Id
	private int station_Id;
	private int station_Code;
	private String station_Name;

	public Station(int station_Id, int station_Code, String station_Name) {
		super();
		this.station_Id = station_Id;
		this.station_Code = station_Code;
		this.station_Name = station_Name;
	}

	public Station() {
	}

	public int getStation_Id() {
		return station_Id;
	}

	public void setStation_Id(int station_Id) {
		this.station_Id = station_Id;
	}

	public int getStation_Code() {
		return station_Code;
	}

	public void setStation_Code(int station_Code) {
		this.station_Code = station_Code;
	}

	public String getStation_Name() {
		return station_Name;
	}

	public void setStation_Name(String station_Name) {
		this.station_Name = station_Name;
	}

}
