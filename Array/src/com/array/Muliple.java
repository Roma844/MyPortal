package com.array;

import com.input.Scanner1;

public class Muliple {
	public static void main(String[] args) {

		System.out.println("Enter the no. of rows");
		int r = Scanner1.s.nextInt();
		System.out.println("Enter the no. of column");
		int c = Scanner1.s.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				a[i][j] = Scanner1.s.nextInt();

			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				System.out.print(a[i][j]);
				System.out.print("   ");

			}
			System.out.println(""); 
		}
		
	}

}
