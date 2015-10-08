package com.starprac;

public class Star {

	void m1()
	{
		
		for(int i=0;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	public static void main(String[] args) {
		Star s = new Star();
		s.m1();
	}
}
