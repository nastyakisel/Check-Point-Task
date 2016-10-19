package com.task.command.impl;

import java.util.ArrayList;
import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.beans.AddNewGoodsRequest;
import com.task.beans.Request;
import com.task.beans.Response;
import com.task.beans.ShowAllGoodsRequest;
import com.task.command.Command;
import com.task.service.exeption.ServiceException;
import com.task.service.factory.ServiceFactory;
import com.task.services.FindGoods;

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
		
		if (categoryName.equals("Bicycle")) {
			try {
				List<Bicycle> bicycle = new ArrayList<Bicycle>();
				bicycle = findGoods.getAllBicycle(categoryName);
				response.setBicycle(bicycle);
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}
		}
		if (categoryName.equals("Accessorie")) {
			try {
				List<Accessorie> accessorie = new ArrayList<Accessorie>();
				accessorie = findGoods.getAllAccessorie(categoryName);
				response.setAccessorie(accessorie);
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}
		}
		
		if (categoryName.equals("Pump")) {
			try {
				List<Pump> pump = new ArrayList<Pump>();
				pump = findGoods.getAllPumps(categoryName);
				response.setPump(pump);
			} catch (ServiceException e) {
				
				e.printStackTrace();
			}
		}
		return response;
	}
}
