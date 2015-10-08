package com.CLC.test.ques5;

public class Loading {

	void m1(A a) {
		System.out.println("i am in m1 A");

	}

	void m1(B b) {
		System.out.println("i am in m1 B");

	}

	void m1(D c) {
System.out.println("i am in m1 C");
	}
	public static void main(String[] args) {
		Loading loading = new Loading();
		A a =new A();
		loading.m1(a);
		C bc= new C();
		loading.m1(bc);
		A ab=new B();
		loading.m1(ab);
		//if we pass argument as null it will always give call to the lower subclass in the hierachy
		loading.m1(null);
	}
}
