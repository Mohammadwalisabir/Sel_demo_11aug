package demo2;

public class Car {

	String color; //Global variables being declared
	String engineType;

	public Car(String colorOfCar, String typeOfEngine) {
	color = colorOfCar;//Global variables being initialized
	engineType = typeOfEngine;

}
public void printCarInfo() {
	System.out.println("Color of car =" + color);
	System.out.println("Type of engine =" + engineType);
}


   public static void main(String[] args) {
	  Car mercedes = new Car("silver", "patrol");
	  Car audi = new Car("black", "diesel");
	  
	  //object.method()
	  mercedes.printCarInfo();
	  audi.printCarInfo();
	}

}



