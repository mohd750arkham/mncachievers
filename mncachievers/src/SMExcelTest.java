package student_master;

import java.util.Collection;
import java.util.Iterator;

public class SMExcelTest {
public static void main(String[]args) {
	SMExcel_DAO xl = new SMExcel_DAOimpl();
	Collection<Student_MasterDTO> c = xl.readAll();
	Iterator<Student_MasterDTO> iter = c.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
}
}
