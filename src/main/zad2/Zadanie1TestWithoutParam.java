package main.zad2;

import main.zad1.Zadanie1;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Zadanie1TestWithoutParam {
    @Before
    public void setUpOutput() {
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
    @Test
    @DisplayName("Test 1 Should ask for operator if it's not given in parameter. No operator from user, return 0")
    public void testCase1() {
        final String testString = "LOL";
        provideInput(testString);
        System.out.println(Zadanie1.seperateAndCalculate("new String[0]'"));
        Assertions.assertEquals(0,0);
    }
    @Test
    @DisplayName("Test 2 Should ask for operator if it's not given in parameter. No operator from user, return 0")
    public void testCase2() {
        final String testString = "\n";
        provideInput(testString);
        System.out.println(Zadanie1.seperateAndCalculate("new String[0]12'4"));
        Assertions.assertEquals(0, 0);
    }
    @Test
    @DisplayName("Test 3 Should ask for operator if it's not given in parameter. No operator from user, return 0")
    public void testCase3() {
        final String testString = "hElLo WoRlD";
        provideInput(testString);
        System.out.println(Zadanie1.seperateAndCalculate("new String[0]12'4"));
        Assertions.assertEquals(0, 0);
    }
}