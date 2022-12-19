package course;

import java.sql.Connection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestDAO {
	public static void main(String[] args) {
		Course_MasterDAO cd=new Course_MasterDAOimpl();
		
		Connection con=ConnetionUtility.getConnection();
				
//		Course_MasterDTO cdto=cd.findByID(1242, con);
//		
//		System.out.println(cdto);
//		
//		cdto=cd.findByName("web dev", con);
//		System.out.println(cdto);
		
		System.out.println("allusers...");
		Collection<Course_MasterDTO> allusers=cd.findAll(con);
		Iterator<Course_MasterDTO> iter=allusers.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
