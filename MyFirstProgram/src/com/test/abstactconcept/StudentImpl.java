package com.test.abstactconcept;

public class StudentImpl extends Student {

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("unimplemented method is called from Student Class " + super.y);
	}

	public static void main(String[] args) {
		Student obj = new StudentImpl();
		StudentImpl objs = new StudentImpl(120);
		obj.m2();
		obj.m1();

	}

	public StudentImpl() {
		// TODO Auto-generated constructor stub
	}

	public StudentImpl(int S) {
		super(100000);
		System.out.println(".............................." + S);

	}

}
