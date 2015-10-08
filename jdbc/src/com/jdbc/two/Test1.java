package com.jdbc.two;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.exception.BadcredentialsException;
import com.jdbc.Jdbc3;
import com.jdbc.JdbcUtill;

public class Test1 {
	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			c = JdbcUtill.getMySqlConnection();
			s = c.createStatement();
			String sql = "insert into hostl_details values('Romio','17','paid','19')";
			int k = s.executeUpdate(sql);
			if (k == 1) {
				System.out.println("data inserted");
			} else
				System.out.println("data not inserted");

		}
		catch (ClassNotFoundException ex) {
			System.out.println("class not found");
			throw new BadcredentialsException("enter correct credentials");

		}

		catch (BadcredentialsException e) {
			System.out.println("in bad ");
			throw new BadcredentialsException("wrong db Credentilas");

		} catch (SQLException e) {
			System.out.println("in sql");
			throw new BadcredentialsException("wrong db Credentilas");

		} 
		catch (Exception e) {
			System.out.println("in exception");
			
			// TODO: handle exception
		}
		//saves from memory leak
		finally{
			JdbcUtill.cleanup(c, s);
		}

	}
}
