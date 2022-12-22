package course;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Course_MasterExcelDAOimpl implements Course_MasterDTOExcel_DAO{

	@Override
	public Collection<Course_MasterDTO> readAll() {
		try {
			String file = "C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Collection<Course_MasterDTO> users = new ArrayList<Course_MasterDTO>();
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				Course_MasterDTO user= new Course_MasterDTO();
				user.setCourse_id((int) row.getCell(0).getNumericCellValue());
				user.setCourse_name(row.getCell(1).getStringCellValue());
				user.setDuration_in_hrs((int) row.getCell(2).getNumericCellValue());
				user.setCourse_level((int) row.getCell(3).getNumericCellValue());
				user.setCourse_fees((int) row.getCell(4).getNumericCellValue());
				users.add(user);
			}
			fis.close();
			return users;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course_MasterDTO readyByID(int id) {
		try {
			String file = "C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
//			Collection<Course_MasterDTO> users = new ArrayList<Course_MasterDTO>();
			Course_MasterDTO user= new Course_MasterDTO();
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i); 
				if((int)row.getCell(0).getNumericCellValue()==id)
				user.setCourse_id((int) row.getCell(0).getNumericCellValue());
				user.setCourse_name(row.getCell(1).getStringCellValue());
				user.setDuration_in_hrs((int) row.getCell(2).getNumericCellValue());
				user.setCourse_level((int) row.getCell(3).getNumericCellValue());
				user.setCourse_fees((int) row.getCell(4).getNumericCellValue());
//				users.add(user);
			}
			fis.close();
			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Course_MasterDTO> readByRange(int start_row, int end_row) {
		try {
			String file = "C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Collection<Course_MasterDTO> users = new ArrayList<Course_MasterDTO>();
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				Course_MasterDTO user= new Course_MasterDTO();
				user.setCourse_id((int) row.getCell(0).getNumericCellValue());
				user.setCourse_name(row.getCell(1).getStringCellValue());
				user.setDuration_in_hrs((int) row.getCell(2).getNumericCellValue());
				user.setCourse_level((int) row.getCell(3).getNumericCellValue());
				user.setCourse_fees((int) row.getCell(4).getNumericCellValue());
				users.add(user);
			}
			fis.close();
			return users;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		// TODO Auto-generated method stub
		
	}
	
}