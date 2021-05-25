package com.test.loopsconcept;

public class If {
	
	void m1() {
		int x = 10;
		int y= 5;
		
		if (x>=10) {
			
			System.out.println("X value is.........."+x);
			
		}if(y<5) {
			System.out.println("X value from second if statement .........."+x);
			
		}else {
			
			System.out.println("I am from else");
		}
		
	}

	public static void main(String[] args) {
		If obj = new If();
		obj.m1();
		
	}
}
