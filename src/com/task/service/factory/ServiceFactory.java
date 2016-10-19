package com.task.service.factory;

import com.task.services.FindGoods;
import com.task.services.UpdateGoods;
import com.task.sevice.impl.FindGoodsServise;
import com.task.sevice.impl.UpdateGoodsService;



public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	FindGoods findGoods = new FindGoodsServise();
	UpdateGoods updateGoods = new UpdateGoodsService();
	
	private ServiceFactory(){}
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public FindGoods getFindGoodsServise(){
		return findGoods;
	}
	
	public UpdateGoods getUpdateGoodsService(){
		return updateGoods;
	}
}
