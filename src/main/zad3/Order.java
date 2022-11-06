package main.zad3;

import java.time.LocalDateTime;

public class Order extends Dokument {
    protected LocalDateTime realizationTime;

    public Order(String documentNumber, Sender sender, Receiver receiver, LocalDateTime dateOfIssue, LocalDateTime realizationTime) {
        super(documentNumber, sender, receiver, dateOfIssue);
        this.realizationTime = realizationTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "realizationTime=" + realizationTime +
                ", documentNumber='" + documentNumber + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", dateOfIssue=" + dateOfIssue +
                ", client discount=" + receiver.clientDiscount +
                '}';
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
