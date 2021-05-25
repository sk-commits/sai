package com.emp.java;

public class ReturnTypeConcept {

	double withdrwal(int v) {
		
		System.out.println("withdrawl value is"+v);
		
		
		return currentBalance();

	}

	double currentBalance() {
		
		double d = 1000;
		
		System.out.println("current balance is "+d);
		return d;
 
	}

	public static void main(String[] args) {

		ReturnTypeConcept obj = new ReturnTypeConcept();
		obj.withdrwal(100);

	}

}
