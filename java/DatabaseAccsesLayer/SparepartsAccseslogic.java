
package DatabaseAccsesLayer;

import DatabaseLayer.Databaseconnection;
import Models.Spareparts;

public class SparepartsAccseslogic {
    
          private Databaseconnection singleconn; 
          
       public SparepartsAccseslogic() {
        singleconn = Databaseconnection.getsingleconnection();
    }


    public boolean AddiSparepartsDB(Spareparts spareparts) {
        try {
            String query = "insert into Spareparts values('" + spareparts.getSparepartname() + "'," + spareparts.getSparepartPrice() + ",'" + spareparts.getSpareparttype ()  + "','"  + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }    
    
    
}
