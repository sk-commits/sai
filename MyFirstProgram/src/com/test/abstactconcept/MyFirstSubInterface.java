package com.test.abstactconcept;

public class MyFirstSubInterface implements MyFirstInterface{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1 is called from Interface class");
		
	}
	
	public static void main(String[] args) {
		MyFirstInterface obj=new MyFirstSubInterface();
		obj.m1();
		
	}


}
