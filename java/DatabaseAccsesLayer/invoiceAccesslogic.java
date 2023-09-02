package DatabaseAccsesLayer;

import DatabaseLayer.Databaseconnection;

import Models.invoice;
import java.lang.reflect.Array;

public class invoiceAccesslogic {

    private Databaseconnection singleconn;

    public invoiceAccesslogic() {
        singleconn = Databaseconnection.getsingleconnection();
    }

    public boolean AddinvoiceDB(invoice Invoice) {
        try {
            String query = "insert into invoice values('" + Invoice.getNO() + "','" + Invoice.getName() + "','" + Invoice.getAddress() + "','" + Invoice.getDate() + "'," + Invoice.getPrice() + ",'" + Invoice.getEmail() + "','" + Invoice.getTelephonenumber() + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }

    public boolean updateinvoiceDB(invoice Invoice) {
        try {
            String query = "update invoice SET invoice_Name='" + Invoice.getName()+"',invoice_Address='"+Invoice.getAddress() + "',invoice_Date='"+ Invoice.getDate()+"',invoice_price='"+Invoice.getPrice()+"',invoice_Email='"+Invoice.getEmail()+"',invoice_Telephonenumber='"+Invoice.getTelephonenumber()+"' where invoice_NO='" + Invoice.getNO() + "'";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
        //UPDATE table_name
//SET column1 = value1, column2 = value2, ...
//WHERE condition;

    }

    public boolean DeleteinvoiceDB(invoice Invoice) {
        try {
            String query = "Delete from invoice where invoice_NO='"+Invoice.getNO()+"'";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }

    }
 
}
