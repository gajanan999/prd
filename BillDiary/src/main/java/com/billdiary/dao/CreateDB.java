package com.billdiary.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDB {
	public static final String DRIVER="org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL="jdbc:derby:billdiary;create:true";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		Connection connection= DriverManager.getConnection(JDBC_URL);
		
		connection.createStatement().executeQuery("create table user(id (5),username varchar(20),password varchar(20))");
		connection.createStatement().executeQuery("insert into user values(1,gajanan,gajanan)");
		System.out.println("Tables created successfully.. and record inserted successfully");
		
	}

}
