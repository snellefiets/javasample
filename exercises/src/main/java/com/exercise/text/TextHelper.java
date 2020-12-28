package com.exercise.text;

public class TextHelper {

    public String swapLastTwoCharacters(String str) {
        if (str == null || str.length() < 2)
            return str;
        final int stringLength = str.length();
        final char secondLastChar = str.charAt(stringLength - 2);
        final char lastChar = str.charAt(stringLength - 1);
        final String restOfString = str.substring(0, stringLength - 2);
        return restOfString + lastChar + secondLastChar;
    }

    public String truncateAInFirst2Positions(String str) {
        return null;
    }
}
