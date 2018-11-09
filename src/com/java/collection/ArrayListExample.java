package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {
	
	
	public static void main(String[] args) {
		List <String> names = new ArrayList<String>();
		List <Integer>  numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(names); // Empty List 
		
	//Adding elements to List 	
		names.add("Alex");
		names.add("Josh");
		names.add("Mike");
		
	System.out.println(names); // list Names	
		
	names.remove("Alex");  // Removes the first name
		
	System.out.println("Names after removing an element: "+names); 
	
	names.add("Brian") ;
	System.out.println("Names after adding Brian: "+names); 
	
	names.set(0, "Paul"); // Setting an element in to list and determining the position
	
	//Iterator 
		Iterator<Integer > it = numbers.iterator();  // recall that Integer is wrapper class for int 
														// like wise for all primitive class
		
		while(it.hasNext()){
			System.out.println("Iterator Implementation: "+it.next());
		}
		
		
	// new List adding an entire collection to another list 
		List <String> newNames = new ArrayList<>();
		newNames.add("Steeve");
		newNames.addAll(names); // adding all elements from another list or array
		System.out.println(newNames); 
		
		ArrayList<String>arrayListObject = new ArrayList<>();
		arrayListObject.add("A");
		arrayListObject.add("B");
		arrayListObject.add("C");
		arrayListObject.add("D");
		
		System.out.println(arrayListObject);
		ArrayList<String> arrayListClone = (ArrayList<String>)arrayListObject.clone();
		System.out.println(arrayListClone);
		
		System.out.println(arrayListClone.contains("A"));  //check for if the list contain "a"
		System.out.println(arrayListClone.contains("E"));
		System.out.println(arrayListClone.indexOf("A")<=2);   // finding an element before the third element
		
		ArrayList<String>listOne = new ArrayList<>(Arrays.asList("a","b","c","d","f","z"));
		ArrayList<String>listTwo = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		
		Collections.sort(listOne);
		Collections.sort(listTwo);
		
		boolean isEqual = listOne.equals(listOne);  // compares two object if they are same 
		System.out.println(isEqual);
		
		
	// Removes all the elements of another list.... thereby comparing two list	
		//		listOne.removeAll(listTwo);    // the are both commented because codes below can run uncomment to see result	
		//		System.out.println(listOne);
		
		listTwo.retainAll(listOne);
		System.out.println("These method prints all different value: "+listOne );
		
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,3,3,4,5,6,7,7,8));
		ArrayList<Integer>subListOfNumberList = new ArrayList<>(numberList.subList(3, 8));
		System.out.println(subListOfNumberList);
		//complete this code at home 
		
		
		
		
		
		
		
	}

}
