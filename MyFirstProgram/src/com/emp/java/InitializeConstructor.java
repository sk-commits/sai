package com.emp.java;

public class InitializeConstructor {

	static int p;
	String abc;

	public InitializeConstructor(int p) {

		// System.out.println("one para constructor");

		System.out.println("m value is..." + p);

	}

	public InitializeConstructor(int p, String abc) {
		
		this(200);

	 System.out.println("two para constructor");

		// this.p = p; 
		// this.abc = abc;*/

		//System.out.println("p value is..... " + p);
		//System.out.println("string value is ....." + abc);
		// System.out.println("this value of p is ...." + this.p);
		// System.out.println("this value of string is..." + this.abc);

	}

	void m1() {

//InitializeConstructor obj = new InitializeConstructor();

//System.out.println("one param const is called in m1 method..."+p);

		// System.out.println("m1 is called");
		/*
		 * System.out.println("p value is ..."+p);
		 * System.out.println("abc value is... "+ abc);
		 */

	}

	public static void main(String[] args) {

		InitializeConstructor obj = new InitializeConstructor(150);
		 InitializeConstructor objs = new InitializeConstructor(10, "Java");
//obj.m1();

	}

}
