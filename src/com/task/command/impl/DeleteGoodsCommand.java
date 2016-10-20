package com.task.command.impl;

import com.task.bean.entity.Goods;
import com.task.beans.DeleteGoodsRequest;
import com.task.beans.Request;
import com.task.beans.Response;
import com.task.beans.UpdateGoodsRequest;
import com.task.command.Command;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;
import com.task.services.UpdateGoods;

public class DeleteGoodsCommand implements Command{
	
	public Response execute(Request request) {
	
	DeleteGoodsRequest deleteGoodsRequest = null;
	
	if(request instanceof DeleteGoodsRequest){
		deleteGoodsRequest = (DeleteGoodsRequest)request;
	}
	
	Goods goods;
	goods = deleteGoodsRequest.getGoods();
	ServiceFactory factory = ServiceFactory.getInstance();
	
	UpdateGoods updateService = factory.getUpdateGoodsService();
	
	Response response= new Response();
	
	try {
		updateService.deleteById(goods);;
		response.setErrorStatus(false);
		response.setSimpleMessage("Товар удален");
	} catch (ServiceException e) {
		
		e.printStackTrace();
	}
	return response;
}
}

