package student_course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student_CourseDAOimpl implements Student_CourseDAO{

	@Override
	public Student_CourseDTO findByID(Student_CourseCK scck, Connection con) {
		try {
			PreparedStatement ps= con.prepareStatement("select * from student_course where student_id=? and course_id=?");
			ps.setLong(1, scck.getSid());
			ps.setLong(2,scck.getCid());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				Student_CourseDTO scdto= new Student_CourseDTO();
				scdto.setStudent_id(rs.getInt(1));
				scdto.setCourse_id(rs.getInt(2));
				scdto.setFees_paid(rs.getInt(3));
				scdto.setStudent_CJD(rs.getString(4));
				scdto.setStudent_CED(rs.getString(5));
				scdto.setStudent_CAttendance(rs.getInt(6));
				scdto.setStudent_CGrade(rs.getInt(7));
				return scdto;
			}else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();return null;
		}
		
				
	}

	@Override
	public Collection<Student_CourseDTO> findAll(Connection con) {
		try {
			PreparedStatement ps= con.prepareStatement("select * from student_course ");
			ResultSet rs=ps.executeQuery();
			List<Student_CourseDTO> yy = new ArrayList<>();
			while(rs.next()) {
				Student_CourseDTO scdto= new Student_CourseDTO();
				scdto.setStudent_id(rs.getInt(1));
				scdto.setCourse_id(rs.getInt(2));
				scdto.setFees_paid(rs.getInt(3));
				scdto.setStudent_CJD(rs.getString(4));
				scdto.setStudent_CED(rs.getString(5));
				scdto.setStudent_CAttendance(rs.getInt(6));
				scdto.setStudent_CGrade(rs.getInt(7));
				yy.add(scdto);
			}
			return yy;

		}catch(Exception e) {
			e.printStackTrace();
		}
		
				return null;
	}

	@Override
	public int insertStudent_Course(Student_CourseDTO cmd, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateStudent_Course(Student_CourseDTO cmd, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent_CourseByID(Student_CourseCK cid, Connection con) {
		// TODO Auto-generated method stub
		return 0;
	}

}
