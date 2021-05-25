package com.test.singleinheritance;

public class SingleInheritChild extends SingleInheritParent {


	
	public SingleInheritChild() {
		// TODO Auto-generated constructor stub
	}
	void m2() {

		System.out.println("M2 is called from Child=====================");
	}

	public SingleInheritChild(int y) {
		//super(5555);
		// TODO Auto-generated constructor stub
		System.out.println("child constructor is called....=========================" + y);
	}
	public static void main(String[] args) {

		SingleInheritChild obj = new SingleInheritChild(852);
		obj.m1();
	}
}
