package com.homework.exception;
//1 try thowing the exception but catch n finally having rturn stmt
//2 try having exception free code but catch n finally having return
//3 try having exception catch will have return but finally will have no return
//4 try catch both will have exception finally will have return stmt
//ans4 yea prgrm will run properly as finally is having return
//5 try n catch both having exception but finally will not have return
//6 try catch finally all three having exception
//7 try n catch both r without exception n finally have return
public class ExceptionWork {
int m1(){
	int a=0;
	try{
		System.out.println("try block");
		a=10/0;
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
}
