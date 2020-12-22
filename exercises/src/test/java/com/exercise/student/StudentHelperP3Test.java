package com.exercise.student;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


public class StudentHelperP3Test {

    final StudentHelper_P3 helper = new StudentHelper_P3();

    @Nested
    class willQualifyForQuiz_should {

        public static final boolean NON_MATHS = false;
        private static final boolean MATHS = true;
        public static final int YES_COMMON_LOWER_LIMIT = 80;
        public static final int MAYBE_COMMON_LOWER_LIMIT = 21;
        public static final int YES_MATHS_LOWER_LIMIT = 85;
        public static final int MAYBE_MATHS_LOWER_LIMIT = 26;

        @ParameterizedTest
        @ValueSource(ints = {YES_COMMON_LOWER_LIMIT, YES_COMMON_LOWER_LIMIT + 15})
        void return_YES_for_subject_non_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, NON_MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(0, mark, NON_MATHS)).isEqualTo("YES");
        }

        @ParameterizedTest
        @ValueSource(ints = {MAYBE_COMMON_LOWER_LIMIT, YES_COMMON_LOWER_LIMIT - 1})
        void return_MAYBE_for_subject_non_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, NON_MATHS)).isEqualTo("MAYBE");
            assertThat(helper.willQualifyForQuiz(0, mark, NON_MATHS)).isEqualTo("MAYBE");
        }

        @ParameterizedTest
        @ValueSource(ints = {0, MAYBE_COMMON_LOWER_LIMIT - 1})
        void return_NO_for_subject_non_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, NON_MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(0, mark, NON_MATHS)).isEqualTo("NO");
        }

        @ParameterizedTest
        @ValueSource(ints = {YES_MATHS_LOWER_LIMIT, YES_MATHS_LOWER_LIMIT + 15})
        void return_YES_for_subject_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, MATHS)).isEqualTo("YES");
            assertThat(helper.willQualifyForQuiz(0, mark, MATHS)).isEqualTo("YES");
        }

        @ParameterizedTest
        @ValueSource(ints = {MAYBE_MATHS_LOWER_LIMIT, YES_MATHS_LOWER_LIMIT - 1})
        void return_MAYBE_for_subject_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, MATHS)).isEqualTo("MAYBE");
            assertThat(helper.willQualifyForQuiz(0, mark, MATHS)).isEqualTo("MAYBE");
        }

        @ParameterizedTest
        @ValueSource(ints = {0, MAYBE_MATHS_LOWER_LIMIT - 1})
        void return_NO_for_subject_maths(int mark) {
            assertThat(helper.willQualifyForQuiz(mark, 0, MATHS)).isEqualTo("NO");
            assertThat(helper.willQualifyForQuiz(0, mark, MATHS)).isEqualTo("NO");
        }

    }


}
