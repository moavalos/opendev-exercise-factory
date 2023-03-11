package com.opendev.service;

import java.util.Set;

import com.opendev.contracts.StatsCar;
import com.opendev.entity.Car;

public interface CarService {
	
	Car create(int idModel, Set<Integer> idsOptionals);
	
	Car update(int id, int idModel, Set<Integer> idsOptionals);
	
	boolean delete(int id);

	Double calculateCost(int idModel, Set<Integer> idsOptionals);

	StatsCar stats();

}
