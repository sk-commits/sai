package com.test.overriding;

public class OverridingChild implements OverridingParent {
	
	double d=20;

	@Override
	public void m1(double d) {
		// TODO Auto-generated method stub

		System.out.println(" M1 is from child class............"+ d);
		
	}
     void m2(double d) {
		
		
	}
	
	public static void main(String[] args) {
	
		OverridingChild obj = new OverridingChild();
		obj.m1(15.01);
	}


}
