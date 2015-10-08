package com.homework.exception;

public class Scenerio2 {
	
	int m1(){
		int a=0;
		try{
			System.out.println("try block");
			 a=10/5;
			return a;
		}
		catch(Exception e){
			System.out.println("catch block");
			a=20;
			return a;
			
			
		}
		finally{
			System.out.println("finally block");
			a=30;
			return a;
		}
		
	}
	public static void main(String[] args) {
		Scenerio2 s1 = new Scenerio2();
		System.out.println(s1.m1());
	//	System.out.println(a);
	}


}
