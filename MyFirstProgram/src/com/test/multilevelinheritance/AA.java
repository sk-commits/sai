package com.test.multilevelinheritance;

public class AA {
	
	void m3() {
		
		System.out.println("M3 is called from AA sub class===================");
	}
	
	public AA() {
		// TODO Auto-generated constructor stub
	}
		
	public AA(String S) {
		// TODO Auto-generated constructor stub
		System.out.println("Class AA one param string is called============= "+ S);
	}
	
	public AA(String A, String B) {
		// TODO Auto-generated method stub
		System.out.println("Class AA two param string is called============="+ A);
		System.out.println("Class AA two param string is called============="+ B);
		
	}
	
	public static void main(String[] args) {
		
		AA obj = new AA("Y", "Z");
		
		
	}

}
