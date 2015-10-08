package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.exception.BadcredentialsException;

public class JdbcUtill {
	// return type is java interface i.e. connection

	public static Connection getMySqlConnection()
			throws ClassNotFoundException, SQLException,
			BadcredentialsException {
		/*
		 * try { //Class.forName("abc"); Class.forName("com.mysql.jdbc.Driver");
		 * System.out.println("class loaded successfully"); // return null; }
		 * catch (ClassNotFoundException c) {
		 * System.out.println("wrong classes loaded"); }
		 */
		Connection d = null;
		// try {
		// include the jars in class
		// load the drivers
		Class.forName("com.mysql.jdbc.Driver");

		// establish the connection

		d = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		// Class.forName("com.jdbc.JdbcUtill");
		/*
		 * } catch (ClassNotFoundException s) {
		 * System.out.println("class not found"); } catch (SQLException p) {
		 * System.out.println("sql exception"); // p.printStackTrace(); throw
		 * new BadcredentialsException("Exception");
		 * 
		 * } System.out.println("I am connected"); return d; }
		 */

		/*
		 * public static void main(String[] args) { try {
		 * JdbcUtill.getMySqlConnection(); } catch (Exception e) {
		 * System.out.println("class not found"); }
		 */
		return d;
	}

	public static void cleanup(Connection c, Statement s) {
		try {
			if (c != null) {
				c.close();
			}
			if (s != null) {
				s.close();
			}

		} catch (Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		}

	}
}
