package com.task.beans;

import com.task.bean.entity.Goods;

public class DeleteGoodsRequest extends Request{
	Goods goods;

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}
}