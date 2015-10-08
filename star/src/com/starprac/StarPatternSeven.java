package com.starprac;

public class StarPatternSeven {
	void m1(){
		int i,j;
		for(i=0;i<5;i++){
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(i=0;i<5;i++){
			for(j=i;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
public static void main(String[] args) {
	StarPatternSeven sp= new StarPatternSeven();
	sp.m1();
}
}
