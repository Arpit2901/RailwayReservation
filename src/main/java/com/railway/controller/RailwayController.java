package com.railway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.dao.RailwayDao;
import com.railway.entity.Train;
import com.railway.services.TrainService;

@RestController
@RequestMapping("/train")
public class RailwayController {
	
	
	@Autowired
	RailwayDao dao;
	@Autowired
	TrainService trainService;
	
	@PostMapping("/add")
	public ResponseEntity<Train> addTrain(@RequestBody Train train){
		Train t=this.trainService.addTrain(train);
		return new ResponseEntity<Train>(t,HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Train>> getAllTrains(){
		return  ResponseEntity.ok(this.trainService.getAllTrain());
	}
//	@GetMapping

}
