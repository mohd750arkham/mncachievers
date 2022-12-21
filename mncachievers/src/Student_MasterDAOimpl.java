package student_master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student_MasterDAOimpl implements Student_MasterDAO{

	@Override
	public Student_MasterDTO findByID(long id, Connection con) {
try {
	PreparedStatement ps=con.prepareStatement("select * from student_master where student_id=?");
	ps.setLong(1,id);
	ResultSet rs= ps.executeQuery();
	
	if(rs.next()) {
		Student_MasterDTO sdto = new Student_MasterDTO();
		sdto.setStudent_id(rs.getInt(1));
		sdto.setStudent_name(rs.getString(2));
		sdto.setStudent_password(rs.getString(3));
		sdto.setStudent_whatsappno1(rs.getInt(4));
		sdto.setStudent_whatsappno2(rs.getInt(5));
		sdto.setStudent_whatsappno3(rs.getInt(6));
		sdto.setStudent_email1(rs.getString(7));
		sdto.setStudent_email2(rs.getString(8));
		sdto.setStudent_email3(rs.getString(9));
		sdto.setStudent_address1(rs.getString(10));
		sdto.setStudent_address2(rs.getString(11));
		sdto.setStudent_city(rs.getString(12));
		sdto.setStudent_country(rs.getString(13));
		sdto.setStudent_college(rs.getString(14));
		sdto.setStudent_college_year(rs.getString(15));
		return sdto;
	}
	
}catch (Exception e) {
	e.printStackTrace();
}
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByName(String id, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByCity(String city, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByCollege(String college, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findAll(Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from student_master");
			ResultSet rs= ps.executeQuery();
			List<Student_MasterDTO> ww=new ArrayList<>();
			while(rs.next()) {
				Student_MasterDTO sdto = new Student_MasterDTO();
				sdto.setStudent_id(rs.getInt(1));
				sdto.setStudent_name(rs.getString(2));
				sdto.setStudent_password(rs.getString(3));
				sdto.setStudent_whatsappno1(rs.getInt(4));
				sdto.setStudent_whatsappno2(rs.getInt(5));
				sdto.setStudent_whatsappno3(rs.getInt(6));
				sdto.setStudent_email1(rs.getString(7));
				sdto.setStudent_email2(rs.getString(8));
				sdto.setStudent_email3(rs.getString(9));
				sdto.setStudent_address1(rs.getString(10));
				sdto.setStudent_address2(rs.getString(11));
				sdto.setStudent_city(rs.getString(12));
				sdto.setStudent_country(rs.getString(13));
				sdto.setStudent_college(rs.getString(14));
				sdto.setStudent_college_year(rs.getString(15));
				ww.add(sdto);
			}
			
			return ww;
		}catch (Exception e) {
			e.printStackTrace();
		}
				return null;
			}
	@Override
	public Collection<Student_MasterDTO> findByCountry(Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByYear(String year, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByCollegeAndYear(String college, int year, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_MasterDTO> findByCellNumber(double cellno, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateStudentMaster(Student_MasterDTO sm, Connection con) {
		PreparedStatement ps=null;
//		ResultSet rs=null;
		try {
			 ps=con.prepareStatement("update student_master set student_name=? where student_id=?");
				ps.setString(1, sm.getStudent_name());
				ps.setInt(2, sm.getStudent_id());
				int count = ps.executeUpdate();
				return count;
		}catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
//		}finally {
//			try {
//				if(ps!=null && rs!=null) {
//					ps.close();
//					rs.close();
//				}
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//			}			
						
	
	@Override
	public int insertStudent(Student_MasterDTO sm, Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into student_master values(?,?,?,?,?,?,?,?,?,,?,?,?,?,?,?");
			ps.setInt(1,sm.getStudent_id());
			ps.setString(2, sm.getStudent_name());
			ps.setString(3, sm.getStudent_password());
			ps.setInt(4, sm.getStudent_whatsappno1());
			ps.setInt(5, sm.getStudent_whatsappno2());
			ps.setInt(6, sm.getStudent_whatsappno3());
			ps.setString(7, sm.getStudent_email1());
			ps.setString(8, sm.getStudent_email2());
			ps.setString(9, sm.getStudent_email3());
			ps.setString(10, sm.getStudent_address1());
			ps.setString(11, sm.getStudent_address2());
			ps.setString(12, sm.getStudent_city());
			ps.setString(13,sm.getStudent_country());
			ps.setString(14,sm.getStudent_college());
			ps.setString(15, sm.getStudent_college_year());
			int count = ps.executeUpdate();
			return count;
		}	catch(Exception e)		{
			e.printStackTrace();
		}
			return 0;
	}

@Override
public int deleteStudent(int id, Connection con) {
	PreparedStatement ps=null;
	try {
		ps=con.prepareStatement("delete from student_master where student_id=?");
		ps.setInt(1, id);
		int count= ps.executeUpdate();
		return count;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return 0;
}
}
