
package Controllers;

import Models.Suppliers;
import DatabaseAccsesLayer.SuppliersAccsesLogic;


public class Supplierscontroller {
    Suppliers Suppliersobj;
    SuppliersAccsesLogic sal;
    
       public Supplierscontroller() {
        sal = new SuppliersAccsesLogic();
    }
    
    public Suppliers addSuppliers(String SupplierNO, String SupplierName, String Date, String Type, String Telephone,String Email)
    {
        Suppliersobj=new Suppliers(SupplierNO,SupplierName,Date,Type,Telephone,Email);
        return Suppliersobj;        
    }

    public boolean AddiSuppliersDB(Suppliers suppliers) {
       boolean result = sal.AddiSuppliersDB(suppliers);
        return result;
    }
}
