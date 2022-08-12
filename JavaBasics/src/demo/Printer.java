package demo;

public class Printer {
	
	public void greetings() {
		System.out.println("Hello Everyone Zahra, I love you!");
	}
		public void printName(String Name) {
			System.out.println("Hello " + ",how are you!");
		}
		public void isEveryonePresent() {
			System.out.println("Yes, everyone is present");
		}
		public void Hello() {
			System.out.println("How are you" + " Tim " + "and" + " Wang ");
						
		}
		
		public void Salam() {
			System.out.println("I have six days off in sep");
			System.out.println("where are you");
			System.out.println("I am fine");
			System.out.println("How is your day so far");
			
			
		}
			
		
		
		
		public static void main(String[] args) {
			//Class object =  new Class();
		
			Printer laserPrinter = new Printer();
			
			//object.method
			laserPrinter.greetings();
			laserPrinter.printName("Tim");
			laserPrinter.isEveryonePresent();
			laserPrinter.Hello();
			laserPrinter.Salam();
			
			
			
			
			
			
		
		}
		
		
					
			
			
			
			
			
			
		
		
		
	}

