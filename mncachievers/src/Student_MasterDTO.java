package student_master;

public class Student_MasterDTO {
	private int student_id;
	private String student_name;
	private String student_password;
	private int student_whatsappno1;
	private int student_whatsappno2;
	private int student_whatsappno3;
	private String student_email1;
	private String student_email2;
	private String student_email3;
	private String student_address1;
	private String student_address2;
	private String student_city;
	private String student_country;
	private String student_college;
	private String student_college_year;

	public Student_MasterDTO() {
		
	}

	public Student_MasterDTO(int student_id, String student_name, String student_password, int student_whatsappno1,
			int student_whatsappno2, int student_whatsappno3, String student_email1, String student_email2,
			String student_email3, String student_address1, String student_address2, String student_city,
			String student_country, String student_college, String student_college_year) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_password = student_password;
		this.student_whatsappno1 = student_whatsappno1;
		this.student_whatsappno2 = student_whatsappno2;
		this.student_whatsappno3 = student_whatsappno3;
		this.student_email1 = student_email1;
		this.student_email2 = student_email2;
		this.student_email3 = student_email3;
		this.student_address1 = student_address1;
		this.student_address2 = student_address2;
		this.student_city = student_city;
		this.student_country = student_country;
		this.student_college = student_college;
		this.student_college_year = student_college_year;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public int getStudent_whatsappno1() {
		return student_whatsappno1;
	}

	public void setStudent_whatsappno1(int student_whatsappno1) {
		this.student_whatsappno1 = student_whatsappno1;
	}

	public int getStudent_whatsappno2() {
		return student_whatsappno2;
	}

	public void setStudent_whatsappno2(int student_whatsappno2) {
		this.student_whatsappno2 = student_whatsappno2;
	}

	public int getStudent_whatsappno3() {
		return student_whatsappno3;
	}

	public void setStudent_whatsappno3(int student_whatsappno3) {
		this.student_whatsappno3 = student_whatsappno3;
	}

	public String getStudent_email1() {
		return student_email1;
	}

	public void setStudent_email1(String student_email1) {
		this.student_email1 = student_email1;
	}

	public String getStudent_email2() {
		return student_email2;
	}

	public void setStudent_email2(String student_email2) {
		this.student_email2 = student_email2;
	}

	public String getStudent_email3() {
		return student_email3;
	}

	public void setStudent_email3(String student_email3) {
		this.student_email3 = student_email3;
	}

	public String getStudent_address1() {
		return student_address1;
	}

	public void setStudent_address1(String student_address1) {
		this.student_address1 = student_address1;
	}

	public String getStudent_address2() {
		return student_address2;
	}

	public void setStudent_address2(String student_address2) {
		this.student_address2 = student_address2;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

	public String getStudent_country() {
		return student_country;
	}

	public void setStudent_country(String student_country) {
		this.student_country = student_country;
	}

	public String getStudent_college() {
		return student_college;
	}

	public void setStudent_college(String student_college) {
		this.student_college = student_college;
	}

	public String getStudent_college_year() {
		return student_college_year;
	}

	public void setStudent_college_year(String student_college_year) {
		this.student_college_year = student_college_year;
	}

	@Override
	public String toString() {
		return "Student_MasterDTO [student_id=" + student_id + ", student_name=" + student_name + ", student_password="
				+ student_password + ", student_whatsappno1=" + student_whatsappno1 + ", student_whatsappno2="
				+ student_whatsappno2 + ", student_whatsappno3=" + student_whatsappno3 + ", student_email1="
				+ student_email1 + ", student_email2=" + student_email2 + ", student_email3=" + student_email3
				+ ", student_address1=" + student_address1 + ", student_address2=" + student_address2
				+ ", student_city=" + student_city + ", student_country=" + student_country + ", student_college="
				+ student_college + ", student_college_year=" + student_college_year + "]";
	}

}
