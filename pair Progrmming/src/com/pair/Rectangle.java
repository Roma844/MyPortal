package com.pair;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	double length, breadth,p;
	double area;
	
	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
		area=(length*breadth);
		System.out.println(area);
		p=2*(length+breadth);
		System.out.println(p);
		
	}
	
	
	

}
