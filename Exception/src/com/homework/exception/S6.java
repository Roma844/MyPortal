package com.homework.exception;

public class S6 {
	int m1(){
		int a=0;
		try{
			System.out.println("try block");
			 a=10/0;
			return a;
		}
		catch(Exception e){
			System.out.println("catch block");
			a=20/0;
			return a;
			
			
		}
		finally{
			System.out.println("finally block");
			a=30/0;
			return a;
		}
		
	}
	public static void main(String[] args) {
		S6 s1 = new S6();
		System.out.println(s1.m1());
	//	System.out.println(a);
	}

}
