package com.CLC.test;

public class Execution {
	{
		System.out.println("static");
	}
	static int a= method2();
	int b=method();
	public int method(){
	System.out.println("m1()");
	return 20;
	}
	public static int method2(){
	System.out.println("m2()");
	return 30;
	}
	public static void main(String[] args) {
		System.out.println("main");
		Execution exe=new Execution();
		System.out.println(exe.b);
	}
	}


