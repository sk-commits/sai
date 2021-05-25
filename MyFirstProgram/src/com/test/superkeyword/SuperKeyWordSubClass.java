package com.test.superkeyword;

public class SuperKeyWordSubClass extends SuperKeyWord {
	
	void m1() {
		super.m1();
		System.out.println("m1 is from sub class==========");
		
	}

	public SuperKeyWordSubClass() {
		// TODO Auto-generated constructor stub
	}
	

	public SuperKeyWordSubClass(String S) {
		// TODO Auto-generated constructor stub
		super(100.0);
		System.out.println("String value is============"+ S);
	}
	
	public static void main(String[] args) {
		
		SuperKeyWordSubClass objs = new SuperKeyWordSubClass();
		SuperKeyWordSubClass obj = new SuperKeyWordSubClass("Java");
		objs.m1();
		
		
		
	}
}
