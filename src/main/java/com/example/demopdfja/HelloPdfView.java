package com.example.demopdfja;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component("hello")
public class HelloPdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> map, Document document, PdfWriter pdfWriter, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        BaseFont baseFont = BaseFont.createFont("HeiseiKakuGo-W5", "UniJIS-UCS2-H",
                false);
        Font normalFont = new Font(baseFont, 12);
        document.add(new Paragraph(map.get("message").toString(), normalFont));
    }
}
