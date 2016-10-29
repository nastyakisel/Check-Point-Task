package com.task.service.factory;

import com.task.service.FindGoods;
import com.task.service.UpdateGoods;
import com.task.service.impl.FindGoodsServise;
import com.task.service.impl.UpdateGoodsService;



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
