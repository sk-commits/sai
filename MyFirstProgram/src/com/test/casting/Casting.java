package com.test.casting;

public class Casting {
	
	double i=20.01;
	 int d=(int) i;
	
	int m1() {
		
		System.out.println("M1........."+d);
		return 0;
	}

	public static void main(String[] args) {
		
		Casting obj = new Casting();
		obj.m1();
	}
}
