package com.java.collection;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArraysExamples {
	
	public ArraysExamples(){
		
	}
	public static void main(String[] args) {
		String array[] = new String[]{"First","Second", "Third", "Fourth"};
		System.out.println(Arrays.toString(array));
		
		String[]arr1 = new String[]{"Fifth","Sixth"};
		String[]arr2 = new String[]{"","Sixth"};
		String [][] doubleArray = new String [][]{arr1,arr2};
		
		System.out.println(Arrays.deepToString(doubleArray));
		
		String [] names = {"Alex", "Brian","David"};
		System.out.println(Arrays.toString(names));
		
		String []cloneOfnames = names.clone();
		
		System.out.println(Arrays.toString(cloneOfnames));
		
		String [] partialNames = Arrays.copyOf(names, names.length);
		
		String [] copyOfNames = Arrays.copyOfRange(names, 0, 2);
		
		System.out.println(Arrays.toString(partialNames));
		System.out.println("");
		System.out.println(Arrays.toString(copyOfNames));
		
		
		// How to use regular expression to separate a string 
		
		String str = "How to code in java";
		
		String [] words = null;
		
		words = str.split(" ");
		
		Pattern pattern = Pattern.compile(" ");  // the pattern is an empty space " " not ""
		
		words = pattern.split(str);
		
		System.out.println(Arrays.toString(words));
		
		// Another Method
		
		String newStr = String.join(" ", words);  // the pattern is an empty space " " not ""
		
		System.out.println(newStr);
		System.out.println("");
		
		
		//Passing a String to an array using regular Expression from the package java.util.regex.Pattern;
		
		String strOne = "alex,brian,charles,david";
		
		Pattern pattern2 = Pattern.compile(",");
		
		String [] nameOfArray = pattern2.split(strOne);
		
		nameOfArray = pattern2.split(strOne);
		
		System.out.println(Arrays.toString(nameOfArray));
	
	//
		
		
		
		
		
	}

}
