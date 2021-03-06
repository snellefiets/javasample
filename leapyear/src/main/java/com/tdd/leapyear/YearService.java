package com.tdd.leapyear;

public class YearService {
    public boolean isLeapYear(int year) {
        if (isDivisible(year, 100) && !isDivisible(year, 400))
            return false;
        else
            return isDivisible(year, 4);
    }

    private boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
