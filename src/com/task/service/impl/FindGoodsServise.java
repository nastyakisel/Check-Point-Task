package com.task.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;
import com.task.dao.DAOFactory;
import com.task.dao.exception.DAOException;
import com.task.dao.impl.GoodsDao;
import com.task.service.FindGoods;
import com.task.service.exeption.ServiceException;


public class FindGoodsServise implements FindGoods{
	 
	@Override
	public List<Velogoods> getAllGoods(String categoryName) throws ServiceException {
		
		List<Velogoods> velogoods = new ArrayList<Velogoods>();
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			velogoods = dao.showAllGoods(categoryName);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
		return velogoods;
		
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
