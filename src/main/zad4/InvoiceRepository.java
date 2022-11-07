package main.zad4;

public interface InvoiceRepository {
    Invoice find(String invoiceNumber);
    void cacheInvoice(Invoice invoice);
}
