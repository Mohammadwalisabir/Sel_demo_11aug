package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Class object = new Class()
		ArrayList<String> cities = new ArrayList<String>();
		//object.method() being used to store items in the arraylist
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Tokyo");
		cities.add("Los Angeles");
		cities.add("Birmingham");
		
		//Retrieve the items
		for (String t: cities) { //for-each loop
		System.out.println(t);	
		}
		System.out.println();
		//accessing the items using index
		System.out.println("Items stored at index 2 = " + cities.get(2));
		//index of new york
		System.out.println("Index of New york = " + cities.indexOf("New York"));
		//total number of items stored in the arraylist
		System.out.println("Total number of items stored = " + cities.size());
	}

}
