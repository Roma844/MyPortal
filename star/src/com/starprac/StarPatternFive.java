package com.starprac;

public class StarPatternFive {
	void m1(){
		int i,j,k;
		for(i=0;i<5;i++){
		for(j=4;j>i;j--){
			System.out.print(" ");
		}
		for(k=0;k<=i;k++){
		System.out.print("* ");
		}
		System.out.println("");
		}
	}
	public static void main(String[] args) {
		StarPatternFive sp = new StarPatternFive();
		sp.m1();
	}

}
