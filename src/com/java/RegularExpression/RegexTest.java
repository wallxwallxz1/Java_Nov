package com.java.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	public static void main(String[] args) {
		List <String>emails = new ArrayList<>();
		emails.add("user@domain.com");
		emails.add("user@domain.co.in");
		emails.add("user@domain.com");
		emails.add("use1r@domain.com");
		emails.add("username@domain.com");
		emails.add("user@domain.co.im");
		emails.add("user@domaincom");
//Invalid emails
		emails.add("user#domain.com");
		emails.add("@domaincom");
		
	//	String regex = "^(.+)@(.+)$";				// u can use this or the one below  line 24 to run the program
		String regex =  "^[A-ZA-z0-9+_.-]+@(.+)$";	//
		/*
		 * 1) A-Z allowed
		 * 2) a-z allowed
		 * 3) 0-9 allowed
		 * 3) Additionally email may contain only dot(.), dash(-) and underscore(_)
		 * */
		Pattern pattern = Pattern.compile(regex);
		
		for(String email:emails){
			Matcher match = pattern.matcher(email);
			System.out.println(email+": "+match.matches());	
		}
		
		
	}

}
