package com.railway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.dao.ReservationDao;
import com.railway.entity.TicketReservation;
import com.railway.services.ReservationService;

@RestController
@RequestMapping("/book")
public class ReservationController {

	@Autowired
	ReservationDao dao;
	@Autowired
	ReservationService service;
	
	@PostMapping("/reserve")
	public ResponseEntity<TicketReservation> reserveTicket(@RequestBody TicketReservation reserve){
		
		return ResponseEntity.ok( this.service.addReservation(reserve));
	}
	
	
}
