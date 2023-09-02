package Controllers;

import Models.User;
import java.util.ArrayList;

public class LoginController {

    User userObj;
    ArrayList<User> userDB;

    public LoginController() {
        userDB = new ArrayList<>();
        
        userDB.add(new User("Himeth", "202122", "Navigation"));
    }

    public User addUser(String userName, String password, String Type) {
        userObj = new User(userName, password, Type);
        return userObj;
    }

    public User validateUser(User user) {
        for (User u : userDB) {
            if (user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
