/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 2
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a2;

import java.util.List;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileSaverTest {
    
    public FileSaverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testCellName() {
        ExcelParser parser = new ExcelParser();
        parser.compute();
        FileSaver saver = parser.fileHandler;
        assertEquals(saver.getCell("B7"), "LOC");
    }
    
   
     @Test
    public void testCellName2() {
        ExcelParser parser = new ExcelParser();
        parser.compute();
        FileSaver saver = parser.fileHandler;
        assertEquals(saver.getCell("D7"), "Comment");
    }
    
    
    
     @Test
    public void testCellName3() {
        ExcelParser parser = new ExcelParser();
        parser.compute();
        FileSaver saver = parser.fileHandler;
        assertEquals(saver.getCell("C7"), "Blank");
    }

    
}
