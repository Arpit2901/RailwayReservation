package com.railway.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.entity.Train;
@Repository
public interface RailwayDao extends JpaRepository<Train,Integer>{
	Train findById(int id);

}
