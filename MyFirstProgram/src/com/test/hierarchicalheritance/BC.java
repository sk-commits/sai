package com.test.hierarchicalheritance;

public class BC extends BA {
	
	int m2() {
		int x=50;
		System.out.println("M2 is called from child=========="+x);
		return x;
	}
	
	public static void main(String[] args) {
		BC obj = new BC();
		obj.m2();
		obj.m1();
		
	}

}
