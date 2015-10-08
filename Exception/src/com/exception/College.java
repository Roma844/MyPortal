package com.exception;

public class College {
	void m1()  {
		System.out.println("method");
	}

	public static void main(String[] args) {
		College c= new College();

		try {
			// null pointer exception
			/*
			 * College c=null; c.m1();
			 */
			c.m1();
			

		} catch (NullPointerException n) {
			n.printStackTrace();
			College e = new College();
			e.m1();
		}
	}

}
