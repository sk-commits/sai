package accessmodifiers1;

public class A {
	
	public int V = 23;

	public void Add(){
		
		int x=15;
		
		System.out.println("add method is called"+x);
		
	}
	
	public static String sub(){
		String s="Java";
		
		System.out.println("sub method is called"+s);
		return s;
		
	}
	
	int m1() {
		
		int V=10;
		
	System.out.println("default M1 parameter is called");
	return V;
	
	}
	
	public static void main(String[] args) {
		A obj = new A();
	}

}
