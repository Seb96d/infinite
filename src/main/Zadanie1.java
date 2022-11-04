package main;

import java.util.*;

public class Zadanie1 {
    public static long seperateAndCalculate(String s) {
        String operator = s.substring(s.length() - 1);
        System.out.println("Last character : " + operator);
        List<String> list = new ArrayList<>(Arrays.asList(s.split("\\D+")));
        List<Integer> intList = new ArrayList<>();
        for (String x : list) {
            if (isNumeric(x))
                intList.add(Integer.valueOf(x));
        }
        System.out.println("Numbers : " + intList);

        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*")) ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("No mathematical operator given, choose \"+\",\"-\",\"*\" to do operations on given numbers or press Enter to skip");
            operator = scanner.nextLine();
            if (operator.isEmpty()){
                System.out.println("Pressed enter");
            }
            scanner.close();
            switch (operator) {
                case "+":
                    int sum = 0;
                    for (int x : intList) {
                        sum = sum+x;
                    }
                    return sum;
                case "-":
                    int subtraction = intList.get(0);
                    for (int x : intList.subList(1, intList.size())) {
                        subtraction = subtraction-x;
                    }
                    return subtraction;
                case "*":
                    int multiplication = intList.get(0);
                    for (int x : intList.subList(1, intList.size())) {
                        multiplication = multiplication * x;
                    }
                    return multiplication;
                default:
                    return 0;
            }
        }
        return 0;
    }
    public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]+");
    }

}

////*
//Zadanie 1
//Proszę zaimplementować funkcję która:
//• na wejściu dostaje string zawierający dowolną ilość liczb przedzielonych separatorem
//separator w wejściowym stringu jest w grupie możliwych separatorów (tzn. string może wyglądać tak:
//12,34.56;67)
//•
//• na końcu wejściowego stringa może pojawić się znak odpowiadający za działanie (np. + - )
//na wyjściu mamy otrzymać liczbę będącą wynikiem działania z poprzedniego podpunktu na liczbach z
//wejściowego stringa
//•
//*//