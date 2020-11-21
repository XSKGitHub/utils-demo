/*
 * @Description: 
 * @Version: 2.0
 * @Autor: x-one
 * @Date: 2020-11-17 14:18:16
 * @LastEditors: x-one
 * @LastEditTime: 2020-11-18 15:37:26
 */
package org.xsk.utils.itext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xsk.utils.itext.demo.DocumentDemo;

@SpringBootTest
public class RectangleDemoTest {

    @Autowired
    private DocumentDemo documentDemo;

    @Test
    public void createPDFTests(){
        documentDemo.createPDF();
    }
    
}
