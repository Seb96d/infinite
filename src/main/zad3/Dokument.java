package main.zad3;

import java.io.IOException;
import java.time.LocalDateTime;
public class Dokument {
    protected String documentNumber;
    protected Sender sender;
    protected Receiver receiver;
    protected LocalDateTime dateOfIssue;

    private double getRabat(Invoice f) {
        return f.discount;
    }
    public double getRabat(Order z){
        return z.receiver.clientDiscount;
    }

    public Dokument(String documentNumber, Sender sender, Receiver receiver, LocalDateTime dateOfIssue) {
        this.documentNumber = documentNumber;
        this.sender = sender;
        this.receiver = receiver;
        this.dateOfIssue = dateOfIssue;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getSender() {
        return sender.toString();
    }

    public String getReceiver() {
        return receiver.toString();
    }

    public LocalDateTime getDateOfIssue() {
        return dateOfIssue;
    }

    @Override
    public String toString() {
        return "Dokument{" +
                "documentNumber='" + documentNumber + '\'' +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", dateOfIssue=" + dateOfIssue +
                '}';
    }

    public static void saveToCSV(Dokument d){
        DocToCSV.writeDocToCSV(d);
    }
    public static void saveToJSON(Dokument d) throws IOException {
        DocToJSON.writeDocToJSON(d);
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