package com.java.RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardChecker {

	public static void main(String[] args) {
		
		List <String> card = new ArrayList<>();
		card.add("4111 1111 1111 1111");
		card.add("5500 0000 0000 0004");
		card.add("3400 0000 0000 009");
		card.add("3000 0000 0000 04");
		card.add("3000 0000 0000 04");
		card.add("6011 0000 0000 0004");
		card.add("2014 0000 0000 009");
		card.add("3088 0000 0000 0009");
		
		// Invalid Cards
		card.add("20140000 0000 009AD");
		card.add("3088 0000 0000 0009@");
		card.add("2014 0000 0000 009utbh");
		card.add("3088 0000 0000 0009@");
		
		String regex =  "^(?:(?<visa>4[0-9]{12}(:[0-9]{3}?))$";  //compy from teacher 
	
		Pattern pattern = Pattern.compile(regex);
		
		for (String cards:card){
			
			Matcher match = pattern.matcher(cards);
			System.out.println(cards+":    "+match.matches());
		}
	}

}
