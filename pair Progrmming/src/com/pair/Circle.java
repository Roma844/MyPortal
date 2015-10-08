package com.pair;

public class Circle extends Shape {
double radius;


	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius=radius;
		area=pi*radius*radius;
		System.out.println(area);
		this.perimeter=2*pi*radius;
		System.out.println(perimeter);
	}
	
	

}
