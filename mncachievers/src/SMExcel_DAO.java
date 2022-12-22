package student_master;

import java.util.Collection;

public interface SMExcel_DAO extends Cloneable{
	public Collection<Student_MasterDTO> readAll();
	public Student_MasterDTO readyByID(long id);
	public Collection<Student_MasterDTO> readByRange(int start_row,int end_row);
}
