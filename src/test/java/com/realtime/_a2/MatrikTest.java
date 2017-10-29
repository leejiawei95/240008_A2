/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 2
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SMART
 */
public class MatrikTest {
    
    public MatrikTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Matrik.
     */

    
    @Test
    public void testLOC(){
        ExcelParser parser=new ExcelParser();
        parser.compute();
        Matrik mat=parser.matrik;
        assertEquals(mat.getLoc(), 30);
    }
    
    
    @Test
    public void testComments(){
        ExcelParser parser=new ExcelParser();
        parser.compute();
        Matrik mat=parser.matrik;
        assertEquals(mat.getComment(), 7);
    }
    
     @Test
    public void testBlank(){
        ExcelParser parser=new ExcelParser();
        parser.compute();
        Matrik mat=parser.matrik;
        assertEquals(mat.getBlank(), 6);
    }
    
    
    
     @Test
    public void testActual(){
        ExcelParser parser=new ExcelParser();
        parser.compute();
        Matrik mat=parser.matrik;
            assertEquals(mat.getActual(), 17);
    }
}