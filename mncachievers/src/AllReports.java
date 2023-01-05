package generate_pdf;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import course.Course_MasterDAO;
import course.Course_MasterDAOimpl;
import course.Course_MasterDTO;
import panchatanthra.PanchatanthraDAO;
import panchatanthra.PanchatanthraDAOimpl;
import panchatanthra.PanchatanthraDTO;
import student_master.Student_MasterDAO;
import student_master.Student_MasterDAOimpl;
import student_master.Student_MasterDTO;

public class AllReports {

	public static void main(String[] args)throws Exception {
		Document doc = new Document();
		 
		PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\day1\\generate_pdf\\AllReports.pdf"));
		doc.open();
		
		HeaderFooter hf = new HeaderFooter();
		hf.OverAllheader(writer, doc);
		
		Rectangle rect = new Rectangle(577,825,18,15);
		rect.enableBorderSide(1);
		rect.enableBorderSide(2);
		rect.enableBorderSide(4);
		rect.enableBorderSide(8);
		rect.setBorderWidth(1);
		rect.setBorderColor(BaseColor.GRAY);
		doc.add(rect);
		
		doc.add(new Chunk(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));
		doc.add(new Paragraph(" "));

		PdfPTable tab = new PdfPTable(10);
		
		tab.setWidthPercentage(100);
		tab.setWidths(new float[] { 2.6f ,2.6f ,2.4f ,2.5f ,1.6f ,1.8f , 1.6f , 1.8f ,1.8f , 2.3f });
		
		PdfPCell cell;
		cell = new PdfPCell(new Phrase("Student Id"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Student Name"));
		tab.addCell(cell);

		cell = new PdfPCell(new Phrase("Course Id"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Course Name"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("COD"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("QOD"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("TOD"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("LOW"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("VOW"));
		tab.addCell(cell);
		
		cell = new PdfPCell(new Phrase("percent"));
		tab.addCell(cell);
		
		Connection con = ConnetionUtility.getConnection() ;
		
		PanchatanthraDAO pan = new PanchatanthraDAOimpl();
		Collection<PanchatanthraDTO> col = pan.findAll(con);
		
		Iterator<PanchatanthraDTO> iter = col.iterator();
		while(iter.hasNext()) {
			PanchatanthraDTO sm = iter.next();
			
			long st_id = sm.getStudent_id();
			cell = new PdfPCell(new Phrase(String.valueOf(st_id)));
			tab.addCell(cell);
			
			Student_MasterDAO dao = new Student_MasterDAOimpl();
			Student_MasterDTO sd = dao.findByID(st_id, con);
			
			String name = sd.getStudent_name();
			System.out.println(name);
			cell = new PdfPCell(new Phrase(name));
			tab.addCell(cell);
			
			int c_id = sm.getCourse_id();
			cell = new PdfPCell(new Phrase(String.valueOf(c_id)));
			tab.addCell(cell);
			
			Course_MasterDAO cd = new Course_MasterDAOimpl();
			Course_MasterDTO cdto = cd.findByID(c_id, con);
			
			String cname = cdto.getCourse_name();
			cell = new PdfPCell(new Phrase(cname));
			tab.addCell(cell);
			
			int cod_count  = sm.getCod_count()*5;
			cell = new PdfPCell(new Phrase(String.valueOf(cod_count)));
			tab.addCell(cell);
			
			int qod_count = sm.getQod_count()*5;
			cell = new PdfPCell(new Phrase(String.valueOf(qod_count)));
			tab.addCell(cell);
			
			int tod_count = sm.getTod_count()*5;
			cell = new PdfPCell(new Phrase(String.valueOf(tod_count)));
			tab.addCell(cell);
			
			int low_count = sm.getLow_count()*25;
			cell = new PdfPCell(new Phrase(String.valueOf(low_count)));
			tab.addCell(cell);
			
			int vow_count = sm.getVow_count()*25;
			cell = new PdfPCell(new Phrase(String.valueOf(vow_count)));
			tab.addCell(cell);
			
			double total = cod_count+qod_count+tod_count+low_count+vow_count;
			
			double percent  = (total*100)/125;
			cell = new PdfPCell(new Phrase(String.valueOf(percent)+"%"));
			tab.addCell(cell);
			
		}
		
		doc.add(tab);
		doc.close();
		
		ConnetionUtility.closeConnection(null, null);
	}
}
