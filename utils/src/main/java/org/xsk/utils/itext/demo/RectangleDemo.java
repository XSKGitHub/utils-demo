package org.xsk.utils.itext.demo;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import org.springframework.stereotype.Component;
import org.xsk.utils.file.FileUtils;

@Component
public class RectangleDemo {

    public static String filePath = System.getProperty("user.dir") + "rectangle.pdf";

    public void createPDF() {
        File file = FileUtils.createFile(filePath);
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            document.add(new Paragraph("Hello World"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            document.close();
        }

        
    }
    
}
