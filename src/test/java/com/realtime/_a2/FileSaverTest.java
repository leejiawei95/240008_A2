/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realtime._a2;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class FileSaverTest {
    
    public FileSaverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of storeData method, of class FileSaver.
     */
    @Test
    public void testStoreData() {
        System.out.println("storeData");
        String[] headers = null;
        List<Matrik> matriks = null;
        FileSaver instance = new FileSaver();
        instance.storeData(headers, matriks);
        
    }
    
}
