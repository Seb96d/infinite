package main.zad2;

import main.zad1.Zadanie1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Zadanie1TestWithParam {
    @Test
    @DisplayName("Should not ask for operator if it's given in parameter")
    public void testWithParam1() {
        System.out.println(Zadanie1.seperateAndCalculate("a12lol3,;x+"));
        Assertions.assertEquals(15, 15);
    }
    @Test
    @DisplayName("Should not ask for operator if it's given in parameter")
    public void testWithParam2() {
        System.out.println(Zadanie1.seperateAndCalculate("a12lol3,;x-"));
        Assertions.assertEquals(9, 9);
    }
    @Test
    @DisplayName("Should not ask for operator if it's given in parameter")
    public void testWithParam3() {
        System.out.println(Zadanie1.seperateAndCalculate("a12lol3,;x*"));
        Assertions.assertEquals(36, 36);
    }
}