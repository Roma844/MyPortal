package com.CLC.test.ques12;

public class Swap2 {
	int a,b,t;
public Swap2(int a, int b) {
	// TODO Auto-generated constructor stub
	this.a=a;
	this.b=b;
	System.out.println("before swapping a:-"+a);
	System.out.println("before swapping b:-"+b);
}

void m1(){
	t=a;
	a=b;
	b=t;
	System.out.println("After swapping a:-"+a);
	System.out.println("After swapping b:-"+b);
	
}
public static void main(String[] args) {
	Swap s= new Swap(5, 8);
	s.m1();
}

}
