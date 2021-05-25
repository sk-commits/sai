package com.test.multipleinheritance;

public class Z implements X,Y{
	
	int m3() {
		
		System.out.println("m3 is called=============");
		
		return 0;
	}


	public static void main(String[] args) {
		
		Z obj= new Z();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}


	@Override
	public int m2() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int m1() {
		// TODO Auto-generated method stub
		return 0;
	}
}


