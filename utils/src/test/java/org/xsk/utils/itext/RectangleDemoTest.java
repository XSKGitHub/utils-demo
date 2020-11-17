package org.xsk.utils.itext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xsk.utils.itext.demo.RectangleDemo;

@SpringBootTest
public class RectangleDemoTest {

    @Autowired
    private RectangleDemo rectangleDemo;

    @Test
    public void createPDFTests(){
        rectangleDemo.createPDF();
    }
    
}
