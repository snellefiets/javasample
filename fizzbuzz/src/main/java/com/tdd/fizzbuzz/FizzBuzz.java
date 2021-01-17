package com.tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String execute(int number) {
        if (isBuzz(number) && isFizz(number))
            return FIZZ_BUZZ;
        else if (isBuzz(number))
            return BUZZ;
        else if (isFizz(number))
            return FIZZ;
        else
            return String.valueOf(number);
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
