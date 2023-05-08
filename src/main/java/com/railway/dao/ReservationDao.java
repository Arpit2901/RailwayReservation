package com.railway.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.railway.entity.TicketReservation;

public interface ReservationDao extends JpaRepository<TicketReservation,Integer>{
	TicketReservation findById(int id);
}
