package com.tdd.leapyear;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class YearServiceTest {


    private YearService yearService = new YearService();

    @Nested
    class isLeapYear_should {

        @ParameterizedTest
        @ValueSource(ints = {2001, 2002, 2003})
        void return_false(int givenYear) {
            assertThat(yearService.isLeapYear(givenYear)).isFalse();
        }

        @ParameterizedTest
        @ValueSource(ints = {2004, 2008})
        void return_true(int givenYear) {
            assertThat(yearService.isLeapYear(givenYear)).isTrue();
        }
    }

}
