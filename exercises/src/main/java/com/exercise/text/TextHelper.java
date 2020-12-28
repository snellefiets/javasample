package com.exercise.text;

public class TextHelper {

	public String swapLastTwoCharacters(String str) {
		if (str==null || str.length() < 2)
			return str;
		final int stringLength = str.length();
		final String prefix = str.substring(0, stringLength-2);
		final String firstChar = str.substring(stringLength-2, stringLength-1);
		final String secondChar = str.substring(stringLength-1);
		return prefix + secondChar + firstChar;
	}

	public String truncateAInFirst2Positions(String str) {
		return null;
	}
}
