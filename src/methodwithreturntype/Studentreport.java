package methodwithreturntype;

import java.util.Scanner;

public class Studentreport {

	// Instance Variables
	String studentName;
	int studentId;

	int telugu;
	int english;
	int hindi;
	int maths;
	int science;
	int social;

	Scanner sc = new Scanner(System.in);

	// Input Methods
	int getStudentId() {
		System.out.print("Enter Student ID: ");
		return sc.nextInt();
	}

	String getStudentName() {
		System.out.print("Enter Student Name: ");
		sc.nextLine(); // clear buffer
		return sc.nextLine();
	}

	int getTeluguMarks() {
		System.out.print("Enter Telugu Marks: ");
		return sc.nextInt();
	}

	int getEnglishMarks() {
		System.out.print("Enter English Marks: ");
		return sc.nextInt();
	}

	int getHindiMarks() {
		System.out.print("Enter Hindi Marks: ");
		return sc.nextInt();
	}

	int getMathsMarks() {
		System.out.print("Enter Maths Marks: ");
		return sc.nextInt();
	}

	int getScienceMarks() {
		System.out.print("Enter Science Marks: ");
		return sc.nextInt();
	}

	int getSocialMarks() {
		System.out.print("Enter Social Marks: ");
		return sc.nextInt();
	}

	// Calculation Methods
	int totalMarks() {
		return telugu + english + hindi + maths + science + social;
	}

	int totalSubjects() {
		return 6;
	}

	int maxMarksPerSubject() {
		return 100;
	}

	int maxTotalMarks() {
		return totalSubjects() * maxMarksPerSubject();
	}

	float percentage() {
		return (totalMarks() * 100.0f) / maxTotalMarks();
	}

	String grade() {
		float p = percentage();

		if (p >= 90)
			return "A+";
		else if (p >= 80)
			return "A";
		else if (p >= 70)
			return "B";
		else if (p >= 60)
			return "C";
		else
			return "Fail";
	}

	String result() {
		return percentage() >= 35 ? "PASS" : "FAIL";
	}

	int highestMark() {
		int max = telugu;

		if (english > max)
			max = english;
		if (hindi > max)
			max = hindi;
		if (maths > max)
			max = maths;
		if (science > max)
			max = science;
		if (social > max)
			max = social;

		return max;
	}

	int lowestMark() {
		int min = telugu;

		if (english < min)
			min = english;
		if (hindi < min)
			min = hindi;
		if (maths < min)
			min = maths;
		if (science < min)
			min = science;
		if (social < min)
			min = social;

		return min;
	}

	float averageMarks() {
		return totalMarks() / (float) totalSubjects();
	}

	String collegeName() {
		return "Avanthi College";
	}

	String branch() {
		return "CSE";
	}

	String section() {
		return "A";
	}

	String academicYear() {
		return "2026";
	}

	void displayReport() {
		System.out.println("\n------ STUDENT REPORT ------");
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("College : " + collegeName());
		System.out.println("Branch : " + branch());
		System.out.println("Section : " + section());
		System.out.println("Academic Year : " + academicYear());
		System.out.println("Total Marks : " + totalMarks());
		System.out.println("Percentage : " + percentage());
		System.out.println("Grade : " + grade());
		System.out.println("Result : " + result());
		System.out.println("Highest Mark : " + highestMark());
		System.out.println("Lowest Mark : " + lowestMark());
		System.out.println("Average Marks : " + averageMarks());
	}

	public static void main(String[] args) {

		Studentreport s = new Studentreport();

		s.studentId = s.getStudentId();
		s.studentName = s.getStudentName();

		s.telugu = s.getTeluguMarks();
		s.english = s.getEnglishMarks();
		s.hindi = s.getHindiMarks();
		s.maths = s.getMathsMarks();
		s.science = s.getScienceMarks();
		s.social = s.getSocialMarks();

		s.displayReport();
	}
}