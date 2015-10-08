package com.starprac;

public class StarPatternSix  {
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
	
	
		for( i=0;i<5;i++){
		for( j=5;j>i;j--){
			System.out.print("* ");
			
		}
		System.out.println("");
		for( k=i;k>=0;k--){
			System.out.print(" ");
			
		}

		
		}
	} 
	public static void main(String[] args) {
		StarPatternSix sp = new StarPatternSix();
		sp.m1();
		
	}

}
