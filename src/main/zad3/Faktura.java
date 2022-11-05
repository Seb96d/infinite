package main.zad3;



public class Faktura extends Dokument {
    protected String typ = String.valueOf(rodzajFaktury.Faktura_elektroniczna);
}

enum rodzajFaktury {
    Faktura_VAT_podstawowa,
    Faktura_zaliczkowa,
    Faktura_uproszczona,
    Refakturowanie,
    Samofakturowanie,
    Faktura_VAT_marza,
    Faktura_VAT_RR,
    pro_forma,
    Faktura_elektroniczna
}
/*
Zadanie 3

Proszę zaprojektować strukturę klas opisującą następujący problem:
mamy obiekt dokument, który potrafi zwrócić wystawce dokumentu, odbiorcę dokumentu, datę
wystawienia, numer dokumentu.

mamy obiekty zamówienie i faktura które są szczególnymi typami dokumentu. Zamówienie
dodatkowo posiada pole termin realizacji, faktura posiada pole typ faktury.

• każdy dokument posiada metodę getRabat()
Proszę zaimplementuj metody getRabat() które dla faktury pobiorą rabat z nagłówka faktury a dla zamówienia
z danych odbiorcy dokumentu.
Proszę zaprojektować strukturę klas która pozwoli wyeksportować dokument w rożnych postaciach np.:
HTML,CSV,XML.

 */