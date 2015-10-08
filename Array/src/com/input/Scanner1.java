package com.input;

import java.util.Scanner;

public class Scanner1 {
public static	Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter roll_no");
		int n= s.nextInt();
		System.out.println("Enter name");
		String name= s.next();
		//float f= s.nextFloat();
		System.out.println("Enter salary");
		float f= s.nextFloat();
		System.out.println(n);
		System.out.println(name);
		System.out.println(f);
		//scanner class is not compulsory to close.. we can or can't
		s.close();
	}

}
