package com.clc.abstract_classes;

import com.clc.interfaces.IWalkable;
import com.clc.interfaces.Italkable;

public class Test2 implements Italkable{

	@Override
	public void walk() {
		System.out.println("can walk");
		
	}

	@Override
	public int talk() {
		System.out.println("can talk");
		return 0;
	}

	@Override
	public void sleep() {
		System.out.println("can sleep");
		
		
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.walk();
		t.talk();
		t.sleep();
		//static variable of interface
		System.out.println(IWalkable.a);
	}

}
