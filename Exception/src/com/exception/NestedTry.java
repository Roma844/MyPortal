package com.exception;

public class NestedTry {
public static void main(String[] args) {
	try{
		
		try{
			int a=6,b=0,r;
			r=a/b;
			System.out.println(r);
		}
		
		catch(ArithmeticException a){
			System.out.println("arithmetic exception");
		}
		int n[]=new int[20];
		System.out.println(n[19]);
		
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("array index out of bound");
	}
	
}
}
