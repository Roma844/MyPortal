package com.usreDefinedArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDefinedArray {
	static int no, i;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Student st[] = new Student[80];
		System.out.println("Enter the no of elements");
		no = s.nextInt();
		System.out.println("Enter elements");

		for (i = 0; i < no; i++) {
			try {
				st[i] = new Student();
				System.out.println("Rollno");
				st[i].roll_no = s.nextInt();
				System.out.println("name");
				st[i].name = s.next();
			} catch (InputMismatchException in) {
				System.out.println("Enter proper input");
				break;
			} catch (Exception e) {
				System.out.println("Enter proper input");
				break;
			}
		}
		for (i = 0; i < no; i++) {
			System.out.println(st[i].roll_no + "  " + st[i].name);

		}
	}
}
