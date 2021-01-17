package com.tdd.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void should_return_fizz(int givenNumber) {
        assertThat(fizzbuzz.execute(givenNumber)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10})
    void should_return_buzz(int givenNumber) {
        assertThat(fizzbuzz.execute(givenNumber)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15})
    void should_return_fizzBuzz(int givenNumber) {
        assertThat(fizzbuzz.execute(givenNumber)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14})
    void should_return_original_input(int givenNumber) {
        assertThat(fizzbuzz.execute(givenNumber)).isEqualTo(String.valueOf(givenNumber));
    }


}
