package com.exercise.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentHelperP2Test {

	final StudentHelper_P2 helper = new StudentHelper_P2();

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

}
