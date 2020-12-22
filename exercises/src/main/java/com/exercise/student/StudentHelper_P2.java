package com.exercise.student;

public class StudentHelper_P2 {
    public static final int GRADE_A_LOWER_LIMIT = 91;
    public static final int GRADE_B_LOWER_LIMIT = 51;
    public static final int MATH_MARKUP = 5;

    /* PROBLEM 2 */
	/*
	You are awarded a grade based on your marks.
	Grade A = 91 to 100, Grade B = 51 to 90, Otherwise Grade C
	Except for Maths where marks to get a Grade are 5 higher than required for other subjects.
	*/

    public String getGrade(int mark, boolean isMaths) {
        final int markup = isMaths ? MATH_MARKUP : 0;
        if (mark >= GRADE_A_LOWER_LIMIT + markup)
            return "A";
        else if (mark >= GRADE_B_LOWER_LIMIT + markup)
            return "B";
        else
            return "C";
    }


}
