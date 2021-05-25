package com.test.problemstatements;

import java.util.Scanner;

public class SavingsAccount {

	double balance = 1000;
	int IntrestRate;
	int accountNo;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, int InterestRate, int acccountNo) {
		// TODO Auto-generated constructor stub

	}

	void withDraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter withdrawl amount");
		double withdrawl = sc.nextDouble();

		if (balance >= withdrawl) {
			balance = balance - withdrawl;
			System.out.println("Successfully Withdrawn and " + "remaining balance is " + balance);
		} else {
			System.out.println("Insufficient Balance");
		
		}
	}

	void calculateInterest() {

	}

	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		obj.withDraw();

	}

}