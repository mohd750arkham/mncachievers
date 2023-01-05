package generate_pdf;

import java.io.FileReader;
import java.util.Properties;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

public class HeaderFooter extends PdfPageEventHelper{
public void OverAllheader(PdfWriter writer,Document doc) {
	try {
		FileReader read = new FileReader("config.properties");
		Properties pro = new Properties();
		pro.load(read);
		String filename = pro.getProperty("header");
		Image image = Image.getInstance(filename);
		image.setWidthPercentage(5);
		image.setXYRatio(3);
		image.setAbsolutePosition(210, 750);
		image.scalePercent(60,40);
		image.setAlignment(Element.ALIGN_CENTER);
		image.setAlignment(Element.ALIGN_TOP);
		
		writer.getDirectContent().addImage(image, true);
		ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	public void AscendingOrderheader(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void DescendingOrderheader(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ReportForCodOnly(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void ReportForLabOfTheWeek(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void QuestionOfTheDay(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void TestOfTheDay(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void VideoOfTheWeek(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void IndividualReport(PdfWriter writer,Document doc) {
		try {
			FileReader read = new FileReader("config.properties");
			Properties pro = new Properties();
			pro.load(read);
			String filename = pro.getProperty("header");
			
			Image image = Image.getInstance(filename);
			image.setWidthPercentage(5);
			image.setXYRatio(3);
			image.setAbsolutePosition(210, 750);
			image.scalePercent(60,40);
			image.setAlignment(Element.ALIGN_CENTER);
			image.setAlignment(Element.ALIGN_TOP);
			
			writer.getDirectContent().addImage(image, true);
			ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_BOTTOM, new Phrase("OverAll Reports"), 250, 705, 0 );
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void C_Header(PdfWriter writer,Document doc) {
		try {
			
		}catch(Exception e) {

		}
	}
	public void footer (PdfWriter writer,Document doc) {
		
	}
	
}


