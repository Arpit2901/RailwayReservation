package com.railway.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.dao.ReservationDao;
import com.railway.entity.TicketReservation;

@Service
public class ReservationServicesImpl implements ReservationService{

	@Autowired
	ReservationDao dao;

	@Override
	public TicketReservation addReservation(TicketReservation reserve) {
		TicketReservation saved=this.dao.save(reserve);
		return saved;
	}
	
	
}
