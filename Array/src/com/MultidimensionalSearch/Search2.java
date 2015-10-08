package com.MultidimensionalSearch;

import com.search.Search;

public class Search2 {

	public static void main(String[] args) {
		boolean flag = false;
		System.out.println("Enter the no. of rows");
		int r = Search.s.nextInt();
		System.out.println("Enter the no. of columns");
		int c = Search.s.nextInt();
		int b[][] = new int[r][c];
		System.out.println("Enter elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				b[i][j] = Search.s.nextInt();

			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				System.out.print(b[i][j]);
				System.out.print("   ");
			}
			System.out.println("");
		}
		System.out.println("Enter the element to search");
		int e = Search.s.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (b[i][j] == e) {
					System.out.println("Element found at location..." + i + j);
					flag = true;

				}

			}
		}
		if (flag != true) {
			System.out.println("Element not found");
		}

	}
}
