package course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Course_MasterDAOimpl implements Course_MasterDAO{

	@Override
	public Course_MasterDTO findByID(int cid, Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from course where course_id=?");
			ps.setInt(1, cid);
			
			ResultSet rs=ps.executeQuery();
			Course_MasterDTO cdto=new Course_MasterDTO();
			if(rs.next()) {
//				List<Course_MasterDTO> vvv=new ArrayList<>();
				cdto.setCourse_id(rs.getInt(1));
				cdto.setCourse_name(rs.getString(2));
				cdto.setDuration_in_hrs(rs.getInt(3));
				cdto.setCourse_level(rs.getInt(4));
				cdto.setCourse_fees(rs.getInt(5));
//				vvv.add(cdto);
			}
//			return vvv;
			return cdto;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Collection<Course_MasterDTO> findAll(Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from course");
			ResultSet rs=ps.executeQuery();
			List<Course_MasterDTO> vvv=new ArrayList<>();
			while(rs.next()) {
				Course_MasterDTO cdto=new Course_MasterDTO();
				cdto.setCourse_id(rs.getInt(1));
				cdto.setCourse_name(rs.getString(2));
				cdto.setDuration_in_hrs(rs.getInt(3));
				cdto.setCourse_level(rs.getInt(4));
				cdto.setCourse_fees(rs.getInt(5));
				vvv.add(cdto);
			}
			return vvv;
			//return cdto;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	
	}

	@Override
	public Course_MasterDTO findByName(String cname, Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from course where course_id=?");
			ps.setString(1, cname);
			
			ResultSet rs=ps.executeQuery();
			Course_MasterDTO cdto=new Course_MasterDTO();
			if(rs.next()) {
				cdto.setCourse_id(rs.getInt(1));
				cdto.setCourse_name(rs.getString(2));
				cdto.setDuration_in_hrs(rs.getInt(3));
				cdto.setCourse_level(rs.getInt(4));
				cdto.setCourse_fees(rs.getInt(5));
			}
			return cdto;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	@Override
	public int insertCourse_Master(Course_MasterDTO cmd, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCourse_Master(Course_MasterDTO cmd, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCourse_MasterByID(int cid, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCourse_MasterByName(String cname, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Course_MasterDTO> findCoursesByLevel(int level, Connection con) {
		// TODO Auto-generated method stub
		return null;
	}


}
