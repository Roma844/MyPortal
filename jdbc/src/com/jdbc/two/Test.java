package com.jdbc.two;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.JdbcUtill;

public class Test {
	
	public static void main(String[] args) {
		Statement r=null;
		Connection p=null;
		//ResultSet
		try {
			
			p = JdbcUtill.getMySqlConnection();
			r = p.createStatement();
			
		String sql="insert into clg_details values('krati','23','paid','cse','second')";
		//submit the sql stmt to database
			int k= r.executeUpdate(sql);
			if (k==1){
					System.out.println("record is inserted");
			}
			else
			{
				System.out.println("insertion failed");
			}
			//System.out.println(p);
			//create the required statement
			
		} catch (SQLException s) {

		} catch (ClassNotFoundException c) {

		}
	}
}
