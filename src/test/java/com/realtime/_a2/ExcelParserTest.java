/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realtime._a2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ExcelParserTest {

    @Test
    public void testMain() {
        System.out.println("main");
        String expResult = System.getProperty("user.dir") + "\\" + "files";
        String result = Paths.get("").toAbsolutePath().toString() + "\\" + "files";
        assertEquals(expResult, result);

    }

}
