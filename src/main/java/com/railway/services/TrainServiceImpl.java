package com.railway.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.dao.RailwayDao;
import com.railway.entity.Train;

@Service
public class TrainServiceImpl implements TrainService{

	@Autowired
	RailwayDao dao;
	
	@Override
	public Train addTrain(Train train) {
		Train saved=this.dao.save(train);
		return saved;
	}

	@Override
	public List<Train> getAllTrain() {
		List<Train> allTrains= this.dao.findAll();
		return allTrains;
	}

	@Override
	public List<Train> getTrainByStation(String from,String to) {
		return dao.findAll().stream().filter(s->s.getDepartureS().contentEquals(from)).filter(e->e.getArrivalS().contentEquals(to)).collect(Collectors.toList());
	}

	@Override
	public Train getTrainById(int id) {
		Train find=this.dao.getReferenceById(id);
		return find;
	}

	@Override
	public Train updateTrain(Train train, int id) {
		Train update=this.dao.getReferenceById(id);
		update.settName(train.gettName());
		update.setDepartureS(train.getDepartureS());
		update.settNumber(train.gettNumber());
		update.setArrivalS(train.getArrivalS());
		Train updatedTrain=this.dao.save(update);
		return updatedTrain;
	}

	@Override
	public void deleteTrain(int id) {
		Train deleted=this.dao.getReferenceById(id);
		this.dao.delete(deleted);
	}


}
