package main;

import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import main.zad3.*;

import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.time.LocalDateTime;

import static main.zad3.Dokument.saveToCSV;

public class Main {

    public static void main(String[] args) throws TransformerException, IOException, InvalidDefinitionException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter string to extract numbers from");
//        String string = scanner.next();
//        System.out.println(Zadanie1.seperateAndCalculate(string));
//        scanner.close();
        LocalDateTime now = LocalDateTime.now();
        Sender sender = new Sender("Gold","Trader","Gold Farm");
        Receiver receiver = new Receiver("New","Player","Respawn Point",5);
        Dokument doc1 = new Dokument("D14", sender, receiver, now);
        Dokument invoice1 = new Invoice("I48", sender, receiver, now, "pro_forma", 2.5);
        Dokument order1 = new Order("O45", sender, receiver, now, now);
        saveToCSV(doc1);
        saveToCSV(invoice1);
        saveToCSV(order1);
//        saveToJSON(doc1);

        System.out.println("---------------------------------------------------------------------");
//        System.out.println(DocToXML.printObjectToXML(doc1));
        System.out.println("---------------------------------------------------------------------");
//        DocToXML.printObjectToXML(invoice1);
        System.out.println("---------------------------------------------------------------------");
//        DocToXML.printObjectToXML(order1);
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
