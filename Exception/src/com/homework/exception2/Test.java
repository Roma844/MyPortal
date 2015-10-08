package com.homework.exception2;

public class Test {
	static void m1() throws Exception{
		try{
			throw new A();
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println(3);
			throw new Exception();
			
		}
		
	}
	public static void main(String[] args) throws Exception {
		try{
			System.out.println("try block");
			m1();
		}
		catch(Exception e){
			throw new B();
		}
		finally{
			System.out.println(2);
			throw new A();
			
		}
	}

}
