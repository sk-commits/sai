package com.test.abstactconcept;

public abstract class Student {

	int y = 555;

	void m1() {

		
		System.out.println("M1 int value from Student" + y);

		System.out.println("M1 is called from Student");

	}

	abstract void m2();

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int x) {

		System.out.println("ONE PARAM Parent is called............." + x);

	}

	public static void main(String[] args) {
		// Student obj = new Student();

	}

}
