package student_master;

import java.sql.Connection;

import course.ConnetionUtility;

public class Student_MasterTest {
public static void main(String[]args) {
	Student_MasterDAO stud= new Student_MasterDAOimpl();
	Connection con=ConnetionUtility.getConnection();
	Student_MasterDTO st= stud.findByID(1, con);
		System.out.println(st);
}
}
