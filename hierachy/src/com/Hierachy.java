package com;

public class Hierachy {

	public static void main(String[] args) {
		Hierachy h = new Hierachy();
		h.m4();
	}

	public void m1() {
		System.out.println("m1");
	}

	private void m2() {
		m1();
		System.out.println("m2");
	}

	private void m3() {
		m2();
		System.out.println("m3");
	}

	private void m4()
	{
		m3();
		int op;
		System.out.println("not execute");
		try{
			try{
				int a[]=new int [20];
				System.out.println(a[11	]);
			}
			catch(Exception e)
			{
			}
			
		op=1/0;
		System.out.println(op);
		}
		//int a=9;
		catch(ArithmeticException e)
		{
			//System.out.println("Exception");
		}
		//System.out.println("After exception");
	}
}
