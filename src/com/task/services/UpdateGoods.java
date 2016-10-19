package com.task.services;

import com.task.bean.entity.Goods;
import com.task.service.exeption.ServiceException;

public interface UpdateGoods {
	void addGoodsToDB(Goods goods) throws ServiceException;
	void deleteById(Goods goods) throws ServiceException;
	void update(Goods goods) throws ServiceException;
}
