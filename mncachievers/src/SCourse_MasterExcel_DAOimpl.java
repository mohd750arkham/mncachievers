package student_course;

import java.io.FileInputStream;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SCourse_MasterExcel_DAOimpl implements SCourse_MasterExcel_DAO{

	@Override
	public Collection<Student_CourseDTO> readAll() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student_CourseDTO readyByID(Student_CourseCK ck) {
		try {
			String file = "C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream  fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.getSheetAt(2);
			Student_CourseDTO scourse = new  Student_CourseDTO();
			for(int i=1;i<sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				long sid=(long)row.getCell(0).getNumericCellValue();
				long cid=(long)row.getCell(1).getNumericCellValue();
				if(ck.getSid()==sid && ck.getCid()==cid) {
					scourse.set
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Student_CourseDTO> readByRange(int start_row, int end_row) {
		// TODO Auto-generated method stub
		return null;
	}

}
