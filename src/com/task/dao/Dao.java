package com.task.dao;

import java.sql.SQLException;
import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;
import com.task.dao.exception.DAOException;

public interface Dao {
	
	List<Velogoods> showAllGoods(String categoryName) throws DAOException, SQLException;
	void addToDB(Velogoods goods) throws DAOException, SQLException;
	void deleteFromDBbyId(Integer id) throws DAOException, SQLException;
	void update(Velogoods goods) throws DAOException, SQLException;
	List<Float> getQuantityOfGoods(String categoryName) throws DAOException, SQLException;
}
