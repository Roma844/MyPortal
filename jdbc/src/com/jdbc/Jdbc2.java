package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc2 {
	public static Connection getMyPostgresqlConnection() throws ClassNotFoundException{
		Connection c=null;
		try{
			  Class.forName("org.postgresql.Driver");
		//Class.forName("abc");
		c =	DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "root", "root");
		System.out.println("class found");
		}
		catch(ClassNotFoundException d)
		{
			System.out.println("class not found");
		}
		catch(SQLException s){
			System.out.println("sql connection");
		}
		return c; 
		}
	
		
		
	
	public static void main(String[] args)  {
		try{
		Jdbc2.getMyPostgresqlConnection();
		}
		catch(ClassNotFoundException s){
			System.out.println("catch block of main");
		}
		}
	}



