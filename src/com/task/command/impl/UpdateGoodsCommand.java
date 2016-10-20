package com.task.command.impl;

import com.task.bean.entity.Goods;
import com.task.beans.AddNewGoodsRequest;
import com.task.beans.Request;
import com.task.beans.Response;
import com.task.beans.UpdateGoodsRequest;
import com.task.command.Command;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;
import com.task.services.UpdateGoods;

public class UpdateGoodsCommand implements Command { 
	public Response execute(Request request) {
		UpdateGoodsRequest updateGoodsRequest = null;
		if(request instanceof UpdateGoodsRequest){
			updateGoodsRequest = (UpdateGoodsRequest)request;
		}
		
		Goods goods;
		goods = updateGoodsRequest.getGoods();
		ServiceFactory factory = ServiceFactory.getInstance();
		
		UpdateGoods updateService = factory.getUpdateGoodsService();
		
		Response response= new Response();
		
		try {
			updateService.update(goods);
			response.setErrorStatus(false);
			response.setSimpleMessage("Товар обновлен");
		} catch (ServiceException e) {
			
			e.printStackTrace();
		}
		return response;
	}
}
