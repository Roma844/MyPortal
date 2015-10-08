package com.sort;

import java.util.Scanner;

public class Sorting {
	Scanner s = new Scanner(System.in);
	static int a[] = new int[10];
	int no;
	int t;
	int j;
	int i;

	void sort() {
		for (i = 0; i < no; i++) {
			for (j = 0; j < no; j++) {

				if (a[j] > a[j + 1]) {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}

			}
		}
		System.out.println("After sorting");
		for (j = 1; j <= no; j++) {
			System.out.println(a[j]);

		}
	}

	void get() {
		System.out.println("Enter the no of elements");
		no = s.nextInt();
		System.out.println("Enter elements");
		for (i = 0; i < no; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Before sorting");
		for (i = 0; i < no; i++) {
			System.out.println(a[i]);
		}

	}

	/*
	 * void print(){ System.out.println("Elements are...."); for ( i = 0; i <
	 * no; i++){
	 * 
	 * System.out.println(a[i]); }
	 */

	public static void main(String[] args) {
		Sorting so = new Sorting();
		so.get();
		so.sort();

		// so.print();
		// so.after();

	}
}