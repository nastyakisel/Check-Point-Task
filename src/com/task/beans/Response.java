package com.task.beans;

import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Pump;



public class Response {
	private boolean errorStatus;
	private String errorMessage;
	private String simpleMessage;
	private List<Accessorie> accessorie;
	private List<Bicycle> bicycle;
	private List<Pump> pump;
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
	public List<Accessorie> getAccessorie() {
		return accessorie;
	}
	public void setAccessorie(List<Accessorie> accessorie) {
		this.accessorie = accessorie;
	}
	public List<Bicycle> getBicycle() {
		return bicycle;
	}
	public void setBicycle(List<Bicycle> bicycle) {
		this.bicycle = bicycle;
	}
	public List<Pump> getPump() {
		return pump;
	}
	public void setPump(List<Pump> pump) {
		this.pump = pump;
	}
	
	
}
