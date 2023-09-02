package DatabaseAccsesLayer;

import DatabaseLayer.Databaseconnection;
import Models.Employee;


public class EmployeeAccesslogic {

    private Databaseconnection singleconn;

    public EmployeeAccesslogic() {
        singleconn = Databaseconnection.getsingleconnection();
    }

    public boolean AddEmployeeDB(Employee employee) {
        try {
            String query = "insert into Employee values('" + employee.getNo() + ",'" + employee.getName() + "','" + employee.getDate() + "','" + employee.getTelephone() + "','" + employee.getEmail() + "','" + "');";
            boolean result = singleconn.ExecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;

        }
    }

}
