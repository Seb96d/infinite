package main.zad3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dokument {
    protected String numerDokumentu;
    protected String wystawca, odbiorca;
    protected LocalDateTime dataWystawienia;

    private double getRabat(Dokument d) {
        double x = 0;
        return x;
    }
    public Dokument() {
    }

    public Dokument(String numerDokumentu, String wystawca, String odbiorca, LocalDateTime dataWystawienia) {
        this.numerDokumentu = numerDokumentu;
        this.wystawca = wystawca;
        this.odbiorca = odbiorca;
        this.dataWystawienia = dataWystawienia;
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "numerDokumentu='" + numerDokumentu + '\'' +
                ", wystawca='" + wystawca + '\'' +
                ", odbiorca='" + odbiorca + '\'' +
                ", dataWystawienia=" + dataWystawienia +
                '}';
    }
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