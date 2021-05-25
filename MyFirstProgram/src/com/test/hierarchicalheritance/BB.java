package com.test.hierarchicalheritance;

public class BB extends BA {
	
	int m1() {
		int x=20;
		System.out.println("M! is called from child=========="+x);
		return x;
	}

	public static void main(String[] args) {
		BB obj= new BB();
		obj.m1();
	}
}
