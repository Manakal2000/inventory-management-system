package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection {

    private final String URL = "jdbc:mysql://localhost:3306/oopproject";
    private final String Uname = "root";
    private final String Password = "";
    private static Databaseconnection instance;
    private Connection con;

    public Databaseconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, Uname, Password);
            System.out.println("Connection Success");
        } catch (SQLException ex) {
            System.out.println("Database connection error" + ex.getMessage());

        } catch (ClassNotFoundException ex) {
            System.out.println("Database connection error" + ex.getMessage());
        }
    }

    public static Databaseconnection getsingleconnection() {
        try {

            if (instance == null) {
                instance = new Databaseconnection();
            } else if (instance.con.isClosed()) {
                instance = new Databaseconnection();
            } else {
                return instance;

            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Database connection ERROR" + ex.getMessage());
            return null;
        }
    }

    public boolean ExecuteQuery(String SqlQ) {

        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(SqlQ);
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("SQL Error" + ex.getMessage());
            return false;
        }

    }
}
