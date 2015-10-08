package com.exception;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] = new int[20];
			System.out.println(a[21]);

		}
		// we can't write super class first then subclass in catch always
		// subclass should be before super class

		catch (ArithmeticException a) {
			System.out.println("arithmetic exception");
		} catch (ArrayIndexOutOfBoundsException s) {
			System.out.println("array index out of bound");
		} catch (Exception e) {
		}
	}
}
