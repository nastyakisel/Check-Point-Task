package com.task.command.impl;

import com.task.bean.DeleteGoodsRequest;
import com.task.bean.Request;
import com.task.bean.Response;
import com.task.bean.UpdateGoodsRequest;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.command.Command;
import com.task.service.UpdateGoods;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;

public class DeleteGoodsCommand implements Command{
	
	public Response execute(Request request) {
	
	DeleteGoodsRequest deleteGoodsRequest = null;
	
	if(request instanceof DeleteGoodsRequest){
		deleteGoodsRequest = (DeleteGoodsRequest)request;
	}
	
	Integer goodId = deleteGoodsRequest.getId();
	ServiceFactory factory = ServiceFactory.getInstance();
	
	UpdateGoods updateService = factory.getUpdateGoodsService();
	
	Response response= new Response();
	
	try {
		updateService.deleteById(goodId);;
		response.setErrorStatus(false);
		response.setSimpleMessage("Товар удален");
	} catch (ServiceException e) {
		
		e.printStackTrace();
	}
	return response;
}
}

