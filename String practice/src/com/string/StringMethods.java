package com.string;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		// Scanner s= new Scanner(System.in);
		// System.out.println("Enter any string");
		// String str= s.next();
		String str = "love to have coffee with java ";
		// different operations on string
		/*
		 * 
		 * beginIndex -- the begin index, inclusive.
		 * 
		 * endIndex -- the end index, exclusive.
		 */
		String sr = str.substring(3);
		System.out.println(sr);
		String st = str.substring(2, 12);
		System.out.println(st);
		
		//CharAt()
		
		System.out.println(str.substring(2, 18));
		char ch= str.charAt(5);
		System.out.println(ch);
		
		//CompareTo()
		
	            /*s1 > s2 => positive number  
	    	    s1 < s2 => negative number  
	    	    s1 == s2 => 0 */ 
		
		String s2="pavddddd";
		String s3="javaccc";
		String s1="JAVACCC";
		
		
	int i=	str.compareTo(sr);
	System.out.println(i);
	
	int j= str.compareTo(st);
	System.out.println(j);
	
	int k= s2.compareTo(s3);
	System.out.println(k);

	//concat
	
	String s4= str.concat(s3);
	System.out.println(s4);
	
	//contains
	
	String s5= "What is your name";
	boolean b= s5.contains("is your");
	System.out.println(b);
	b= s5.contains("roma");
	System.out.println(b);
	System.out.println(s5.contains("at"));
	
	
	//equals
	
	boolean c= s2.equals(s3);
	System.out.println(c);
	c=s3.equalsIgnoreCase(s1);
	System.out.println(c);
	
	//toUpperCase
	//toLowerCase
	System.out.println(s1);
	System.out.println(s1.toLowerCase());
	System.out.println(str);
	System.out.println(str.toUpperCase());
	
	//trim()
	//The string trim() method eliminates white spaces before and after string.
	
	System.out.println(str.trim());
	
	
	//Java String startsWith() and endsWith() method
	
	System.out.println(str.startsWith("lo"));
	//with offset
	System.out.println(str.startsWith("have", 8));
	System.out.println(str.endsWith("java "));
	
	
	//length
	
	
	System.out.println(str.length());
	System.out.println(s4.length());
	//if not found returns -1
	System.out.println(s3.lastIndexOf('c'));
	
	//intern
    
	/*When the intern method is invoked, if the pool already contains a 
	string equal to this String object as determined by the equals(Object) method, 
	then the string from the pool is returned. Otherwise, this String object is added 
	to the pool and a reference to this String object is returned.*/
	
	System.out.println(str.intern());
	System.out.println("stri".intern());
	
	int a=101;
	String stri= String.valueOf(a);
	System.out.println(stri);
	
	
	//replace
	System.out.println(str.replace('j', 'k'));
	
	
	//replaceAll
	System.out.println(str.replaceAll("java", "kava"));
	
	//toCharArray
	
	char chr[] = str.toCharArray();
	for(i=0;i<chr.length;i++){
		System.out.print(chr[i]);
	}
	
	
	}

}
