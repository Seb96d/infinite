package main.zad3;


import java.time.LocalDateTime;

public class Invoice extends Dokument {
    protected String type;
    protected enum invoiceTypes{
        Invoice_VAT_podstawowa,
        Invoice_zaliczkowa,
        Invoice_uproszczona,
        Refakturowanie,
        Samofakturowanie,
        Invoice_VAT_marza,
        Invoice_VAT_RR,
        pro_forma,
        Invoice_elektroniczna
    }
    protected double discount;

    public Invoice(String numerDokumentu, Sender wystawca, Receiver odbiorca, LocalDateTime dataWystawienia, invoiceTypes invoiceType) {
                super(numerDokumentu, wystawca, odbiorca, dataWystawienia);
        this.type = String.valueOf(invoiceType);
    }
}


/*
Zadanie 3

Proszę zaprojektować strukturę klas opisującą następujący problem:
mamy obiekt dokument, który potrafi zwrócić wystawce dokumentu, odbiorcę dokumentu, datę
wystawienia, numer dokumentu.

mamy obiekty zamówienie i Invoice które są szczególnymi typami dokumentu. Zamówienie
dodatkowo posiada pole termin realizacji, Invoice posiada pole typ faktury.

• każdy dokument posiada metodę getRabat()
Proszę zaimplementuj metody getRabat() które dla faktury pobiorą rabat z nagłówka faktury a dla zamówienia
z danych odbiorcy dokumentu.
Proszę zaprojektować strukturę klas która pozwoli wyeksportować dokument w rożnych postaciach np.:
HTML,CSV,XML.

 */