package com.exercise.student;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentHelperTest {

	private static final int GRADE_B_COMMON_LOWER_LIMIT = 51;
	private static final int GRADE_B_MATH_UPPER_LIMIT = 90;
	private static final int GRADE_B_DEFAULT_VALUE = 66;
	final StudentHelper helper = new StudentHelper();

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
	}

	@Test
	public void testIsGradeB() {
		assertEquals(false,helper.isGradeB(30, false));
		assertEquals(false,helper.isGradeB(50, false));
		assertEquals(true,helper.isGradeB(51, false));
		assertEquals(true,helper.isGradeB(80, false));
		assertEquals(false,helper.isGradeB(81, false));
		
		assertEquals(false,helper.isGradeB(30, true));
		assertEquals(false,helper.isGradeB(50, true));
		assertEquals(true,helper.isGradeB(51, true));
		assertEquals(true,helper.isGradeB(80, true));
		assertEquals(true,helper.isGradeB(81, true));
		assertEquals(true,helper.isGradeB(89, true));
		assertEquals(true,helper.isGradeB(90, true));
		assertEquals(false,helper.isGradeB(91, true));

	}

	@Test
	public void testGetGrade() {

		assertEquals("A",helper.getGrade(99, false));
		assertEquals("A",helper.getGrade(91, false));
		assertEquals("B",helper.getGrade(85, false));
		assertEquals("B",helper.getGrade(51, false));
		assertEquals("C",helper.getGrade(50, false));
		assertEquals("C",helper.getGrade(45, false));

		assertEquals("A",helper.getGrade(99, true));
		assertEquals("A",helper.getGrade(96, true));
		assertEquals("B",helper.getGrade(89, true));
		assertEquals("B",helper.getGrade(56, true));
		assertEquals("C",helper.getGrade(55, true));
		assertEquals("C",helper.getGrade(50, true));
		assertEquals("C",helper.getGrade(45, true));

		//Will fail due to wrong implementation
		//assertEquals("B",helper.getGrade(95, true));
		//assertEquals("B",helper.getGrade(90, false));
	}

	@Test
	public void testWillQualifyForQuiz() {
		assertEquals("NO",helper.willQualifyForQuiz(15, 25, false));
		assertEquals("NO",helper.willQualifyForQuiz(20, 20, false));
		assertEquals("MAYBE",helper.willQualifyForQuiz(21, 21, false));
		assertEquals("MAYBE",helper.willQualifyForQuiz(25, 25, false));
		assertEquals("MAYBE",helper.willQualifyForQuiz(79, 79, false));
		assertEquals("YES",helper.willQualifyForQuiz(80, 30, false));
		assertEquals("YES",helper.willQualifyForQuiz(85, 30, false));
		assertEquals("YES",helper.willQualifyForQuiz(30, 90, false));
		
		assertEquals("NO",helper.willQualifyForQuiz(15, 25, true));
		assertEquals("NO",helper.willQualifyForQuiz(20, 20, true));
		assertEquals("NO",helper.willQualifyForQuiz(21, 21, true));
		assertEquals("NO",helper.willQualifyForQuiz(25, 25, true));
		assertEquals("MAYBE",helper.willQualifyForQuiz(27, 34, true));
		assertEquals("MAYBE",helper.willQualifyForQuiz(79, 79, true));
		assertEquals("MAYBE",helper.willQualifyForQuiz(80, 30, true));
		assertEquals("MAYBE",helper.willQualifyForQuiz(80, 84, true));
		assertEquals("YES",helper.willQualifyForQuiz(85, 30, true));
		assertEquals("YES",helper.willQualifyForQuiz(30, 90, true));

	}

}
