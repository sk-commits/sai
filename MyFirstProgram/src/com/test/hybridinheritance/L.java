package com.test.hybridinheritance;

public class L implements J,K {
	
 public void m1() {
	 
	 System.out.println("m1 is called============");
	
	
}
	
	public static void main(String[] args) {
		
		L obj = new L();
		obj.m1();
		obj.m2();
		obj.m3();
	    obj.m4();
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("m2 Parent is called=========== ");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("m4 Parent is called=========== ");	
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 Parent is called=========== ");
	}

}
