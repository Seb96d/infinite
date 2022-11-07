package main.zad4;

public class CacheInvoice<String, Object> extends InvoiceJpaRepository {
//    private String invoiceNumber;
//    private Object invoiceData;
    private static int recordCount = 0;

//    public void cacheInvoice(String invoiceNumber, Object invoiceData) {
//        this.invoiceData = invoiceData;
//        this.invoiceNumber = invoiceNumber;
//        incrementRecordCount();
//    }
    public void cacheInvoice(Invoice invoice) {
        Invoice cachedInvoice = find(invoice.getInvoiceNumber());
//        this.invoiceNumber = (String) invoice.getInvoiceNumber();
//        this.invoiceData = (Object) invoice.getInvoiceData();
//        Invoice invoice1 = invoice;
        recordCount++;
    }
}
