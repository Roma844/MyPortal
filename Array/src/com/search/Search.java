package com.search;

import java.util.Scanner;

public class Search {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// public static Scanner s = new Scanner(System.in);
		int a[] = new int[20];
		boolean flag = false;
		System.out.println("Enter the no of elements of array");
		int size = s.nextInt();
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Enter the element to search");
		int e = s.nextInt();
		// search logic
		for (int i = 0; i < size; i++) {
			if (a[i] == e) {
				System.out.println("Element found at location..." + i);
				flag = true;
			}

		}
		if (flag != true) {
			System.out.println("Element not found");
		}

	}

}
