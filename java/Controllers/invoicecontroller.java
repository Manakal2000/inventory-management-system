package Controllers;

import Models.invoice;
import DatabaseAccsesLayer.invoiceAccesslogic;

public class invoicecontroller {

    invoice invoiceobj;
    invoiceAccesslogic ial;

    public invoicecontroller() {
        ial = new invoiceAccesslogic();
    }

    public invoice addinvoice(String NO,String Name, String Address, String Date, int price, String Email, String Telephonenumber) {

        invoiceobj = new invoice(NO,Name, Address, Date, price, Email, Telephonenumber);
        return invoiceobj;
    }

    public boolean AddinvoiceDB(invoice Invoice) {
        boolean result = ial.AddinvoiceDB(Invoice);
        return result;
    }

    public boolean updateinvoiceDB(invoice Invoice) {
        boolean result = ial.updateinvoiceDB(Invoice);
        return result;
    }
    
    public boolean DeleteinvoiceDB(invoice Invoice) {
        boolean result = ial.DeleteinvoiceDB(Invoice);
        return result;
    }

}
