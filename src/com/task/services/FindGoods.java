package com.task.services;

import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;
import com.task.service.exeption.ServiceException;

public interface FindGoods {
	List<Pump> getAllPumps(String categoryName) throws ServiceException;
	List<Accessorie> getAllAccessorie(String categoryName) throws ServiceException;
	List<Bicycle> getAllBicycle(String categoryName) throws ServiceException;
	List<Float> getQuantity(String categoryName) throws ServiceException;
	
	
}
