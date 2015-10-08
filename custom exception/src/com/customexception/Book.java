package com.customexception;

import java.sql.Connection;
import java.sql.SQLException;

public class Book extends CustomException {
	public static Connection getMyConnection() throws SQLException,CustomException{
		Connection c=null;
		try{
	Class.forName("abc");
		}
		catch(ClassNotFoundException ce){
			throw new CustomException("Enter proper class name");
		}
		return c;
	}
	
	public static void main(String[] args)  {
		try{
		
	Connection con=	Book.getMyConnection();
	}
		catch (SQLException e) {
			// TODO: handle exception
		} catch (CustomException e) {
			System.out.println("custom exception");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
