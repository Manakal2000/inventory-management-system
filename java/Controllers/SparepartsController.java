
package Controllers;

import Models.Spareparts;
import DatabaseAccsesLayer.SparepartsAccseslogic;


public class SparepartsController {
    
    Spareparts sparepartsobj;
    SparepartsAccseslogic qal;

    public SparepartsController() {
        qal = new SparepartsAccseslogic();
    }

    
    public Spareparts addspareparts(String sparepartname, int Sparepartprice, String Sparepartstype)
    {
        sparepartsobj=new Spareparts(sparepartname,Sparepartprice,Sparepartstype);
        return sparepartsobj;        
    }

    public boolean AddiSparepartsDB(Spareparts spareparts) {
        boolean result = qal.AddiSparepartsDB(spareparts);
        return result;
    }

    
    
    
}
