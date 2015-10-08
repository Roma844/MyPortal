package com.pair;

public class Triangle extends Shape {
	Triangle(double height,double base){
		this.height=height;
		this.base=base;
		area=0.5*base*height;
		System.out.println(area);
		perimeter=3*base;
		System.out.println(perimeter);
		
	}

}
