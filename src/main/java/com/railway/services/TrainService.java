package com.railway.services;

import java.util.List;

import com.railway.entity.Train;

public interface TrainService {

	Train addTrain(Train train);

	List<Train> getAllTrain();

//	Train getTrainByStation(String station);
	Train getTrainById(int id);

	Train updateTrain(Train train, int id);

	void deleteTrain(int id);
}
