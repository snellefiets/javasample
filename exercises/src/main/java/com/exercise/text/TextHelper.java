package com.exercise.text;

public class TextHelper {

	public String swapLastTwoCharacters(String str) {
		if (str==null || str.length()<2)
			return str;
		final String prefix = str.substring(0, str.length()-2);
		final String firstChar = str.substring(str.length()-2, str.length()-1);
		final String secondChar = str.substring(str.length()-1);
		return prefix + secondChar + firstChar;
	}

	public String truncateAInFirst2Positions(String str) {
		return null;
	}
}
