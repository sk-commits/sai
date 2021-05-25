package com.test.overloading;

public class OverloadingConcept {
	
	private int y;
	private String string;

	void m1() {
		
		
	}
    void m1(int x) {
		
		
	}
    
    int  m1(int y, String S) {
    	this.y=y;
    	this.string = S;
    	System.out.println("m1 is called from parent call==================="+ this.y);
		return 0;
		
		
	}
    
    void m1(String S, int y, int x ) {
    	
    }
	
    public static void main(String[] args) {
    	
    	OverloadingConcept obj = new OverloadingConcept();
        obj.m1(10, "sai");
		
	}

}
