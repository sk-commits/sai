package com.emp.java;

public class MethodChaining {

	void m1() {

		System.out.println("m1 is called through m3");

		int x = 15;

		System.out.println(x);


	}

	void m2() {

		/*
		 * System.out.println("in m1 declared and m2 is called");
		 * 
		 * m1();
		 */

	}

	static void m3() {

		System.out.println("//m3 logic is called through m1");
		
	    MethodChaining emp=new MethodChaining();
	    emp.m1();

	}

	static void m4() {

	}

	public static void main(String[] args) {

		MethodChaining emp = new MethodChaining();
		emp.m3();

	}

}
