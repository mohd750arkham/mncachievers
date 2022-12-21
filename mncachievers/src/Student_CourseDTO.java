package student_course;

public class Student_CourseDTO {
	private int student_id;
	private int course_id;
	private int fees_paid;
	private String student_CJD;
	private String student_CED;
	private int student_CAttendance;
	private int student_CGrade;

	public Student_CourseDTO() {
		
	}

	public Student_CourseDTO(int student_id, int course_id, int fees_paid, String student_CJD, String student_CED,
			int student_CAttendance, int student_CGrade) {
		super();
		this.student_id = student_id;
		this.course_id = course_id;
		this.fees_paid = fees_paid;
		this.student_CJD = student_CJD;
		this.student_CED = student_CED;
		this.student_CAttendance = student_CAttendance;
		this.student_CGrade = student_CGrade;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getFees_paid() {
		return fees_paid;
	}

	public void setFees_paid(int fees_paid) {
		this.fees_paid = fees_paid;
	}

	public String  getStudent_CJD() {
		return student_CJD;
	}

	public void setStudent_CJD(String student_CJD) {
		this.student_CJD = student_CJD;
	}

	public String getStudent_CED() {
		return student_CED;
	}

	public void setStudent_CED(String student_CED) {
		this.student_CED = student_CED;
	}

	public int getStudent_CAttendance() {
		return student_CAttendance;
	}

	public void setStudent_CAttendance(int student_CAttendance) {
		this.student_CAttendance = student_CAttendance;
	}

	public int getStudent_CGrade() {
		return student_CGrade;
	}

	public void setStudent_CGrade(int student_CGrade) {
		this.student_CGrade = student_CGrade;
	}

	@Override
	public String toString() {
		return "Student_CourseDTO [student_id=" + student_id + ", course_id=" + course_id + ", fees_paid=" + fees_paid
				+ ", student_CJD=" + student_CJD + ", student_CED=" + student_CED + ", student_CAttendance="
				+ student_CAttendance + ", student_CGrade=" + student_CGrade + "]";
	}
	
}