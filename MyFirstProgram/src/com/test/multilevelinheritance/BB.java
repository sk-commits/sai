package com.test.multilevelinheritance;

public class BB extends AA{
	
	public BB() {
		// TODO Auto-generated constructor stub
	}
		
	public BB(String S) {
		// TODO Auto-generated constructor stub
		super("Ram");
		System.out.println("Class BB one param string is called============="+ S);
	}
	public BB(String A, String B) {
		// TODO Auto-generated method stub
		super("Y", "Z");
		System.out.println("Class BB two param string is called============="+ A);
		System.out.println("Class BB two param string is called============="+ B);
		
	}
	
	public static void main(String[] args) {
		BB obj = new BB("Java");
		BB obj1 = new BB("Mass","Maharaja");
		
			
	}

}



