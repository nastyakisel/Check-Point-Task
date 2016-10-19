package com.task.dao;

import java.sql.SQLException;
import java.util.List;

import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.dao.exception.DAOException;

public interface Dao {
	List<Pump> showAllPumps(String categoryName) throws DAOException, SQLException;
	List<Accessorie> showAllAccessorie(String categoryName) throws DAOException, SQLException;
	List<Bicycle> showAllBicycle(String categoryName) throws DAOException, SQLException;
	void addToDB(Goods goods) throws DAOException, SQLException;
	void deleteFromDBbyId(Goods goods) throws DAOException, SQLException;
	void update(Goods goods) throws DAOException, SQLException;
	List<Float> getQuantityOfGoods(String categoryName) throws DAOException, SQLException;
}
