package student_course;

import java.util.Collection;

interface SCourse_MasterExcel_DAO extends Cloneable{
	public Collection<Student_CourseDTO> readAll();
	public Student_CourseDTO readyByID(Student_CourseCK ck);
	public Collection<Student_CourseDTO> readByRange(int start_row,int end_row);
}
