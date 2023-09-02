
package Controllers;
import Models.Employee;
import DatabaseAccsesLayer.EmployeeAccesslogic;



public class EmployeeController {
    
    Employee employeeObj;
       EmployeeAccesslogic eal;

    public EmployeeController() {
        eal = new EmployeeAccesslogic();
    }
    
    public Employee addEmployee(int No,String Name,String Date,String Telephone,String Email)
    {
        employeeObj=new Employee(No,Name,Date,Telephone,Email);
        return employeeObj;        
    }

    public boolean AddEmployeeDB(Employee employee) {
       
        boolean result = eal.AddEmployeeDB(employee);
        return result;
    }

    
    
}
