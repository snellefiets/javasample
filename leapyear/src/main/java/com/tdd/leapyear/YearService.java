package com.tdd.leapyear;

public class YearService {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) return true;
        return false;
    }
}
