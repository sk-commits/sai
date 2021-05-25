package accessmodifiers2;

import accessmodifiers1.A;

public class B {
	
	void m1() {
		this.m2();
		System.out.println("Class B m1 method is called");
		
	}
	
	void m2() {
	
		A obj = new A();
		String s = obj.sub();
				
	}
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.m1();
		
		
		
		
	}

}
