package demo;

public class Test {
	
	// Calling methods of one class in another class
	//Call add() method from calculator class in this class
	public static void main(String[] args) {
		//Class object = new Class();
		Calculator calculator = new Calculator();
		calculator.add(20, 30);
		
		
		//call the greetings method from the printer class in this class
		// create object of that class which contains your method
		Printer printer = new Printer();
		printer.greetings();
		
		// call the calculator class in this class
		//call subtract () method from calculator class in this class
		calculator.subtract(15, 10);
		
		// Calling the calculator class in this class
		//call  () method from calculator class in this class
		
		
		
		
		
		
		
	}

}
