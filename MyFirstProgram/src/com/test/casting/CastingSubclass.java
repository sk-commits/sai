package com.test.casting;

public class CastingSubclass extends Casting {
	
	int m2() {
		
		System.out.println("M1 is from sub class............");
		return 0;
	}
	
	public static void main(String[] args) {
		Casting parent = new CastingSubclass();
		//CastingSubclass child = new CastingSubclass();
		((CastingSubclass)parent).m1();
		//child= (CastingSubclass)parent;
		//child.m2();
	}

}

