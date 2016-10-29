package com.task.service;

import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;
import com.task.service.exeption.ServiceException;

public interface FindGoods {
	List<Velogoods> getAllGoods(String categoryName) throws ServiceException;
	List<Float> getQuantity(String categoryName) throws ServiceException;
	
	
}
