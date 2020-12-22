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

//    @Test
//    public void testGetGrade() {
//
//        assertEquals("A", helper.getGrade(99, false));
//        assertEquals("A", helper.getGrade(91, false));
//        assertEquals("B", helper.getGrade(85, false));
//        assertEquals("B", helper.getGrade(51, false));
//        assertEquals("C", helper.getGrade(50, false));
//        assertEquals("C", helper.getGrade(45, false));
//
//        assertEquals("A", helper.getGrade(99, true));
//        assertEquals("A", helper.getGrade(96, true));
//        assertEquals("B", helper.getGrade(89, true));
//        assertEquals("B", helper.getGrade(56, true));
//        assertEquals("C", helper.getGrade(55, true));
//        assertEquals("C", helper.getGrade(50, true));
//        assertEquals("C", helper.getGrade(45, true));
//
//        //Will fail due to wrong implementation
//        //assertEquals("B",helper.getGrade(95, true));
//        //assertEquals("B",helper.getGrade(90, false));
//    }

}
