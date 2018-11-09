package JavaMaps;

import java.util.HashMap;
import java.util.*;

public class MapExamples {
	
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(120, "Paul");
		hmap.put(121, "Peter");
		hmap.put(345, "Sam");
		hmap.put(789, "John");
		
		System.out.println(hmap);  // prints the entire set both key and values
		System.out.println(hmap.get(345));  // get a particular element
		System.out.println(hmap.remove(345));  // Removes a particular element
		System.out.println(hmap);  // prints the entire set both key and values
		
		
		//LOOP in Maps
		Iterator<Integer> itr = hmap.keySet().iterator();  // creates an iterator 
		while (itr.hasNext()){
			Integer key = itr.next();
			String value = hmap.get(key);
			System.out.println("This is the Keys: "+key +" "+"This the value: "+value);
			System.out.println("");
			System.out.println("This is the Keys: "+key +" "+"This the value: "+value);
			
			
			//Complete this code from GitHup;
			
			
		}
	}
	

	





}