package com.example.Junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeTest {

	@Test
	void gradeA() {
		Grades grades = new Grades();
		assertEquals('A', grades.grade(94));
	}

	@Test
	void gradeB() {
		Grades grades = new Grades();
		assertEquals('B', grades.grade(85));
	}

	@Test
	void gradeC() {
		Grades grades = new Grades();
		assertEquals('C', grades.grade(78));
	}

	@Test
	void gradeD() {
		Grades grades = new Grades();
		assertEquals('D', grades.grade(65));
	}

	@Test
	void gradeF() {
		Grades grades = new Grades();
		assertEquals('F', grades.grade(50));
	}

	@Test
	void edgeTestGradeA() {
		Grades grades = new Grades();
		assertEquals('A', grades.grade(90));
	}

	@Test
	void edgeTestGradeB() {
		Grades grades = new Grades();
		assertEquals('B', grades.grade(80));
	}

	@Test
	void edgeTestGradeC() {
		Grades grades = new Grades();
		assertEquals('C', grades.grade(70));
	}
	
	@Test
	void edgeTestGradeD() {
		Grades grades = new Grades();
		assertEquals('D', grades.grade(60));
	}
	
	@Test
	void edgeTestGradeF() {
		Grades grades = new Grades();
		assertEquals('F', grades.grade(59));
	}
}
