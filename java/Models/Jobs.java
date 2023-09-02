package Models;

public class Jobs {
    private String JObID;
    private String Jobname;
    private String Date;
    private String Email;
    private String Address;
    private int salary;

    public Jobs(String JObID, String Jobname, String Date, String Email, String Address, int salary) {
        this.JObID = JObID;
        this.Jobname = Jobname;
        this.Date = Date;
        this.Email = Email;
        this.Address = Address;
        this.salary = salary;
    }

    public String getJObID() {
        return JObID;
    }

    public void setJObID(String JObID) {
        this.JObID = JObID;
    }

    public String getJobname() {
        return Jobname;
    }

    public void setJobname(String Jobname) {
        this.Jobname = Jobname;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getsalary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
