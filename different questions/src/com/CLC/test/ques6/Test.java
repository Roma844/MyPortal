package com.CLC.test.ques6;

public class Test {
public static void main(String[] args) {
	Animal animal=new Animal();
	Dog ds= new Dog();
	//super can't be cast into subclass...class cast exception 
	//Dog d= (Dog)animal;
	//subclass can be cast to super..
	Animal a= (Animal)ds;
}
}
