package com.CLC.test.ques10;

public class Test {
	public void method(String str){
		System.out.println("I am String");
	}
public void method(char[] ch){
	System.out.println("I am Character");
}
public void method(Object object){
	System.out.println("I am Object");
}
public static void main(String[] args) {
	Test t = new Test();
	//ambiguous
	//t.method(null);
	t.method(t);
	t.method("roma");
	t.method('c');
}

}
