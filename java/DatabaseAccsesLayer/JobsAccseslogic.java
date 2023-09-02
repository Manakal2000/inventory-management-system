
package DatabaseAccsesLayer;

import DatabaseLayer.Databaseconnection;
import Models.Jobs;


public class JobsAccseslogic {
    
      private Databaseconnection singleconn; 
      
      
       public JobsAccseslogic() {
        singleconn = Databaseconnection.getsingleconnection();
    }


    public boolean AddiJobsDB(Jobs jobs) {
        try {
            String query = "insert into jobs values('" + jobs.getJObID() + "','" + jobs.getJobname() + "','" + jobs.getDate ()+ "','" + jobs.getEmail()+ "','" + jobs.getAddress()+ "'," + jobs.getsalary()  + ",'"  + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }  
    
    public boolean UpdateJobsDB(Jobs jobs) {
        try {
            String query = "updates jobs ('" + jobs.getJObID() + "','" + jobs.getJobname() + "','" + jobs.getDate ()+ "','" + jobs.getEmail()+ "','" + jobs.getAddress()+ "'," + jobs.getsalary()  + ",'"  + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }    
    
    public boolean DeleteJobsDB(Jobs jobs) {
        try {
            String query = " Delete jobs ('" + jobs.getJObID() + "','" + jobs.getJobname() + "','" + jobs.getDate ()+ "','" + jobs.getEmail()+ "','" + jobs.getAddress()+ "'," + jobs.getsalary()  + ",'"  + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }    
}
