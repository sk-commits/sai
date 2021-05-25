package com.test.loopsconcept;

public class While {

	void m1() {

		int i = 25;

		while (i > 20) {

			System.out.println("I value is ........." + i);

			i--;

		}

	}

	public static void main(String[] args) {

		While obj = new While();
		 obj.m1();

	}

}
