package com.task.view;

import java.util.List;

import com.task.bean.AddNewGoodsRequest;
import com.task.bean.GetQuantityOfGoodsRequest;
import com.task.bean.Response;
import com.task.bean.ShowAllGoodsRequest;
import com.task.bean.UpdateGoodsRequest;
import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Category;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;
import com.task.controller.Controller;



public class View {
	
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		// добавляем товар
		Velogoods velogoods = new Velogoods();
		velogoods.setId(24);
		velogoods.setGoodName("Велосипед LACH JACKAAAAAA");
		velogoods.setPrice((float) 315.0);
		velogoods.setDescription("Горный велосипед с мотором");
		velogoods.setQuantity(15);
		Category category = new Category();
		category.setId(2);
		velogoods.setCategory(category);
		
		AddNewGoodsRequest addNewGoodsRequest = new AddNewGoodsRequest();
		addNewGoodsRequest.setCommandName("ADD_NEW_GOODS");
		addNewGoodsRequest.setGoods(velogoods);
		
		Response response = controller.doAction(addNewGoodsRequest);
		
		if (!response.isErrorStatus()) {
			System.out.println(response.getSimpleMessage());
		} else {
			System.out.println(response.getErrorMessage());
		}
		
		
		
		// Отчет о количестве товаров в каждой категории
		String nameOfCategoty = "Pump";
		GetQuantityOfGoodsRequest getQuantityOfGoodsRequest = new GetQuantityOfGoodsRequest();
		getQuantityOfGoodsRequest.setCommandName("GET_QUANTITY");
		getQuantityOfGoodsRequest.setName(nameOfCategoty);
		
		Response response2 = controller.doAction(getQuantityOfGoodsRequest);
		if (!response2.isErrorStatus()) {
			System.out.println(response2.getSimpleMessage());
		} else {
			System.out.println(response2.getErrorMessage());
		}
		
		List<Float> result = response2.getListFloat();
		for (Float eachResult: result){
			System.out.println(eachResult);
		}
		
		
		// Просмотреть все товары по категориям
		
		String сategotyName = "Accessorie";
		ShowAllGoodsRequest showAllGoodsRequest = new ShowAllGoodsRequest();
		showAllGoodsRequest.setCommandName("SHOW_ALL");
		showAllGoodsRequest.setName(сategotyName);
		
		Response response3 = controller.doAction(showAllGoodsRequest);
		List<Velogoods> result2 = response3.getVelogoods(); 
		
		for (Velogoods eachGood: result2) {
			System.out.println(eachGood.getGoodName() + " " + eachGood.getDescription());
		}
		
		
		// Обновить товар
		
		Velogoods velogoods2 = new Velogoods();
		velogoods2.setId(24);
		velogoods2.setGoodName("Велосипед NEW JACKAAAAAA");
		velogoods2.setPrice((float) 315.0);
		velogoods2.setDescription("Горный велосипед с мотором с мотором");
		velogoods2.setQuantity(15);
		Category category2 = new Category();
		category2.setId(2);
		velogoods2.setCategory(category2);
		
		UpdateGoodsRequest updateGoodsRequest = new UpdateGoodsRequest();
		updateGoodsRequest.setCommandName("UPDATE_GOODS");
		updateGoodsRequest.setGoods(velogoods2);
		
		Response response4 = controller.doAction(updateGoodsRequest);
		
		if (!response4.isErrorStatus()) {
			System.out.println(response4.getSimpleMessage());
		} else {
			System.out.println(response4.getErrorMessage());
		}

	}
}	

