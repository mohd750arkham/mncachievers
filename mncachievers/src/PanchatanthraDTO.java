package panchatanthra;

public class PanchatanthraDTO {
private int student_id;
private int course_id;
private int cod_count;
private int qod_count;
private int tod_count;
private int low_count;
private int vow_count;

public PanchatanthraDTO() {
	
}

public PanchatanthraDTO(int student_id, int course_id, int cod_count, int qod_count, int tod_count, int low_count,
		int vow_count) {
	super();
	this.student_id = student_id;
	this.course_id = course_id;
	this.cod_count = cod_count;
	this.qod_count = qod_count;
	this.tod_count = tod_count;
	this.low_count = low_count;
	this.vow_count = vow_count;
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

public int getCod_count() {
	return cod_count;
}

public void setCod_count(int cod_count) {
	this.cod_count = cod_count;
}

public int getQod_count() {
	return qod_count;
}

public void setQod_count(int qod_count) {
	this.qod_count = qod_count;
}

public int getTod_count() {
	return tod_count;
}

public void setTod_count(int tod_count) {
	this.tod_count = tod_count;
}

public int getLow_count() {
	return low_count;
}

public void setLow_count(int low_count) {
	this.low_count = low_count;
}

public int getVow_count() {
	return vow_count;
}

public void setVow_count(int vow_count) {
	this.vow_count = vow_count;
}

@Override
public String toString() {
	return "PanchatanthraDTO [student_id=" + student_id + ", course_id=" + course_id + ", cod_count=" + cod_count
			+ ", qod_count=" + qod_count + ", tod_count=" + tod_count + ", low_count=" + low_count + ", vow_count="
			+ vow_count + "]";
}


}
