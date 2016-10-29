package com.task.command.impl;

import com.task.bean.AddNewGoodsRequest;
import com.task.bean.Request;
import com.task.bean.Response;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.command.Command;
import com.task.service.UpdateGoods;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;



public class AddNewGoodsCommand implements Command{
	
	public Response execute(Request request) {
		
		AddNewGoodsRequest addNewGoodsRequest = null;
		if(request instanceof AddNewGoodsRequest){
			addNewGoodsRequest = (AddNewGoodsRequest)request;
		}
		
		Velogoods goods;
		goods = addNewGoodsRequest.getGoods();
		ServiceFactory factory = ServiceFactory.getInstance();
		
		UpdateGoods updateService = factory.getUpdateGoodsService();
		
		Response response= new Response();
		
		try {
			updateService.addGoodsToDB(goods);
			response.setErrorStatus(false);
			response.setSimpleMessage("Товар добавлен");
		} catch (ServiceException e) {
			e.printStackTrace();
			response.setErrorStatus(true);
			response.setErrorMessage("Товар не добавлен");
		}
		return response;
		
	}
}
