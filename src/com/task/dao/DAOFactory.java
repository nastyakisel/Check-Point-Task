package com.task.dao;

import com.task.dao.impl.GoodsDao;



public class DAOFactory {
	private static final DAOFactory INSTANCE = new DAOFactory();
	
	private Dao goodsDao = new GoodsDao();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return INSTANCE;
	}
	
	public Dao getGoodsDao(){
		return goodsDao;
	}
}
