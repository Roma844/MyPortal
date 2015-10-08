package com.CLC.test;

public class Student {
	void showValue(int ab){
		int c=0;
	if(ab!=0)
	{
		 c= ab/10;
showValue(c);

	}
	System.out.println("ab values"+ab);
	System.out.println("c values"+c);

}
	public static void main(String[] args) {
		int ab=98;
		Student stud=new Student();
		stud.showValue(ab);
	}
}
