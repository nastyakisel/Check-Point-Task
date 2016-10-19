package com.task.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.dao.Dao;
import com.task.dao.exception.DAOException;
import com.task.db.DB;

public class GoodsDao implements Dao {

	private DB db;
	private List<Bicycle> bicycleList;
	private List<Accessorie> accessorieList;
	private List<Pump> pumpList;

	public GoodsDao() {

	}
	@Override
	public List<Pump> showAllPumps(String categoryName) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		pumpList = new ArrayList<Pump>();
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "SELECT* FROM " + categoryName;
		
		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			Pump pump = new Pump();
			pump.setId(rs.getInt(1));
			pump.setGoodName(rs.getString(1));
			pump.setDescription(rs.getString(1));
			pump.setPrice(rs.getFloat(1));
			pump.setQuantity(rs.getInt(1));
			// System.out.println(rs.getString(1));
			pumpList.add(pump);
		}
		return pumpList;
	}
	
	@Override
	public List<Accessorie> showAllAccessorie(String categoryName) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		accessorieList = new ArrayList<Accessorie>();
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "SELECT* FROM " + categoryName;

		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			Accessorie accessorie = new Accessorie();
			accessorie.setId(rs.getInt(1));
			accessorie.setGoodName(rs.getString(1));
			accessorie.setDescription(rs.getString(1));
			accessorie.setPrice(rs.getFloat(1));
			accessorie.setQuantity(rs.getInt(1));
			// System.out.println(rs.getString(1));
			accessorieList.add(accessorie);
		}
		return accessorieList;
	}
	
	@Override
	public List<Bicycle> showAllBicycle(String categoryName) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		bicycleList = new ArrayList<Bicycle>();
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "SELECT* FROM " + categoryName;

		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			Bicycle bicycle = new Bicycle();
			bicycle.setId(rs.getInt(1));
			bicycle.setGoodName(rs.getString(1));
			bicycle.setDescription(rs.getString(1));
			bicycle.setPrice(rs.getFloat(1));
			bicycle.setQuantity(rs.getInt(1));
			// System.out.println(rs.getString(1));
			bicycleList.add(bicycle);
		}
		return bicycleList;
	}

	@Override
	public void addToDB(Goods goods) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "INSERT INTO " + goods.getClass().getSimpleName() 
				+ "(goodName, description, price, quantity)" + " "
				+ "VALUES(" + goods.getGoodName() + ", " 
				+ goods.getDescription() + ", " 
				+ goods.getPrice() + ", "
				+ goods.getQuantity() + ")";
		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Товар успешнно добавлен в базу данных");
	}

	@Override
	public void deleteFromDBbyId(Goods goods) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Integer id = goods.getId();
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "DELETE* FROM " + goods.getClass().getSimpleName()
				+ "WHERE id=" + id;
		
		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Запись успешно удалена");

	}

	@Override
	public void update(Goods goods) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Integer id = goods.getId();
		Statement st = (Statement) db.getCon().createStatement();

		String sql = "UPDATE Bicycle SET goodName=" + goods.getGoodName() + ", " + goods.getDescription() + ", "
				+ goods.getPrice() + ", " + goods.getQuantity() + "WHERE id=" + id;

		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Запись успешно отредактирована");
	}

	
	@Override
	public List<Float> getQuantityOfGoods(String categoryName) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		List<Float> array = new ArrayList<Float>();
		Integer count = 0;
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "SELECT* FROM " + categoryName;

		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			count++;
		}
		Float quantity = count.floatValue();

		array.add(quantity);

		String sql2 = "SELECT MAX(Price) AS HighestPrice FROM Bicycle";
		st.executeUpdate("USE velo_rent");
		ResultSet rs2 = (ResultSet) st.executeQuery(sql2);
		Float maxPrice = rs2.getFloat(1);
		array.add(maxPrice);

		String sql3 = "SELECT MIN(Price) AS HighestPrice FROM Bicycle";
		st.executeUpdate("USE velo_rent");
		ResultSet rs3 = (ResultSet) st.executeQuery(sql3);
		Float minPrice = rs3.getFloat(1);
		array.add(minPrice);

		return array;
	}
	
	
}
