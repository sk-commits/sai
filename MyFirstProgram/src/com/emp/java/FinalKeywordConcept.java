package com.emp.java;

public class FinalKeywordConcept {

	final int x = 20;
	final static String name = "Java";

	void m1(double d, int y) {

		/*
		 * double d; int y = 50
		 */;

		System.out.println("double d value inside m1 method is....." + d);
		System.out.println("y d value inside m1 method is....." + y);

	}

	void m2() {

	}

	public static void main(String[] args) {
		FinalKeywordConcept obj = new FinalKeywordConcept();
		String S = obj.name;
		int M = obj.x;
		System.out.println("string name is .." + name);
		System.out.println("x value in m1 method is......" + M);

		obj.m1(15.235, 100);

	}

}