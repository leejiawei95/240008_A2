/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realtime._a2;

import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
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

    /**
     * Test of getName method, of class Matrik.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Matrik instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLoc method, of class Matrik.
     */
    @Test
    public void testGetLoc() {
        System.out.println("getLoc");
        Matrik instance = null;
        long expResult = 0L;
        long result = instance.getLoc();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBlank method, of class Matrik.
     */
    @Test
    public void testGetBlank() {
        System.out.println("getBlank");
        Matrik instance = null;
        long expResult = 0L;
        long result = instance.getBlank();
        assertEquals(expResult, result);

    }

    /**
     * Test of getComment method, of class Matrik.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        Matrik instance = null;
        long expResult = 0L;
        long result = instance.getComment();
        assertEquals(expResult, result);

    }

    /**
     * Test of getActual method, of class Matrik.
     */
    @Test
    public void testGetActual() {
        System.out.println("getActual");
        Matrik instance = null;
        long expResult = 0L;
        long result = instance.getActual();
        assertEquals(expResult, result);

    }

    /**
     * Test of getWordCount method, of class Matrik.
     */
    @Test
    public void testGetWordCount() {
        System.out.println("getWordCount");
        Matrik instance = null;
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.getWordCount();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTotal method, of class Matrik.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Matrik instance = null;
        long expResult = 0L;
        long result = instance.getTotal();
        assertEquals(expResult, result);

    }

}
