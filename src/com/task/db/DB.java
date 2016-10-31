package com.task.db;//ну существует же слой ДАО, зачем это все из него выносить???
// если ты создаешь пакет, на уровне, гед пакеты описывают слои приложения - ты создаешь новый слои
// слоя db отдельно я что-то в товом приложении не наблюдаю

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DB {
	private Connection con;
	private Statement st;// а вдруг надо PreparedStatement - что делать будем?
	
	public DB(String url, String user, String password) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection(url, user, password);
		st = (Statement) con.createStatement();
	}
	
	public Connection getCon() {
		return con;
	}


	public void update(String sql) throws SQLException {
		st.executeUpdate(sql);
	}
	
	/*public static void main(String[] args) {
		
		try {
			DB db = new DB("jdbc:mysql://localhost:3306/", "root", "root");
			//String sql = "CREATE SCHEMA IF NOT EXISTS velo_rent CHARACTER SET utf8";
			//db.update(sql);
			//db.update("use velo_shop");
			
			String sql2 = "CREATE TABLE velo("
				+ "ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,"
				+ "TNAME VARCHAR(255) NOT NULL,"
				+ "DESCRIPTION VARCHAR(255) NOT NULL)";
			db.update(sql2);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}*/
}
