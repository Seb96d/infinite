package main.zad4;

public class Invoice{
    private String invoiceNumber;
    private Object invoiceData;

    public Invoice(String invoiceNumber, Object invoiceData) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceData = invoiceData;
    }


    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Object getInvoiceData() {
        return invoiceData;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceData(Object invoiceData) {
        this.invoiceData = invoiceData;
    }
}
