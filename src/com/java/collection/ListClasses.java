package com.java.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListClasses {
	
	public static void main(String[] args) {
		
		List<Integer> listOne = new ArrayList<>();
		listOne.add(12);
		listOne.add(14);
		listOne.add(86);
		listOne.add(76);
		System.out.println(listOne);
		
		List<Integer> listTwo = new LinkedList<>(listOne);
		System.out.println("from link list:"+listTwo);
		listTwo.add(21);
		System.out.println("from link list:"+listTwo); 
		
		
		// Vector is thread safe it allows only one thread to read fromit at time
				// it locks the array until the thread finish reading from it.
		List<Integer > listThree = new Vector<>(listTwo);
		System.out.println("from link vector:"+listThree); 
		
	}

}
