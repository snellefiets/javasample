package com.tdd.leapyear;

public class YearService {
    public boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }
}
