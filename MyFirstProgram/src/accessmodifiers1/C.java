package accessmodifiers1;

public class C {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.m1();
		int s=obj.V;
		System.out.println("Class A... int value is " + s);
	}

}