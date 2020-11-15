package login;

import user.RegisteredUsers;
import user.UserInformation;
import java.util.ArrayList;
import print.AskForInfo;
import safescanner.SafeScanner;

public class LoginClass {

    UserInformation user;
    ArrayList<RegisteredUsers> registeredUsers;

    public LoginClass(ArrayList<RegisteredUsers> registeredUsers) {
        this.registeredUsers = registeredUsers;

    }

    public UserInformation Login() {
        try {
            int count = 0;
            while (count < 3) {

                AskForInfo.PleaseEnter("Username ");
                String id = SafeScanner.getText();
                AskForInfo.PleaseEnter("Password ");
                String pass = SafeScanner.getText();

                for (int i = 0; i < registeredUsers.size(); i++) {
                    if (registeredUsers.get(i).getId().equals(id)
                            && registeredUsers.get(i).getPass().equals(pass)) {
                        System.out.println("login is successfull");

                        return registeredUsers.get(i).getUserInformation();

                    }
                }
                System.out.println("!!! Username or Password is wrong !!!\n");
                count++;

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

}
