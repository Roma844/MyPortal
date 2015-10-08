package com.pair;

public class Cylinder extends Shape {
	double volume;
	public Cylinder(double height,double radius) {
		this.height=height;
		this.radius=radius;
		volume=pi*radius*radius*height;
		System.out.println(volume);
		perimeter=2*(pi*radius*radius) +(2*pi*radius*height);
		System.out.println(perimeter);
	}

}
