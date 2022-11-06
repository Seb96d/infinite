package main;

import main.zad3.Dokument;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter string to extract numbers from");
//        String string = scanner.next();
//        System.out.println(Zadanie1.seperateAndCalculate(string));
//        scanner.close();
        LocalDateTime now = LocalDateTime.now();
//        Dokument doc = new Dokument("123A", "John Smith", "Jane Doe", now);
//        System.out.println(doc);

    }





}
/*
Zadanie 3

        Proszę zaprojektować strukturę klas opisującą następujący problem:
        mamy obiekt dokument, który potrafi zwrócić wystawce dokumentu, odbiorcę dokumentu, datę
        wystawienia, numer dokumentu.
        •
        mamy obiekty zamówienie i Invoice które są szczególnymi typami dokumentu. Zamówienie
        dodatkowo posiada pole termin realizacji, Invoice posiada pole typ faktury.
        •
        • każdy dokument posiada metodę getRabat()
        Proszę zaimplementuj metody getRabat() które dla faktury pobiorą rabat z nagłówka faktury a dla zamówienia
        z danych odbiorcy dokumentu.
        Proszę zaprojektować strukturę klas która pozwoli wyeksportować dokument w rożnych postaciach np.:
        HTML,CSV,XML.
*/
