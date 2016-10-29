package com.task.bean;

import com.task.bean.entity.Goods;
import com.task.bean.entity.Velogoods;



public class AddNewGoodsRequest extends Request {
	Velogoods goods;

	public Velogoods getGoods() {
		return goods;
	}

	public void setGoods(Velogoods goods) {
		this.goods = goods;
	}
	
}
