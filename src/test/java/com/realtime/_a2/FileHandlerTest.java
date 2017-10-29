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
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileHandlerTest {
    
    public FileHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of storeData method, of class FileHandler.
     */
    @Test
    public void testStoreData() {
        System.out.println("storeData");
        String[] headers = null;
        List<Matrik> matriks = null;
        FileHandler instance = new FileHandlerImpl();
        instance.storeData(headers, matriks);
       
    }

    public class FileHandlerImpl implements FileHandler {

        public void storeData(String[] headers, List<Matrik> matriks) {
        }
    }
    
}
