package com.emp.java;

public class ThisKeyWordConstructorChaining {
	
	public ThisKeyWordConstructorChaining() {
		// TODO Auto-generated constructor stub
		System.out.println("default param const is called");
	}
	
	public ThisKeyWordConstructorChaining(String S) {
		
		// TODO Auto-generated method stub
		System.out.println("one param const is called");

	}
	
    public ThisKeyWordConstructorChaining(String S, int x) {
		this();
		// TODO Auto-generated method stub
    	System.out.println("two param const is called");

	}
	
	public static void main(String[] args) {
		
		ThisKeyWordConstructorChaining obj= new ThisKeyWordConstructorChaining("sam", 222);
		
	}

}
