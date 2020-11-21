/*
 * @Description: 
 * @Version: 2.0
 * @Autor: x-one
 * @Date: 2020-11-16 16:52:07
 * @LastEditors: x-one
 * @LastEditTime: 2020-11-19 16:25:41
 */
package org.xsk.utils.itext.demo;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import org.springframework.stereotype.Component;
import org.xsk.utils.file.FileUtils;

@Component
public class DocumentDemo {

    public static String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\pdf\\rectangle.pdf";

    public void createPDF() {
        File file = FileUtils.createFile(filePath);
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
            document.open();
            document.add(new Paragraph("Hello World"));
            document.addAuthor("x-one");
            document.addTitle("文档对象练习");
            document.addSubject("练习使用itext操作pdf文档。");
            document.addKeywords("document");
            document.setMargins(10, 20, 30, 40);
            document.newPage();
            writer.setPageEmpty(false);
            document.newPage();
            document.add(new Paragraph("New page"));
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            document.close();
        }
        
    }   
}
