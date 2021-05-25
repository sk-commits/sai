package com.test.multilevelinheritance;

public class DD extends CC {

	void m2() {
		
		System.out.println("M2 is called from DD sub class===================");

	}
	
	public DD() {
		// TODO Auto-generated constructor stub
	}
	public DD(String S) {
		// TODO Auto-generated constructor stub
		System.out.println("Class DD one param string is called============="+ S);
	}

	public DD(String S, String B) {
		// TODO Auto-generated constructor stub
		super("Tom", "David");
		System.out.println("Class DD two param string is called============="+ S);
		System.out.println("Class DD two param string is called============="+ B);
		
	}

	
	public static void main(String[] args) {
		
		DD objs= new DD("P","S");
		
		/*DD obj = new DD();
		obj.m2();
		obj.m1();
		obj.m3();*/

	}

}
