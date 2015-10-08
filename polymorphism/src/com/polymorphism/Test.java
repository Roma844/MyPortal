package com.polymorphism;

public class Test {
	//var args
	public static void main(String...args) {
		College cg = new College();
		cg.m1();
		cg.dept();
		// sub class methods can't be accessed
		// cg.bookname();
		Library lb = new Library();
		lb.m1();
		lb.bookname();
		lb.dept();
		//Dynamic dipatch
		College cb= new Library();
		cb.dept();
		cb.m1();
		//cb.bookname();
		
		IDept de = new Class1();
		de.dept1();
		//cannot convert from test to IDept...decoupling
		
		//IDept df=new Test();
		
		//no method in this interface decoupling/dynamic dispatch
	IBook b=new Book1();
	//type casting
	Library l=(Library)new College();
	l.bookname();
	l.dept();
	}
}
