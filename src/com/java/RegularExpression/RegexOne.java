package com.java.RegularExpression;

import java.util.regex.Pattern;

public class RegexOne {

	public static void main(String[] args) {
		
		String content = "This java book "+"This not javabook";  // 
		
//		content.equals("b");
//		System.out.println(content.equalsIgnoreCase("book"));
		
		String pattern = ".*book.*";
		boolean isMatch = Pattern.matches(pattern, content);  // checks for case sensitivity
		System.out.println(isMatch);
		
		String str = "This is java tutorial class and demo Tutorial";
		//String pattern2 = Pattern.matches(str, input)   complete from gitHub
		

	}

}
