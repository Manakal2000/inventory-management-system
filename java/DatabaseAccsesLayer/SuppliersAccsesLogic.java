package DatabaseAccsesLayer;

import DatabaseLayer.Databaseconnection;
import Models.Suppliers;

public class SuppliersAccsesLogic {

    private Databaseconnection singleconn;

    public SuppliersAccsesLogic() {
        singleconn = Databaseconnection.getsingleconnection();
    }

    public boolean AddiSuppliersDB(Suppliers suppliers) {
        try {
            String query = "insert into suppliers values('" + suppliers.getSupplierNO()+ "','" + suppliers.getSupplierName() + "','" + suppliers.getDate() + "','" + suppliers.getType() + "','" + suppliers.getTelephone() + "','" + suppliers.getEmail() + "','" + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }
    
    
}
