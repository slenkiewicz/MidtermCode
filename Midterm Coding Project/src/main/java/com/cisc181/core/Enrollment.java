package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	private Enrollment() {

	}

	public Enrollment(UUID StudentID, UUID SectionID) {
		EnrollmentID = UUID.randomUUID();
	}

	public void SetGrade(double Grade) {
		Grade = this.Grade;
	}
}
