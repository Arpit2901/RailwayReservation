package com.railway.services;

import java.util.List;

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

//	@Override
//	public Train getTrainByStation(String station) {
//		Train train=this.dao.FindByStation(station);
//		return train;
//	}

	@Override
	public Train getTrainById(int id) {
		Train find=this.dao.getReferenceById(id);
		return find;
	}

	@Override
	public Train updateTrain(Train train, int id) {
		Train update=this.dao.getReferenceById(id);
		update.settName(train.gettName());
		update.setdepartureS(train.getdepartureS());
		update.settNumber(train.gettNumber());
		update.setarrivalS(train.getarrivalS());
		Train updatedTrain=this.dao.save(update);
		return updatedTrain;
	}

	@Override
	public void deleteTrain(int id) {
		Train deleted=this.dao.getReferenceById(id);
		this.dao.delete(deleted);
	}

}
