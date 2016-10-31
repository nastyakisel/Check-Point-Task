package com.task.service.impl;

import java.sql.SQLException;

import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.dao.DAOFactory;
import com.task.dao.exception.DAOException;
import com.task.dao.impl.GoodsDao;
import com.task.service.UpdateGoods;
import com.task.service.exeption.ServiceException;

public class UpdateGoodsService implements UpdateGoods{
	
	@Override
	public void addGoodsToDB(Velogoods goods) throws ServiceException {// сервисы не имеют права отказываться от проверки входящих параметров
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.addToDB(goods);
		} catch (DAOException | SQLException e) {// откуда здесь SQLException? его же дальше ДАО выпускать нельзя!!!
			
			e.printStackTrace();// где throw new ServiceException(e)???
		}
	}
	
	@Override
	public void deleteById(Integer id) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.deleteFromDBbyId(id);;
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(Velogoods goods) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		GoodsDao dao = (GoodsDao) factory.getGoodsDao();
		
		try {
			dao.update(goods);
		} catch (DAOException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
