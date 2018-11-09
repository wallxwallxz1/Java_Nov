package com.java.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTwo {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("test");
		names.add("Test123");
		names.add("test123-");  //contains special character
		
		String regex = "^[a-zA-z0-9]+$";
		Pattern pattern = Pattern.compile(regex);  // pattern created 
		
		for(String name:names){
			Matcher matcher = pattern.matcher(name); //compares each item in names array to pattern on line 17
			System.err.println(matcher.matches());
		}
		
	}

}
