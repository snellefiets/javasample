package com.exercise.student;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StudentHelperP3Test {

    final StudentHelper_P3 helper = new StudentHelper_P3();

    @Nested
    class willQualifyForQuiz_should {

        private static final boolean NON_MATHS = false;
        private static final boolean MATHS = true;
        private static final int YES_COMMON_LOWER_LIMIT = 80;
        private static final int NO_COMMON_UPPER_LIMIT = 20;
        private static final int YES_MATHS_LOWER_LIMIT = 85;
        private static final int NO_MATHS_UPPER_LIMIT = 25;
        private static final int MAYBE_DEFAULT_VALUE = 50;

        @Test
        void return_NO_when_at_least_one_is_notGood() {
            assertThat(helper.willQualifyForQuiz(NO_COMMON_UPPER_LIMIT, MAYBE_DEFAULT_VALUE, NON_MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(MAYBE_DEFAULT_VALUE, NO_COMMON_UPPER_LIMIT, NON_MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(NO_COMMON_UPPER_LIMIT, NO_COMMON_UPPER_LIMIT, NON_MATHS)).isEqualTo("NO");

            assertThat(helper.willQualifyForQuiz(NO_MATHS_UPPER_LIMIT, MAYBE_DEFAULT_VALUE, MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(MAYBE_DEFAULT_VALUE, NO_MATHS_UPPER_LIMIT, MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(NO_MATHS_UPPER_LIMIT, NO_MATHS_UPPER_LIMIT, MATHS)).isEqualTo("NO");
        }

        @Test
        void return_YES_when_at_least_one_isGood_but_nobody_is_notGood() {
            assertThat(helper.willQualifyForQuiz(YES_COMMON_LOWER_LIMIT, MAYBE_DEFAULT_VALUE, NON_MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(MAYBE_DEFAULT_VALUE, YES_COMMON_LOWER_LIMIT, NON_MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(YES_COMMON_LOWER_LIMIT, YES_COMMON_LOWER_LIMIT, NON_MATHS)).isEqualTo("YES");

            assertThat(helper.willQualifyForQuiz(YES_MATHS_LOWER_LIMIT, MAYBE_DEFAULT_VALUE, MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(MAYBE_DEFAULT_VALUE, YES_MATHS_LOWER_LIMIT, MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(YES_MATHS_LOWER_LIMIT, YES_MATHS_LOWER_LIMIT, MATHS)).isEqualTo("YES");
        }

        @Test
        void return_MAYBE_when_both_are_neither_good_nor_bad() {
            assertThat(helper.willQualifyForQuiz(YES_COMMON_LOWER_LIMIT - 1, NO_COMMON_UPPER_LIMIT + 1, NON_MATHS)).isEqualTo("MAYBE");
            assertThat(helper.willQualifyForQuiz(NO_COMMON_UPPER_LIMIT + 1, YES_COMMON_LOWER_LIMIT - 1, NON_MATHS)).isEqualTo("MAYBE");

            assertThat(helper.willQualifyForQuiz(YES_MATHS_LOWER_LIMIT - 1, NO_MATHS_UPPER_LIMIT + 1, MATHS)).isEqualTo("MAYBE");
            assertThat(helper.willQualifyForQuiz(NO_MATHS_UPPER_LIMIT + 1, YES_MATHS_LOWER_LIMIT - 1, MATHS)).isEqualTo("MAYBE");

        }


    }


}
