package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//import java.util.ListIterator;

public class CollectionQuestion {
	
	/*[A,B,C,D]
	 * [A,B,C,D,A,A]
	 * [C,D,A,A,]
	 * C
	 * D
	 * A
	 * A
	 * 
	 * Using Linklist to output the information above
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));
		System.out.println(list);
		
		list.add("A");
		list.add("A");
		
		System.out.println(list);
		list.remove(0);
		list.remove("B");
		
		System.out.println(list);
		//System.out.print(list);
		
//		ListIterator<E> <String> it = LinkedList.listIterator();
//			while(it.hasNext()){
//				
//			}
//		
	//	ArrayList.iterator it = ArrayList<String>

		
		System.out.println("");
		
	// Test 2 Question
		/* String [] str3 = [A,B,C,D];
		 * Convert String array into linkedList object
		 * Output:
		 *[A,B,C,D];  this should be an Array
		 * [A,B,C,D]; this should be a LinkedList
		 * 
		 * */
	
		
		
		String [] str = {"A","B","C","D"};
		
		System.out.println("Solution to Test 2 this an Array: "+Arrays.toString(str));
		
		LinkedList<String> str1 = new LinkedList<>(Arrays.asList(str));

		System.out.println("Solution to Test 2: "+str1);
		
		/* original List 
		 * 
		 * 
		 * */
		
		String [] strNew = {"A","C","B","D"};
		LinkedList<String> strNew1 = new LinkedList<>(Arrays.asList(strNew));
		System.out.println("This from the new Linked list strNew: "+strNew1);
		
		//Sorting a List using Collections
		
		Collections.sort(strNew1);  // note here u can only pass List not an array 
		System.out.println("strNew after sort: "+strNew1);
		
		// Reversing the order of a list
		Collections.reverse(strNew1);
		// Collections.sort(strNew1, Collections.reverseOrder()); same an above
		System.out.println("Reversing the List: "+strNew1);
		
	}

}
