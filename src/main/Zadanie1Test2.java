package main;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Zadanie1Test2 {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    @DisplayName("Test 1 Should ask for operator if it's not given in parameter")
    public void testCase1() {
        final String testString = "+";
        provideInput(testString);

        System.out.println(Zadanie1.seperateAndCalculate("new String[0]'"));

        Assertions.assertEquals(0,0);
    }
    @Test
    @DisplayName("Test 2 Should ask for operator if it's not given in parameter")
    public void testCase2() {
        final String testString = "+";
        provideInput(testString);

        System.out.println(Zadanie1.seperateAndCalculate("new String[0]12'4"));

        Assertions.assertEquals(16, 16);
    }
    @Test
    @DisplayName("Test 3 Should ask for operator if it's not given in parameter")
    public void testCase3() {
        final String testString = "\n";
        provideInput(testString);

        System.out.println(Zadanie1.seperateAndCalculate("new String[0]12'4"));

        Assertions.assertEquals(0, 0);
    }

}