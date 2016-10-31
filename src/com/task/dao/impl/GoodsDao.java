package com.task.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.task.bean.entity.Accessorie;
import com.task.bean.entity.Bicycle;
import com.task.bean.entity.Category;
import com.task.bean.entity.Goods;
import com.task.bean.entity.Pump;
import com.task.bean.entity.Velogoods;
import com.task.dao.Dao;
import com.task.dao.exception.DAOException;
import com.task.db.DB;

public class GoodsDao implements Dao {

	private DB db;//итак, объкт goodsDAO д.б. один, чтобы не плодить сущностей сверх необходимого
	// => его методы м.б. вызваны параллельно несколькими потоками => методы будут пользоваться этои 
	// переменной тоже одновременно - и что в результате получится?
	
	public GoodsDao() {

	}
	@Override
	public List<Velogoods> showAllGoods(String categoryName) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();// ну-ну, объект не создался, но мы затихарится, исключение погасим и.... что дальше-то в коде будет?
		}
		
		List<Velogoods> veloGoods = new ArrayList<Velogoods>();
		
		String sql = "SELECT* FROM Velogoods WHERE FK_Category_ID IN(SELECT id FROM Category WHERE categoryName="
				+ "'" + categoryName + "')";// именовать нормально, а не sql + лучше выносить в private static final поля
		
		Statement st = (Statement) db.getCon().createStatement();
		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			Velogoods velogood = new Velogoods();
			velogood.setId(rs.getInt(1));
			velogood.setGoodName(rs.getString(2));
			velogood.setDescription(rs.getString(3));
			velogood.setPrice(rs.getFloat(4));
			velogood.setQuantity(rs.getInt(5));
			// System.out.println(rs.getString(1));
			veloGoods.add(velogood);
		}
		
		// connecion, statement, resultset кто закрывать будет?
		return veloGoods;
		
	}
	
	@Override
	public void addToDB(Velogoods goods) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "INSERT INTO " + goods.getClass().getSimpleName()
				+ " (goodName, description, price, quantity, FK_Category_ID)"
				+ " VALUES("
				+ "'" + goods.getGoodName() + "'," + "'" + goods.getDescription()  
				+ "',"
				+ "'" + goods.getPrice()+ "'," 
				+ "'" + goods.getQuantity() + "'," + "'" + goods.getCategory().getId() 
				+ "')";
				
		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Òîâàð óñïåøííî äîáàâëåí â áàçó äàííûõ");
	}

	@Override
	public void deleteFromDBbyId(Integer id) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "DELETE FROM Velogoods" 
				+ " WHERE id=" + id;
		
		//System.out.println(sql);
		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Çàïèñü óñïåøíî óäàëåíà");// выкашивайте такой код хоть при сдаче

	}

	@Override
	public void update(Velogoods goods) throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		Integer id = goods.getId();
		Statement st = (Statement) db.getCon().createStatement();

		String sql = "UPDATE Velogoods SET goodName=" 
				+ "'" + goods.getGoodName() + "'"
				+ ", description="
				+ "'" + goods.getDescription() + "'"
				+ ", price= '" +  goods.getPrice() + "',"
				+ "quantity= '" + goods.getQuantity() + "',"
				+ "FK_Category_ID= '" + goods.getCategory().getId() + "'"
				+ " WHERE id=" + id;
		
		st.executeUpdate("USE velo_rent");
		st.executeUpdate(sql);
		System.out.println("Çàïèñü óñïåøíî îòðåäàêòèðîâàíà");
	}

	@Override
	public List<Float> getQuantityOfGoods(String categoryName)
			throws DAOException, SQLException {
		try {
			db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		List<Float> array = new ArrayList<Float>();
		Integer count = 0;
		Statement st = (Statement) db.getCon().createStatement();
		String sql = "SELECT* FROM Velogoods WHERE FK_Category_ID IN(SELECT id FROM Category WHERE categoryName="
				+ "'" + categoryName + "')";
		
		st.executeUpdate("USE velo_rent");
		ResultSet rs = (ResultSet) st.executeQuery(sql);
		while (rs.next()) {
			count++;
		}
		Float quantity = count.floatValue();

		array.add(quantity);

		String sql2 = "SELECT MAX(Price) FROM Velogoods "
				+ "WHERE FK_Category_ID IN(SELECT id FROM Category WHERE categoryName="
				+ "'" + categoryName + "')";
		
		st.executeUpdate("USE velo_rent");
		ResultSet rs2 = (ResultSet) st.executeQuery(sql2);
		if (rs2.next()) {
			Float maxPrice = rs2.getFloat(1);
			array.add(maxPrice);
		}
		// array.add(maxPrice);

		String sql3 = "SELECT MIN(Price) FROM Velogoods "
				+ "WHERE FK_Category_ID IN(SELECT id FROM Category WHERE categoryName="
				+ "'" + categoryName + "')";
		
		st.executeUpdate("USE velo_rent");
		ResultSet rs3 = (ResultSet) st.executeQuery(sql3);
		if (rs3.next()) {
			Float minPrice = rs3.getFloat(1);
			array.add(minPrice);
		}
		return array;
	}

	

}
