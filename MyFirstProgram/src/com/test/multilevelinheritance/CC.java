package com.test.multilevelinheritance;

public class CC extends BB {

	void m1() {
		
		System.out.println("M1 is called from CC sub class===================");

	}
	
	public CC() {
		// TODO Auto-generated constructor stub
	}
	
	public CC(String S) {
		// TODO Auto-generated constructor stub
		super("Java");
		System.out.println("Class CC one param string is called============="+ S);
	}
	public CC(String A, String B) {
		// TODO Auto-generated method stub
		super("Peter", "Henry");
		System.out.println("Class CC two param string is called============="+ A);
		System.out.println("Class CC two param string is called============="+ B);
		
	}


	public static void main(String[] args) {
		CC obj = new CC("Core");

	}

}
