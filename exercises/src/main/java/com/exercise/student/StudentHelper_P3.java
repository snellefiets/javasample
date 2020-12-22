package com.exercise.student;

public class StudentHelper_P3 {
    public static final int MATH_MARKUP = 5;
    public static final int YES_LOWER_LIMIT = 80;
    public static final int MAYBE_LOWER_LIMIT = 21;

    /*  PROBLEM 3
     * You and your Friend are planning to enter a Subject Quiz.
     * However, there is a marks requirement that you should attain to qualify.
     *
     * Return value can be YES, NO or MAYBE.
     *
     * YES If either of you are very good at the subject(has 80 or more marks)
     * However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO.
     * In all other conditions, return MAYBE.
     *
     * However, the definition for good and not good are 5 marks higher if the subject is Mathematics.
     *
     * marks1 - your marks
     * marks2 - your friends marks
     */

    public String willQualifyForQuiz(int myMarks, int friendsMarks, boolean isMaths) {
        final int highestMarks = Math.max(myMarks, friendsMarks);
        final int markup = isMaths ? MATH_MARKUP : 0;

        if (highestMarks >= YES_LOWER_LIMIT + markup)
            return "YES";
        else if (highestMarks >= MAYBE_LOWER_LIMIT + markup)
            return "MAYBE";
        else
            return "NO";
    }

}
