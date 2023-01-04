package generate_pdf;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;

import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import course.Course_MasterDAO;
import course.Course_MasterDAOimpl;
import course.Course_MasterDTO;
import panchatanthra.PanchatanthraDAO;
import panchatanthra.PanchatanthraDAOimpl;
import panchatanthra.PanchatanthraDTO;
import student_master.Student_MasterDAO;
import student_master.Student_MasterDAOimpl;
import student_master.Student_MasterDTO;

public class generate_pdf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	String filename  = "C:\\Users\\day1\\generate_pdf\\panchatanthra.pdf";
	Document doc = new Document();
	PdfWriter.getInstance(doc, new FileOutputStream(filename));
	doc.open();
	System.out.println("pdf created");
	
	PdfPTable table = new PdfPTable(10);
	PdfPCell cell = new PdfPCell(new Phrase("student_id")) ;
//	cell.setNoWrap(true);
	table.addCell(cell);
	
	cell = new PdfPCell(new Phrase("student_name"));
	table.addCell(cell);
			
	cell = new PdfPCell(new Phrase("course_id"));
	table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("course_name"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("cod_count"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("qod_count"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("tod_count"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("low_count"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("vow_count"));
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("total"));
			table.addCell(cell);
			
			Connection con = ConnetionUtility.getConnection();
			PanchatanthraDAO pancha = new PanchatanthraDAOimpl();
			Collection<PanchatanthraDTO> col = pancha.findAll(con);
			System.out.println(col);
			Iterator<PanchatanthraDTO> iter = col.iterator();
			while(iter.hasNext()) {
				PanchatanthraDTO user = iter.next();
				long sid = user.getStudent_id();
				cell = new PdfPCell(new Phrase(String.valueOf(sid)));
				table.addCell(cell);
				
				Student_MasterDAO stud = new Student_MasterDAOimpl();
				Student_MasterDTO sdto = stud.findByID(sid, con);
				String Sname = sdto.getStudent_name();
				cell = new PdfPCell(new Phrase(Sname));
				table.addCell(cell);
				
				int cid = user.getCourse_id();
				cell = new PdfPCell(new Phrase(String.valueOf(cid)));
				table.addCell(cell);
				
				Course_MasterDAO cd = new Course_MasterDAOimpl();
				Course_MasterDTO cdto = cd.findByID(cid, con);
				String cname = cdto.getCourse_name();
				cell = new PdfPCell(new Phrase(String.valueOf(cname)));
				table.addCell(cell);
				
				long cod = user.getCod_count();
				cell = new PdfPCell(new Phrase(String.valueOf(cod)));
				table.addCell(cell);
				
				long qod = user.getQod_count();
				cell = new PdfPCell(new Phrase(String.valueOf(qod)));
				table.addCell(cell);

				long tod = user.getTod_count();
				cell = new PdfPCell(new Phrase(String.valueOf(tod)));
				table.addCell(cell);
				
				long low = user.getLow_count();
				cell = new PdfPCell(new Phrase(String.valueOf(low)));
				table.addCell(cell);
				
				long vow = user.getVow_count();
				cell = new PdfPCell(new Phrase(String.valueOf(vow)));
				table.addCell(cell);
				
				long total = user.getVow_count();
				cell = new PdfPCell(new Phrase(String.valueOf(vow)));
				table.addCell(cell);
				
			}
			
			doc.add(table);
			
			doc.close();
												
} catch (Exception e) {
	e.printStackTrace();
	// TODO: handle exception
}
	}

}
