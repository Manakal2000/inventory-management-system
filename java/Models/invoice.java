package Models;

public class invoice {
    private String NO;
    private String Name;
    private String Address;
    private String Date;
    private int price;
    private String Email;
    private String Telephonenumber;

    public invoice(String NO, String Name, String Address, String Date, int price, String Email, String Telephonenumber) {
        this.NO = NO;
        this.Name = Name;
        this.Address = Address;
        this.Date = Date;
        this.price = price;
        this.Email = Email;
        this.Telephonenumber = Telephonenumber;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephonenumber() {
        return Telephonenumber;
    }

    public void setTelephonenumber(String Telephonenumber) {
        this.Telephonenumber = Telephonenumber;
    }
    

}
