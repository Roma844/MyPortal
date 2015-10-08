package com.starprac;

public class StarPatternTwo {
	int i,j;

	void m1(){
		for (i=0;i<5;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		StarPatternTwo sp = new StarPatternTwo();
		sp.m1();
	}
}
