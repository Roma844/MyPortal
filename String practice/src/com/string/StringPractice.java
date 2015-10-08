package com.string;

public class StringPractice {
	public static void main(String[] args) {
		//string literals
		String st= "java";
		st="java"+"fun";
		//can't create object like this way of string buffer
		//StringBuffer sb= "java";
		StringBuffer sb = new StringBuffer("javac");
		//StringBuilder sbu ="java";
		StringBuilder sbu = new StringBuilder("javac");
		String se=new String();
		String sa= new String(se);
		String str = new String("java");
		String sr= new String(st);
		System.out.println(st);
		System.out.println(se);
		System.out.println(sa);
		System.out.println(str);
		System.out.println(sr);
		/*System.out.println(st.hashCode());
		System.out.println(se.hashCode());
		System.out.println(sa.hashCode());
		System.out.println(str.hashCode());
		System.out.println(sr.hashCode());*/
		/*System.out.println(sb);
		System.out.println(sbu);
*/		st=st.concat("java is vast");
		System.out.println(st);
		System.out.println(st.concat("love java"));
		System.out.println(sb.append('o'));
		sb=sb.append('r');
		System.out.println(sb);
		char c=sbu.charAt(2);
		System.out.println(c);
	}
	

}
