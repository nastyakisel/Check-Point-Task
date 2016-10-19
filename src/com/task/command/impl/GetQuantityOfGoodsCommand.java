package com.task.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.task.beans.AddNewGoodsRequest;
import com.task.beans.GetQuantityOfGoodsRequest;
import com.task.beans.Request;
import com.task.beans.Response;
import com.task.command.Command;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;
import com.task.services.FindGoods;
import com.task.services.UpdateGoods;

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
