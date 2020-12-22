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
        if (isGradeA(mark, isMaths))
            return "A";
        else if (isGradeB(mark, isMaths))
            return "B";
        else
            return "C";
    }

    private boolean isGradeA(int mark, boolean isMaths) {
        final int lowerLimitGradeA_maths = GRADE_A_LOWER_LIMIT + MATH_MARKUP;
        final int lowerLimitGradeA = isMaths ? lowerLimitGradeA_maths : GRADE_A_LOWER_LIMIT;
        return mark >= lowerLimitGradeA;
    }

    private boolean isGradeB(int mark, boolean isMaths) {
        final int lowerLimitGradeB_maths = GRADE_B_LOWER_LIMIT + MATH_MARKUP;
        final int lowerLimitGradeB = isMaths ? lowerLimitGradeB_maths : GRADE_B_LOWER_LIMIT;
        return mark >= lowerLimitGradeB;
    }


}
