package com.pair;

public class Square extends Shape {
	public Square(double length) {
		// TODO Auto-generated constructor stub
		area=length*length;
		System.out.println(area);
		this.perimeter=4*length;
		System.out.println(perimeter);
	}

}
