package com.test.problemstatements;

public class ObjectCasting {

	void m1() {

		/*String str = "25";
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException ex){
            ex.getMessage();
        }
	}*/
		
		int i = 10;
		try{
            String number = Integer.toString(i);
            System.out.println(10+number);
        }
        catch (NumberFormatException ex){
            ex.getMessage();
        }
		
	}
	public static void main(String[] args) {
          ObjectCasting obj = new ObjectCasting();
         obj.m1(); 
	}	

}



/*public class ObjectCasting {
   public static void main(String args[]) {
	int ivar = 111;
	String str = String.valueOf(ivar);
	System.out.println("String is: "+str); 
	//output is: 555111 because the str is a string 
	//and the + would concatenate the 555 and str
	System.out.println(555+str);
   }
}*/