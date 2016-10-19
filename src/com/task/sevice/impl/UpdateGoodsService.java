package com.task.sevice.impl;

import java.sql.SQLException;

import com.task.bean.entity.Goods;
import com.task.dao.DAOFactory;
import com.task.dao.exception.DAOException;
import com.task.dao.impl.GoodsDao;
import com.task.service.exeption.ServiceException;
import com.task.services.UpdateGoods;

public class UpdateGoodsService implements UpdateGoods{
	
	@Override
	public void addGoodsToDB(Goods goods) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.addToDB(goods);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteById(Goods goods) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.deleteFromDBbyId(goods);;
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(Goods goods) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.update(goods);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
