package com.test.overloading;

public class OverloadingSubclass extends OverloadingConcept {
	
	void m1() {
		
		
	}
    void m1(int x) {
		
		
	}
    
    int m1(int y, String S) {
		
		System.out.println("m1 is called from sub call===================");
		return m1(y, S);
	}
    
    void m1(String S, int y, int x ) {
    	
    }
    
    public static void main(String[] args) {
    	OverloadingSubclass obj = new OverloadingSubclass();
    	obj.m1(10, "S");
		
	}
	

}
