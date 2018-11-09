package com.java.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexZipCode { public static void main(String[] args) {
	
	List <String> zips = new ArrayList<>();
	//Valid ZIP codes
	zips.add("12345"); 
	zips.add("12345-6789"); 
	 
	//Invalid ZIP codes
	zips.add("123456"); 
	zips.add("1234"); 
	zips.add("12345-678");
	 
	zips.add("12345-67890");
	
//	String regex = "^[0-9]{5}(?:-[0-9]){4}?$";  // (?) means optional
												//{} number of place 
												// 
	String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
	Pattern pattern = Pattern.compile(regex);
	
	for (String zip:zips){
		Matcher match = pattern.matcher(zip);
		System.out.println(zip+ ": "+match.matches());
		
	}
	
}

}
