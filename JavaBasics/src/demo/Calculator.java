package demo;

public class Calculator {
	
	public void add (int a, int b) {
		
		System.out.println(a+b);
	}
	
	
	
		
		 public void subtract(int a, int b) {
	    	   System.out.println(a-b);
	    	   
			
	}
	
		 public void multiply(int a, int b) {
			 System.out.println(a * b);
		 }
		 
		 public static void divide(int a, int b)  {
		System.out.println(a / b);
			 
		 }
		 
	public static void main(String [] args) {
		
		// Class object = Class();
		
		Calculator basicCalculator = new Calculator();
		
		//object.method()
		
       basicCalculator.add(10, 20);
       basicCalculator.subtract(15, 10);
       basicCalculator.multiply(20, 30);
       basicCalculator.divide(100, 2);
       
       
      
    	   
       
		
	}
	
	
	
	
	
	
	
	

}
