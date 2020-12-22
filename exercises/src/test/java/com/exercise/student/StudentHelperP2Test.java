package com.exercise.student;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


public class StudentHelperP2Test {

    final StudentHelper_P2 helper = new StudentHelper_P2();

    @Nested
    class getGrade_should {

        private static final boolean NON_MATHS = false;
        private static final boolean MATHS = true;
        private static final int GRADE_A_COMMON_UPPER_LIMIT = 100;
        private static final int GRADE_A_COMMON_LOWER_LIMIT = 91;
        private static final int GRADE_B_COMMON_LOWER_LIMIT = 51;
        private static final int GRADE_B_COMMON_UPPER_LIMIT = 90;
        private static final int GRADE_C_DEFAULT_VALUE = 33;
        private static final int GRADE_C_COMMON_UPPER_LIMIT = 50;
        private static final int GRADE_A_MATHS_LOWER_LIMIT = 96;
        private static final int GRADE_B_MATHS_LOWER_LIMIT = 56;
        private static final int GRADE_A_MATHS_UPPER_LIMIT = 105;
        private static final int GRADE_B_MATHS_UPPER_LIMIT = 95;
        private static final int GRADE_C_MATHS_UPPER_LIMIT = 55;

        @ParameterizedTest
        @ValueSource(ints = {GRADE_A_COMMON_LOWER_LIMIT, GRADE_A_COMMON_UPPER_LIMIT})
        void return_A_for_subject_non_maths(int mark) {
            assertThat(helper.getGrade(mark, NON_MATHS)).isEqualTo("A");
        }

        @ParameterizedTest
        @ValueSource(ints = {GRADE_B_COMMON_LOWER_LIMIT, GRADE_B_COMMON_UPPER_LIMIT})
        void return_B_for_subject_non_maths(int mark) {
            assertThat(helper.getGrade(mark, NON_MATHS)).isEqualTo("B");
        }

        @ParameterizedTest
        @ValueSource(ints = {GRADE_C_DEFAULT_VALUE, GRADE_C_COMMON_UPPER_LIMIT})
        void return_C_for_subject_non_maths(int mark) {
            assertThat(helper.getGrade(mark, NON_MATHS)).isEqualTo("C");
        }

        @ParameterizedTest
        @ValueSource(ints = {GRADE_A_MATHS_LOWER_LIMIT, GRADE_A_MATHS_UPPER_LIMIT})
        void return_A_for_subject_maths(int mark) {
            assertThat(helper.getGrade(mark, MATHS)).isEqualTo("A");
        }

        @ParameterizedTest
        @ValueSource(ints = {GRADE_B_MATHS_LOWER_LIMIT, GRADE_B_MATHS_UPPER_LIMIT})
        void return_B_for_subject_maths(int mark) {
            assertThat(helper.getGrade(mark, MATHS)).isEqualTo("B");
        }

        @ParameterizedTest
        @ValueSource(ints = {GRADE_C_DEFAULT_VALUE, GRADE_C_MATHS_UPPER_LIMIT})
        void return_C_for_subject_maths(int mark) {
            assertThat(helper.getGrade(mark, MATHS)).isEqualTo("C");
        }

    }

}
