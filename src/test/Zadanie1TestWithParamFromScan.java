package test;

import main.Zadanie1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;

public class Zadanie1TestWithParamFromScan {
    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
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