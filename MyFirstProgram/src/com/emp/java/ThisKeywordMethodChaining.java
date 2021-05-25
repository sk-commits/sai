package com.emp.java;

public class ThisKeywordMethodChaining {
	
	void m1() {
		
		System.out.println("m1 is called");
		this.m3();
			
	}
	
	void m2() {
		
		System.out.println("m2 is called");
		

	}
	
	static void m3() {
		
		System.out.println("static m3 is called");
	}
	
	static void m4() {
		
		System.out.println("static m4 is called");
	}
	
	public static void main(String[] args) {
		
		ThisKeywordMethodChaining obj= new ThisKeywordMethodChaining();
		obj.m1();
	}

}
