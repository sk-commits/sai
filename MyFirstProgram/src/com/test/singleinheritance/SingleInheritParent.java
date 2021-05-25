package com.test.singleinheritance;

public class SingleInheritParent {
	
	public SingleInheritParent() {
		// TODO Auto-generated constructor stub
	}

	public SingleInheritParent(int x) {
		// TODO Auto-generated constructor stub

		System.out.println("Parent constructoris called" + x);
	}

	void m1() {

		int z = 40;

		System.out.println("M1 is called from Parent" + z);

		// return z;
	}

	public static void main(String[] args) {
		//SingleInheritParent obj1 = new SingleInheritParent();
		//SingleInheritChild obj2 = (SingleInheritChild) new SingleInheritParent();
		SingleInheritParent x = new SingleInheritParent(5000);
		//SingleInheritChild obj=new SingleInheritChild();
		
		SingleInheritChild obj=new SingleInheritChild();
		SingleInheritChild objs=new SingleInheritChild(10);
		
	
		obj.m2();
		//obj1.m1();

	}

}
