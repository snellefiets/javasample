package com.exercise.text;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextHelperTest {

    TextHelper helper = new TextHelper();

    @ParameterizedTest
    @CsvSource({",", "A,A", "BA,AB", "RANI,RAIN"})
    public void testSwapLastTwoCharacters(String given, String expected) {
        assertThat(helper.swapLastTwoCharacters(given)).isEqualTo(expected);
    }

    @Test
    @Disabled
    public void testTruncateAInFirst2Positions() {
        assertEquals("", helper.truncateAInFirst2Positions(""));
        assertEquals("BCD", helper.truncateAInFirst2Positions("ABCD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("BCD", helper.truncateAInFirst2Positions("BACD"));
        assertEquals("BBAA", helper.truncateAInFirst2Positions("BBAA"));
    }
}
