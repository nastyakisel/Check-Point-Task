package com.task.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.task.bean.AddNewGoodsRequest;
import com.task.bean.GetQuantityOfGoodsRequest;
import com.task.bean.Request;
import com.task.bean.Response;
import com.task.command.Command;
import com.task.service.FindGoods;
import com.task.service.UpdateGoods;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;

public class GetQuantityOfGoodsCommand implements Command{
	
	public Response execute(Request request) {
		
		GetQuantityOfGoodsRequest getQuantityOfGoodsRequest = null;
		if(request instanceof GetQuantityOfGoodsRequest){
			getQuantityOfGoodsRequest = (GetQuantityOfGoodsRequest)request;
		}
		
		String categoryName = getQuantityOfGoodsRequest.getName();
		
		ServiceFactory factory = ServiceFactory.getInstance();
		
		FindGoods findGoods = factory.getFindGoodsServise();
		
		Response response= new Response();
		List<Float> arr = new ArrayList<Float>();
		
		try {
			arr = findGoods.getQuantity(categoryName);
			response.setErrorStatus(false);
		} catch (ServiceException e) {
			e.printStackTrace();
			response.setErrorStatus(true);
		}
		response.setListFloat(arr);
		return response;
	}
}
