/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 2
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a2;

import java.nio.file.Paths;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExcelParserTest {

    @Test
    public void testMain() {
        System.out.println("main");
        String expResult = System.getProperty("user.dir") + "\\" + "files";
        String result = Paths.get("").toAbsolutePath().toString() + "\\" + "files";
        assertEquals(expResult, result);

    }

}
