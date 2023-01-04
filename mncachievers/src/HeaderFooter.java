package generate_pdf;

import java.io.FileReader;
import java.io.Writer;
import java.util.Properties;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException; 
import com.itextpdf.text.Paragraph; 
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Rectangle;

public class HeaderFooter extends PdfPageEventHelper{
public void OverAllheader(PdfReader writer,Document doc) {
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
		
//		writer.;
		ColumnText.showTextAligned(writer.getDirect, 0, null, 0, 0, 0);
	}catch(Exception e) {
		e.printStackTrace();
	}

}
	

}
