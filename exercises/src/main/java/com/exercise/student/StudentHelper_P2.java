package com.exercise.student;
public class StudentHelper_P2 {

	/* PROBLEM 2 */
	/*
	You are awarded a grade based on your marks.
	Grade A = 91 to 100, Grade B = 51 to 90, Otherwise Grade C
	Except for Maths where marks to get a Grade are 5 higher than required for other subjects.
	*/

	public String getGrade(int mark, boolean isMaths) {
		String grade = "C";
		
		if (isGradeA(mark, isMaths))
			grade = "A";
		else if (isBGrade(mark, isMaths)) {
			grade = "B";
		}
		return grade;
	}

	private boolean isGradeA(int mark, boolean isMaths) {
		int lowerLimitForAGrade = isMaths ? 95
				: 90;
		return mark > lowerLimitForAGrade;
	}

	private boolean isBGrade(int mark, boolean isMaths) {
		int lowerLimitGradeB = isMaths ? 55
				: 50;
		return mark > lowerLimitGradeB && mark < 90;
	}



}
