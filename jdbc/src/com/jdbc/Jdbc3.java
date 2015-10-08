package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc3 {
public static Connection getSqlConnection(){
	Connection c=null;
	//Connection s;
	try{
	Class.forName("com.mysql.jdbc.Driver");
	c= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	System.out.println("connection established");
	}
	catch(ClassNotFoundException d){
	System.out.println("class not found");	
	}
	catch(SQLException p){
		System.out.println("sql exception");
	}
	return c;
	}
	


public static void main(String[] args)  {
	Jdbc3.getSqlConnection();
}
}
