package com.task.sevice.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;
import com.task.dao.DAOFactory;
import com.task.dao.exception.DAOException;
import com.task.dao.impl.GoodsDao;
import com.task.service.exeption.ServiceException;
import com.task.services.FindGoods;


public class FindGoodsServise implements FindGoods{
	 
	@Override
	public List<Pump> getAllPumps(String categoryName) throws ServiceException {
		
		List<Pump> pump = new ArrayList<Pump>();
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			pump = dao.showAllPumps(categoryName);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
		return pump;
		
	}
	@Override
	public List<Accessorie> getAllAccessorie(String categoryName) throws ServiceException {
		
		List<Accessorie> accessorie = new ArrayList<Accessorie>();
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			accessorie = dao.showAllAccessorie(categoryName);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
		return accessorie;
		
	}
	
	@Override
	public List<Bicycle> getAllBicycle(String categoryName) throws ServiceException {
		
		List<Bicycle> bicycle = new ArrayList<Bicycle>();
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			bicycle = dao.showAllBicycle(categoryName);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
		return bicycle;
		
	}
	
	@Override
	public List<Float> getQuantity(String categoryName) throws ServiceException {
		List<Float> arr = new ArrayList<Float>();
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			arr = dao.getQuantityOfGoods(categoryName);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
		return arr;
	}
}
