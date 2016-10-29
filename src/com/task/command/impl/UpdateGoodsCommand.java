package com.task.command.impl;

import com.task.bean.AddNewGoodsRequest;
import com.task.bean.Request;
import com.task.bean.Response;
import com.task.bean.UpdateGoodsRequest;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.command.Command;
import com.task.service.UpdateGoods;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;

public class UpdateGoodsCommand implements Command { 
	public Response execute(Request request) {
		UpdateGoodsRequest updateGoodsRequest = null;
		if(request instanceof UpdateGoodsRequest){
			updateGoodsRequest = (UpdateGoodsRequest)request;
		}
		
		Velogoods goods;
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
