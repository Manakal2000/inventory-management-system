package Models;

public class Suppliers {

    private String SupplierNO;
    private String SupplierName;
    private String Date;
    private String Type;
    private String Telephone;
    private String Email;

    public Suppliers(String SupplierNO, String SupplierName, String Date, String Type, String Telephone,String Email) {
        this.SupplierNO = SupplierNO;
        this.SupplierName = SupplierName;
        this.Date = Date;
        this.Type = Type;
        this.Telephone = Telephone;
        this.Email = Email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getSupplierNO() {
        return SupplierNO;
    }

    public void setSupplierNO(String SupplierNO) {
        this.SupplierNO = SupplierNO;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
