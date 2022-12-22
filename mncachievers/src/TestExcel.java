package course;

import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;

public class TestExcel {
	public static void main(String []args) {
		Course_MasterDTOExcel_DAO da=new Course_MasterExcelDAOimpl();
		Collection<Course_MasterDTO> cd=da.readAll();
		Iterator<Course_MasterDTO> iter=cd.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}	
	}
	
