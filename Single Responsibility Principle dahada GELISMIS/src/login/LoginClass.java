package login;

import user.RegisteredUsers;
import user.UserInformation;
import java.util.ArrayList;
import java.util.Scanner;
import print.AskForInfo;

public class LoginClass {

    UserInformation user;
    ArrayList<RegisteredUsers> registeredUsers;
    Scanner scanner = new Scanner(System.in);

    public LoginClass(ArrayList<RegisteredUsers> registeredUsers) {
        this.registeredUsers = registeredUsers;

    }

    public UserInformation Login() {
        int count = 0;
        while (count < 3) {
            AskForInfo.PleaseEnter("Username ");
            String id = scanner.nextLine();
            AskForInfo.PleaseEnter("Password ");
            String pass = scanner.nextLine();

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
        return null;
    }

}
