package collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<String>();
	
	//object.method() being used to store items in the HashSet
	cities.add("London");
	cities.add("Paris");
	cities.add("New York");
	cities.add("Tokyo");
	cities.add("Los Angeles");
	cities.add("Birmingham");
	cities.add("London");
	//Retrieve the items
	for (String t : cities) { //for-each loop
	System.out.println(t);	
	}
	System.out.println();
	//accessing the items using index
	//System.out.println("Items stored at index 2 = " + cities.get(2));
	//index of new york
	//System.out.println("Index of New york = " + cities.indexOf("New York"));
	//total number of items stored in the HashSet
	//System.out.println("Total number of items stored = " + cities.size());


}


}
