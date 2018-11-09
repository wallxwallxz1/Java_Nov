package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class IterateHashSet {
public static void main(String[] args) {
	
		Set<String> hset = new HashSet<>();
		hset.add("Paul");
		hset.add("peter");
		hset.add("tim");
		hset.add("girl");
		hset.add("abel");
		
		System.out.println(hset);
		
		for (String a : hset) 
		{ 
		    System.out.println(a);
		}
// Alternative 	Method for Loop using Iterator
		
		Iterator<String> it = hset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		Set<String> test = new TreeSet<>(hset); // to preserve the insert order ...
													//the order in which the elements where inserted
												// Note it always sorted  with Capital letters first.
		System.out.println("Preserve Inserted order: "+ test);
		
		
	//Set<String> listNew = new HashSet<>(Arrays.asList("Red", "Green","Black", "White", "Pink"));
			//<>(Arrays.asList("Red", "Green","Black", "White", "Pink"));
		
		Set<String> listNew = new HashSet<>();
		listNew.add("Red");
		listNew.add("Green");
		listNew.add("Black");
		listNew.add("White");
		listNew.add("Pink");
		
		System.out.println(listNew);
		
		if (hset.contains("Green")){
			System.out.println("Color Green is Present");
		}else {
			System.out.println("Color Green is not in the List");
		}
		
		// For LOOP Implementation
		for (String str: hset){
			
		}
	
	
}	
	
	
	
	

}
