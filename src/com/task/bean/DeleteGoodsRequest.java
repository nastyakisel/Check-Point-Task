package com.task.bean;

import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;

public class DeleteGoodsRequest extends Request{
	Integer id;// кто украл атрибут доступа?

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
