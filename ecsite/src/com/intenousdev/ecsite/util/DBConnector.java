package com.intenousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	//ドライバー名
	private static String driverName="com.mysql.jdbc.Driver";

	//URL
	private static String url="jdbc:mysql://localhost/ecsite";

	//ユーザー名
	private static String user="root";

	//パスワード
	private static String password="mysql";

	public Connection getConnection(){
		Connection con=null;

		try{
			Class.forName(driverName);
			con=(Connection)DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}





}
