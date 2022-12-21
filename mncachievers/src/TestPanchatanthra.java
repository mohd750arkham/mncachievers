package panchatanthra;

import java.sql.Connection;

import course.ConnetionUtility;
import student_course.Student_CourseCK;

public class TestPanchatanthra {
public static void main(String[]args) {
	PanchatanthraDAO  pd = new PanchatanthraDAOimpl();
	Connection con=ConnetionUtility.getConnection();
	PanchatanthraDTO pdto = pd.findByID(new Student_CourseCK(1,1),con);
System.out.println(pdto);
}
}
