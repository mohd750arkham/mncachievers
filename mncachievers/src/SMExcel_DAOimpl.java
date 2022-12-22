package student_master;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SMExcel_DAOimpl implements SMExcel_DAO{

	@Override
	public Collection<Student_MasterDTO> readAll() {
		try {
			String file="C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(2);
			List<Student_MasterDTO> list= new ArrayList<Student_MasterDTO>();
			for(int i=1;i<sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				Student_MasterDTO student = new Student_MasterDTO();
					student.setStudent_id((int)row.getCell(0).getNumericCellValue());
					student.setStudent_name(row.getCell(1).getStringCellValue());
					student.setStudent_password(row.getCell(2).getStringCellValue());
					student.setStudent_whatsappno1((int) row.getCell(3).getNumericCellValue());
					student.setStudent_whatsappno2((int) row.getCell(4).getNumericCellValue());
					student.setStudent_whatsappno3((int) row.getCell(5).getNumericCellValue());
					student.setStudent_email1(row.getCell(6).getStringCellValue());
					student.setStudent_email2(row.getCell(7).getStringCellValue());
					student.setStudent_email3(row.getCell(8).getStringCellValue());
					student.setStudent_address1(row.getCell(9).getStringCellValue());
					student.setStudent_address2(row.getCell(10).getStringCellValue());
					student.setStudent_city(row.getCell(11).getStringCellValue());
					student.setStudent_country(row.getCell(12).getStringCellValue());
					student.setStudent_college(row.getCell(13).getStringCellValue());
					student.setStudent_college_year(row.getCell(14).getStringCellValue());
					list.add(student);
				}
				workbook.close();
				return list;
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return null;
		}

	@Override
	public Student_MasterDTO readyByID(long id) {
		try {
			String file="C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(2);
			Student_MasterDTO student = new Student_MasterDTO();
			for(int i=1;i<sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				if(id ==row.getCell(0).getNumericCellValue() ) {
					student.setStudent_id((int)row.getCell(0).getNumericCellValue());
					student.setStudent_name(row.getCell(1).getStringCellValue());
					student.setStudent_password(row.getCell(2).getStringCellValue());
					student.setStudent_whatsappno1((int) row.getCell(3).getNumericCellValue());
					student.setStudent_whatsappno2((int) row.getCell(4).getNumericCellValue());
					student.setStudent_whatsappno3((int) row.getCell(5).getNumericCellValue());
					student.setStudent_email1(row.getCell(6).getStringCellValue());
					student.setStudent_email2(row.getCell(7).getStringCellValue());
					student.setStudent_email3(row.getCell(8).getStringCellValue());
					student.setStudent_address1(row.getCell(9).getStringCellValue());
					student.setStudent_address2(row.getCell(10).getStringCellValue());
					student.setStudent_city(row.getCell(11).getStringCellValue());
					student.setStudent_country(row.getCell(12).getStringCellValue());
					student.setStudent_college(row.getCell(13).getStringCellValue());
					student.setStudent_college_year(row.getCell(14).getStringCellValue());
					return student;
				}
				workbook.close();
				return student;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return null;
		}

	@Override
	public Collection<Student_MasterDTO> readByRange(int start_row, int end_row) {
		try {
			String file="C:\\Users\\day1\\OneDrive\\Documents\\SoftMaker\\course_excel.xlsx";
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(2);
			Student_MasterDTO student = new Student_MasterDTO();
			for(int i=1;i<sheet.getLastRowNum();i++) {
				XSSFRow row = sheet.getRow(i);
				if(id ==row.getCell(0).getNumericCellValue() ) {
					student.setStudent_id((int)row.getCell(0).getNumericCellValue());
					student.setStudent_name(row.getCell(1).getStringCellValue());
					student.setStudent_password(row.getCell(2).getStringCellValue());
					student.setStudent_whatsappno1((int) row.getCell(3).getNumericCellValue());
					student.setStudent_whatsappno2((int) row.getCell(4).getNumericCellValue());
					student.setStudent_whatsappno3((int) row.getCell(5).getNumericCellValue());
					student.setStudent_email1(row.getCell(6).getStringCellValue());
					student.setStudent_email2(row.getCell(7).getStringCellValue());
					student.setStudent_email3(row.getCell(8).getStringCellValue());
					student.setStudent_address1(row.getCell(9).getStringCellValue());
					student.setStudent_address2(row.getCell(10).getStringCellValue());
					student.setStudent_city(row.getCell(11).getStringCellValue());
					student.setStudent_country(row.getCell(12).getStringCellValue());
					student.setStudent_college(row.getCell(13).getStringCellValue());
					student.setStudent_college_year(row.getCell(14).getStringCellValue());
					return student;
				}
				workbook.close();
				return student;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return null;
		}

}
