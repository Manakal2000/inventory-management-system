
package Models;


public class Employee {
    
    private int No;
    private String Name;
    private String Date;
    private String Telephone;
    private String Email;       
    
    public Employee(int No,String Name,String Date,String Telephone,String Email)
            
    {
        this.No=No;
        this.Name=Name;
        this.Date=Date;
        this.Telephone=Telephone;
        this.Email=Email;
    } 

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String toString()
    {
        return "No"+this.No+"Name"+this.Name+"Date"+this.Date+"Telephone"+this.Telephone+"Email"+this.Email;
    }
    
    
    
    
}
