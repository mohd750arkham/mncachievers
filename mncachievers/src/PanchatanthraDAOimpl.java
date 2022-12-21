package panchatanthra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import student_course.Student_CourseCK;

public class PanchatanthraDAOimpl implements PanchatanthraDAO {

	@Override
	public PanchatanthraDTO findByID(Student_CourseCK scck, Connection con) {
try {
	PreparedStatement ps=con.prepareStatement("select * from panchatanthra");
	ResultSet rs = ps.executeQuery();
	
	if(rs.next()) {
	PanchatanthraDTO pdto= new 	PanchatanthraDTO();
	pdto.setStudent_id(rs.getInt(1));
	pdto.setCourse_id(rs.getInt(2));
	pdto.setCod_count(rs.getInt(3));
	pdto.setQod_count(rs.getInt(4));
	pdto.setTod_count(rs.getInt(5));
	pdto.setLow_count(rs.getInt(6));
	pdto.setVow_count(rs.getInt(7));
	return pdto;
	}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public Collection<PanchatanthraDTO> findAll(Connection con) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from panchatanthra");
			ResultSet rs = ps.executeQuery();
			List<PanchatanthraDTO> pp = new ArrayList<>();
			while(rs.next()) {
			PanchatanthraDTO pdto= new 	PanchatanthraDTO();
			pdto.setStudent_id(rs.getInt(1));
			pdto.setCourse_id(rs.getInt(2));
			pdto.setCod_count(rs.getInt(3));
			pdto.setQod_count(rs.getInt(4));
			pdto.setTod_count(rs.getInt(5));
			pdto.setLow_count(rs.getInt(6));
			pdto.setVow_count(rs.getInt(7));
			pp.add(pdto);
			}return pp;
			}catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public int insertPanchatanthraDTO(PanchatanthraDTO cmd, Connection con) {
try {
	PreparedStatement ps= con.prepareStatement("insert into panchatanthra values (?,?,?,?,?,?,?");
	ps.setInt(1, cmd.getStudent_id());
	ps.setInt(2, cmd.getCourse_id());
	ps.setInt(3, cmd.getCod_count());
	ps.setInt(4, cmd.getQod_count());
	ps.setInt(5, cmd.getTod_count());
	ps.setInt(6, cmd.getLow_count());
	ps.setInt(7, cmd.getVow_count());

}catch (Exception e) {
	e.printStackTrace();
}
return 0;
	}

	@Override
	public int updatePanchatanthraDTO(PanchatanthraDTO cmd, Connection con) {
		try {
			PreparedStatement ps= con.prepareStatement("update panchatanthra set cod_count=? where student_id=?");
		ps.setInt(1, cmd.getCod_count());
		ps.setInt(2, cmd.getStudent_id());
		int i=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deletePanchatanthraDTOByID(Student_CourseCK cid, Connection con) {
		try {
		PreparedStatement ps=con.prepareStatement("delete from panchatanthra where student_id=?");
			ps.setLong(1, cid.getSid());
			int count= ps.executeUpdate();
			return count;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
