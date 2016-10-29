package com.task.bean.entity;

import java.util.Set;

public class Category {// equals, hashCode, toString?
	private Integer id;
	private String categoryName;
	
	private Set<Velogoods> velogoods;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Velogoods> getVelogoods() {
		return velogoods;
	}

	public void setVelogoods(Set<Velogoods> velogoods) {
		this.velogoods = velogoods;
	}
	
	
	
	
}
