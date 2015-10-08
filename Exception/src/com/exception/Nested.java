package com.exception;

public class Nested {
	public static void main(String[] args) {
		//nested try catch
		try {
			try {
				int[] a = new int[10];
				System.out.println(a[11]);
			} catch (ArrayIndexOutOfBoundsException a) {
				//a.printStackTrace();
				System.out.println("array index out of bound");
				//a.printStackTrace();
				//System.exit(0);
			}
			int a = 6, b = 3, res;
			res = a / b;
			System.out.println(res);
		} catch (ArithmeticException b) {
			System.out.println("arithmetic exception");
		}
		
	}
}
