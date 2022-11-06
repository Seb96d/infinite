package main.zad3;

public class Receiver {
    public double clientDiscount;
    private String name;
    private String surname;
    private String address;

    public Receiver(String name, String surname, String address, double rabat) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.clientDiscount = rabat;
    }


    @Override
    public String toString() {
        return "Receiver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", rabat=" + clientDiscount +
                '}';
    }

}
