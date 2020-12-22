package com.exercise.student;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentHelperP1Test {

	private static final int GRADE_B_COMMON_LOWER_LIMIT = 51;
	private static final int GRADE_B_COMMON_UPPER_LIMIT = 80;
	private static final int GRADE_B_MATH_UPPER_LIMIT = 90;
	private static final int GRADE_B_DEFAULT_VALUE = 66;

	final StudentHelper_P1 helper = new StudentHelper_P1();

	@Nested
	class isGradeB_should {

		@ParameterizedTest
		@ValueSource(ints = {GRADE_B_COMMON_LOWER_LIMIT, GRADE_B_DEFAULT_VALUE, GRADE_B_MATH_UPPER_LIMIT})
		void return_true_for_subject_math(int marks) {
			assertEquals(true, helper.isGradeB(marks, true));
		}

		@ParameterizedTest
		@ValueSource(ints = {GRADE_B_COMMON_LOWER_LIMIT - 1, GRADE_B_MATH_UPPER_LIMIT + 1})
		void return_false_for_subject_math(int marks) {
			assertEquals(false, helper.isGradeB(marks, true));
		}

		@ParameterizedTest
		@ValueSource(ints = {GRADE_B_COMMON_LOWER_LIMIT, GRADE_B_DEFAULT_VALUE, GRADE_B_COMMON_UPPER_LIMIT})
		void return_true_for_subject_non_math(int marks) {
			assertEquals(true, helper.isGradeB(marks, false));
		}


		@ParameterizedTest
		@ValueSource(ints = {GRADE_B_COMMON_LOWER_LIMIT - 1, GRADE_B_COMMON_UPPER_LIMIT + 1})
		void return_false_for_subject_non_math(int marks) {
			assertEquals(false, helper.isGradeB(marks, false));
		}
	}



}
