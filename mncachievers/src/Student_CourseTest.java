package student_course;

import java.sql.Connection;

import course.ConnetionUtility;

public class Student_CourseTest {
public static void main(String [] args ) {
	Student_CourseDAO stcud = new Student_CourseDAOimpl();
	Connection con=ConnetionUtility.getConnection();
	Student_CourseDTO sc = stcud .findByID(new Student_CourseCK(1, 1), con);
	System.out.println(sc);
}
}
