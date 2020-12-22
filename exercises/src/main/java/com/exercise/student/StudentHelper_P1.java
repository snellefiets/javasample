package com.exercise.student;
public class StudentHelper_P1 {

	private static final int GRADE_B_LOWER_LIMIT = 51;
	private static final int GRADE_B_UPPER_LIMIT = 80;
	private static final int MATH_MARKUP = 10;

	/* PROBLEM 1 */
	/*
	* You get a grade B if marks are between 51 and 80 (both inclusive). Except for Maths where the upper limit is increased by 10.
	*/
	public boolean isGradeB(int marks, boolean isMaths) {
		final int markup = isMaths ? MATH_MARKUP : 0;
		final int upperLimit = GRADE_B_UPPER_LIMIT + markup;
		return marks>= GRADE_B_LOWER_LIMIT && marks<=upperLimit;
	}

}
