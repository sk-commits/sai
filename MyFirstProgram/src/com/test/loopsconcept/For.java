package com.test.loopsconcept;

public class For {

	void m1() {
       
		for (int x = 0; x < 10; x++) {
			for (int i = x; i < x; i++) {
				
			}

			System.out.println("*" );
		}

	}

	public static void main(String[] args) {

		For obj = new For();
		obj.m1();

	}

}
