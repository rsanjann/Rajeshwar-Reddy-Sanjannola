class Student {
	public int subjectA, subjectB, subjectC;

	public Student(int A, int B, int C) {
		this.subjectA = A;
		this.subjectB = B;
		this.subjectC = C;
	}

	public Student() {

	}

	public int studentsTotalMarksInAllSubjects(Student[] students) {

		int total1 = students[0].subjectA + students[0].subjectB + students[0].subjectC;
		int total2 = students[1].subjectA + students[1].subjectB + students[1].subjectC;
		int total3 = students[2].subjectA + students[2].subjectB + students[2].subjectC;
		return total1 + total2 + total3;
	}

	public double studentsAverageMarksInAllSubjects(Student[] students) {
		int total1 = students[0].subjectA + students[0].subjectB + students[0].subjectC;
		int total2 = students[1].subjectA + students[1].subjectB + students[1].subjectC;
		int total3 = students[2].subjectA + students[2].subjectB + students[2].subjectC;
		return (total1 + total2 + total3) / 3;

	}

	public int[] subjectWiseMarks(Student[] students, String subjectName) {
		int[] swm = new int[3];

		swm[0] = students[0].subjectA;
		swm[1] = students[1].subjectA;
		swm[2] = students[2].subjectA;
		
		return swm;
	}

	public int subjectATotalByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]);
	}

	public int subjectBTotalByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]);
	}

	public int subjectCTotalByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]);
	}

	public int subjectTotalByStudents(int[] marks) {
		return marks[0] + marks[1] + marks[2];
	}

	public double subjectAAverageByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]) / 3;
	}

	public double subjectBAverageByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]) / 3;
	}

	public double subjectCAverageByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]) / 3;
	}

	public double subjectAverageByStudents(int[] marks) {
		return (marks[0] + marks[1] + marks[2]) / 3;
	}

}

public class Assignment1Q9 {

	public static void main(String[] args) {

	}
}
