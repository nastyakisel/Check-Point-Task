package com.task.service;

import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.service.exeption.ServiceException;


public interface UpdateGoods {
	void addGoodsToDB(Velogoods goods) throws ServiceException;
	void deleteById(Integer id) throws ServiceException;
	void update(Velogoods goods) throws ServiceException;
}
