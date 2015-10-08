package com.array;

import com.input.*;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[2], size, i, s[] = new int[5];
		// another way of array declaration
		int[] q = new int[5];
		String b[] = new String[2];
		System.out.println("How many elements u want??");

		size = Scanner1.s.nextInt();
		System.out.println("Enter rollno and name");
		for (i = 0; i < size; i++) {
			a[i] = Scanner1.s.nextInt();
			b[i] = Scanner1.s.next();

		}
		// foreach loop
		for (int y : a) {
			System.out.println(y);

		}
		for (String z : b) {
			System.out.println(z);
		}
	}
}
