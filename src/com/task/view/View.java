package com.task.view;

import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.beans.AddNewGoodsRequest;
import com.task.beans.GetQuantityOfGoodsRequest;
import com.task.beans.Response;
import com.task.beans.ShowAllGoodsRequest;
import com.task.controller.Controller;



public class View {
	
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		// ��������� �����
		Goods bicycle = new Bicycle();
		bicycle.setGoodName("��������� 20 PRIDE JACK");
		bicycle.setDescription("C���-����� ��������� 2015");
		bicycle.setPrice((float) 202.56);
		bicycle.setQuantity(20);
		
		
		AddNewGoodsRequest addNewGoodsRequest = new AddNewGoodsRequest();
		addNewGoodsRequest.setCommandName("ADD_NEW_GOODS");
		addNewGoodsRequest.setGoods(bicycle);
		
		Response response = controller.doAction(addNewGoodsRequest);
		
		if (!response.isErrorStatus()) {
			System.out.println(response.getSimpleMessage());
		} else {
			System.out.println(response.getErrorMessage());
		}
		
		
		// ����� � ���������� ������� � ������ ���������
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
		
		
		// ����������� ��� ������ �� ����������
		
		String �ategotyName = "Accessorie";
		ShowAllGoodsRequest showAllGoodsRequest = new ShowAllGoodsRequest();
		showAllGoodsRequest.setCommandName("SHOW_ALL");
		showAllGoodsRequest.setName(�ategotyName);
		
		Response response3 = controller.doAction(showAllGoodsRequest);
		List<Accessorie> result2 = response3.getAccessorie();
		
	}
}
