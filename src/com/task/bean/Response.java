package com.task.bean;

import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;



public class Response {
	private boolean errorStatus;
	private String errorMessage;
	private String simpleMessage;
	private List<Velogoods> velogoods;
	public List<Velogoods> getVelogoods() {
		return velogoods;
	}
	public void setVelogoods(List<Velogoods> velogoods) {
		this.velogoods = velogoods;
	}
	private List<Float> listFloat;
	
	public List<Float> getListFloat() {
		return listFloat;
	}
	public void setListFloat(List<Float> listFloat) {
		this.listFloat = listFloat;
	}
	public boolean isErrorStatus() {
		return errorStatus;
	}
	public void setErrorStatus(boolean errorStatus) {
		this.errorStatus = errorStatus;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getSimpleMessage() {
		return simpleMessage;
	}
	public void setSimpleMessage(String simpleMessage) {
		this.simpleMessage = simpleMessage;
	}
	
	
	
}
