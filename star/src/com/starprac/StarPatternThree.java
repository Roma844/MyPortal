package com.starprac;

public class StarPatternThree {
	int i, j,s;

	void m1() {
		for (i = 0; i < 5; i++) {
			for (j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(s=0;s<=i;s++){
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		
	}
	public static void main(String[] args) {
		StarPatternThree sp = new StarPatternThree();
		sp.m1();
	}

}
