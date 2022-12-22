package course;

import java.util.Collection;

public interface Course_MasterDTOExcel_DAO extends Cloneable{
	public Collection<Course_MasterDTO> readAll();
	public Course_MasterDTO readyByID(int id);
	public Collection<Course_MasterDTO> readByRange(int start_row,int end_row);
}

