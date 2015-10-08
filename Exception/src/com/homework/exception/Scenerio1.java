package com.homework.exception;

public class Scenerio1 {
	int m1(){
		int a=0;
		try{
			System.out.println("try block");
			a=10/0;
			return a;
		}
		catch(Exception e){
			System.out.println("catch block");
			int b[]=new int[10];
			System.out.println(b[11]);
			return b[0];
			
			
		}
		finally{
			System.out.println("finally block");
			a=30;
			//return a;
		}
		
	}
	public static void main(String[] args) {
		Scenerio1 s1 = new Scenerio1();
		System.out.println(s1.m1());
	//	System.out.println(a);
	}

}
