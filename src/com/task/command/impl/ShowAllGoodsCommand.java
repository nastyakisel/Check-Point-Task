package com.task.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.task.bean.AddNewGoodsRequest;
import com.task.bean.Request;
import com.task.bean.Response;
import com.task.bean.ShowAllGoodsRequest;
import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;
import com.task.command.Command;
import com.task.service.FindGoods;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;

public class ShowAllGoodsCommand implements Command{
	public Response execute(Request request) {
		
		//List<Goods> goods = null;
		ShowAllGoodsRequest showAllGoodsRequest = null;
		if(request instanceof ShowAllGoodsRequest){
			showAllGoodsRequest = (ShowAllGoodsRequest)request;
		}
		
		String categoryName = showAllGoodsRequest.getName();
		
		ServiceFactory factory = ServiceFactory.getInstance();
		
		FindGoods findGoods = factory.getFindGoodsServise();
		
		Response response= new Response();
		
		
			try {
				List<Velogoods> velogoods = new ArrayList<Velogoods>();
				velogoods = findGoods.getAllGoods(categoryName);
				response.setVelogoods(velogoods);;
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}
		
		return response;
	}
}
