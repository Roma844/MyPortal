package com.methodoverridding;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Class1 implements IOverridding {
	// we can't throw unrelated exception
	/*
	 * public void m1() throws FileNotFoundException {
	 * 
	 * }
	 */
	// we can throw lower in hierachy exception
	public void m1() throws SQLDataException {
		System.out.println("overridded m1");

	}

	// while overidding we can't throw any checked exception

	/*
	 * public void m2() throws SQLException {
	 * 
	 * }
	 */

	// while overidding we can throw any runtime exception

	public void m2() throws ArithmeticException {
		System.out.println("overridded m2");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("overridded m3");
	}

	public static void main(String[] args)  {
		//Class1 class1 = new Class1();
		IOverridding class1=new Class1();
		try {
			class1.m1();
		} catch (SQLException s) {
			System.out.println("catch block of m1");

		}
		//class1.m1();
		class1.m2();
		class1.m3();
	}
}
