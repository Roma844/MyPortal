package com.number;
import java.util.*;
public class Number {
	
	public static void main(String[] args) {
		int num=0,rev=0;
		System.out.println("Enter the no. to reverse");
		 //This statement will capture the user input
	      Scanner in = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = in.nextInt();
	      for( ;num != 0; )
	      {
	          rev = rev * 10;
	          rev = rev + num%10;
	          num = num/10;
	      }
		System.out.println("reverse of no. is"+rev);
		
	}
	
}
