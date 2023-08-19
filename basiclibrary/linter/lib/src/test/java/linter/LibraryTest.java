/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



import java.io.PrintStream;

class LibraryTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test void testJavaScriptLinter1() throws IOException {
        String path ="C:/gradlyProjects/basiclibrary/linter/lib/src/main/resources/gates.js";
        Library sut=new Library();

        sut.javaScriptLinter(path);
        String[] errorLines = outputStreamCaptor.toString().trim().split("\n");
        String [] expectedErrorLines = new String[46];
        expectedErrorLines[0]="Line 3: Missing semicolon.\r";
        expectedErrorLines[1]="Line 5: Missing semicolon.\r";
        for (int i = 0; i < errorLines.length; i++) {
            assertEquals(errorLines[i],expectedErrorLines[i]);
        }

    }
    @Test void testJavaScriptLinter2() throws IOException {
        String path ="C:/gradlyProjects/basiclibrary/linter/lib/src/main/resources/gates1.js";
        Library sut=new Library();

        sut.javaScriptLinter(path);
        String[] errorLines = outputStreamCaptor.toString().trim().split("\n");
        String [] expectedErrorLines = new String[0];
        for (int i = 0; i < errorLines.length; i++) {
            assertEquals(errorLines[i],expectedErrorLines[i]);
        }

    }
    @Test void testJavaScriptLinter3() throws IOException {
        String path ="C:/gradlyProjects/basiclibrary/linter/lib/src/main/resources/gates2.js";
        Library sut=new Library();

        sut.javaScriptLinter(path);
        String[] errorLines = outputStreamCaptor.toString().trim().split("\n");
        String [] expectedErrorLines = new String[1];
        expectedErrorLines[0]="Line 74: Missing semicolon.\r";
        for (int i = 0; i < errorLines.length; i++) {
            assertEquals(errorLines[i],expectedErrorLines[i]);
        }

    }
    @Test void testJavaScriptLinter4() throws IOException {
        String path ="C:/gradlyProjects/basiclibrary/linter/lib/src/main/resources/gates3.js";
        Library sut=new Library();

        sut.javaScriptLinter(path);
        String[] errorLines = outputStreamCaptor.toString().trim().split("\n");
        String [] expectedErrorLines = new String[0];
        for (int i = 0; i < errorLines.length; i++) {
            assertEquals(errorLines[i],expectedErrorLines[i]);
        }

    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
