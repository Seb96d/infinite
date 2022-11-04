package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to extract numbers from");
        String string = scanner.next();
        System.out.println(Zadanie1.seperateAndCalculate(string));
        scanner.close();

    }





}




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