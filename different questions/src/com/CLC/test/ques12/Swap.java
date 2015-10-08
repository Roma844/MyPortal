package com.CLC.test.ques12;

public class Swap {
	int a,b;
	public Swap(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		System.out.println("before swapping a:-"+a);
		System.out.println("before swapping b:-"+b);
	}
	
	void m1(){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a:-"+a);
		System.out.println("After swapping b:-"+b);
		
	}
	public static void main(String[] args) {
		Swap s= new Swap(5, 8);
		s.m1();
	}

}
