package com.railway.services;

import java.util.List;

import com.railway.entity.Train;

public interface TrainService {

	Train addTrain(Train train);

	List<Train> getAllTrain();

	List<Train> getTrainByStation(String from,String to);
	
	Train getTrainById(int id);

	Train updateTrain(Train train, int id);

	void deleteTrain(int id);
}
