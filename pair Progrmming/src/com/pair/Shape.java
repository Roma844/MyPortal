package com.pair;

import java.util.Scanner;

public abstract class Shape {
	double length, breadth,radius,height,base,perimeter;
	double area;
	final double pi=3.14;
	Shape sh;
	String b;
	//void area();
public static Scanner scanner= new Scanner(System.in);
	int in;
	
	void m1(){
		do{
		System.out.println("Enter the no. of ur shape");
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");
		System.out.println("3. Triangle");
		System.out.println("4. Cylinder");
		System.out.println("5. Square");
		in=scanner.nextInt();
		
	
	switch(in){
	case 1:
		System.out.println("enter length");
		length = Shape.scanner.nextDouble();
		System.out.println("Enter breadth");
		breadth= scanner.nextDouble();
		sh= new Rectangle(length,breadth);
		//Rectangle c=rec;
		break;
	
	case 2:
		System.out.println("Enter radius");
		radius=scanner.nextDouble();
		sh= new Circle(radius);
		//Circle c= cr;
		
		break;
	case 3:
		System.out.println("enter height");
		height = Shape.scanner.nextDouble();
		System.out.println("Enter base");
		base= scanner.nextDouble();
		sh= new Triangle(height, base);
		break;
	case 4:
		System.out.println("enter height");
		height = Shape.scanner.nextDouble();
		System.out.println("Enter radius");
		radius= scanner.nextDouble();
		sh= new Cylinder(height, radius);
		break;
	case 5:
		System.out.println("enter length of one side");
		length = Shape.scanner.nextDouble();
		sh= new Square(length);
		break;
		default:
			System.out.println("Enter correct choice");
			
			
		
	}
	
	System.out.println("Do you want to continue? (y/n)");  
    b=scanner.next();

	}while(b =="y");
	}
	}
	//abstract void calc();
	


