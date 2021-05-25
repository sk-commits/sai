package com.test.loopsconcept;

public class Ifelseif {

	/*String S= "Java";

	void m1() {
		
		this.S=S;

		if (S.equals("john")) {
			
			System.out.println("Result from If condition....."+ this.S);

		} else if (S.equals("Ravi")) {
			
			System.out.println("Result from First ElseIf condition....."+ this.S);

		} else if (S.equals("Java")) {
			
			System.out.println("Result from Second ElseIf condition....."+ this.S);

		}

	}*/
	
	void m2() {
		
		int x=20;
		
		if (10>x) {
			
			System.out.println(".................");
			
		}else if (10<x) {
			
			System.out.println("from else if");
			
		}
	}

	public static void main(String[] args) {
		Ifelseif obj = new Ifelseif();
		//obj.m1();
		obj.m2();

	}

}
