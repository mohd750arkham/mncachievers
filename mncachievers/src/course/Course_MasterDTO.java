package course;

public class Course_MasterDTO {
	private int course_id;
	private String course_name;
	private int duration_in_hrs;
	private int course_level;
	private int course_fees;
	
	public Course_MasterDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Course_MasterDTO(int course_id, String course_name, int duration_in_hrs, int course_level, int course_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.duration_in_hrs = duration_in_hrs;
		this.course_level = course_level;
		this.course_fees = course_fees;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getDuration_in_hrs() {
		return duration_in_hrs;
	}

	public void setDuration_in_hrs(int duration_in_hrs) {
		this.duration_in_hrs = duration_in_hrs;
	}

	public int getCourse_level() {
		return course_level;
	}

	public void setCourse_level(int course_level) {
		this.course_level = course_level;
	}

	public int getCourse_fees() {
		return course_fees;
	}

	public void setCourse_fees(int course_fees) {
		this.course_fees = course_fees;
	}

	@Override
	public String toString() {
		return "Course_MasterDTO [course_id=" + course_id + ", course_name=" + course_name + ", duration_in_hrs="
				+ duration_in_hrs + ", course_level=" + course_level + ", course_fees=" + course_fees + "]";
	}
	
	
}
