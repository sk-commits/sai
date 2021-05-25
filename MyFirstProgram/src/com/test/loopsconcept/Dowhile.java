package com.test.loopsconcept;

public class Dowhile {

	void m1() {

		int i = 25;

		do {
			
			System.out.println("I am from do while");
			i++;

		} while (i < 20);

		
		System.out.println("I am from out side do while");
	}

	public static void main(String[] args) {

		Dowhile obj = new Dowhile();
		obj.m1();
		

	}

}
