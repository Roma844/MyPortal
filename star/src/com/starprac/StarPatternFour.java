package com.starprac;

public class StarPatternFour {
	void m1(){
	
	int i, j, s ;
	
for(i=0;i<5;i++){
	for(j=5;j>i;j--){
		System.out.print("*");
		
	}
	System.out.println("");
	for(s=0;s<=i;s++){
		System.out.print(" ");
		
	}
	
}
	}
public static void main(String[] args) {
StarPatternFour sp =new StarPatternFour();
sp.m1();
}
	
}



