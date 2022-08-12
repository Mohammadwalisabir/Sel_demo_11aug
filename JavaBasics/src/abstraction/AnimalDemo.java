package abstraction;

public class AnimalDemo {
	public static void main(String[] args) {
		//ParentClass object = new ChildClass()
		Animal tigger = new Tiger();
		tigger.eat();
		tigger.sleep();
		tigger.run();
		tigger.numberOflegs();
		System.out.println();
		
		
		Animal ele = new Elephant();
		ele.eat();
		ele.sleep();
		ele.run();
		ele.numberOflegs();
		
		
		//Interface object = new ImplementingClass();
		SpecialFeatures ele1 = new Elephant();
		ele1.tusk();
		
		
		System.out.println();
		Animal doggo = new Dog();
		doggo.eat();
		doggo.sleep();
		doggo.run();
		doggo.numberOflegs();
		
	}

}
