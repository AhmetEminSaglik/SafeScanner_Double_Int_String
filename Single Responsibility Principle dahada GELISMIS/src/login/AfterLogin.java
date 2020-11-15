package login;

import user.UserInformation;
import safescanner.SafeScanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AfterLogin {

    UserInformation userInformation;

    public AfterLogin(UserInformation userInformation) {
        this.userInformation = userInformation;
        WhatUserWantToDo();
    }

    void WhatUserWantToDo() {
        int select = -1;
        while (select != 3) {
            try {
                Options();
                select = SafeScanner.getInteger();
                switch (select) {
                    case 1:
                        userNameSurname();
                        break;
                    case 2:
                        userAddress();
                        break;
                    case 3:
                        System.out.println("Exit");

                        break;
                    default:
                        System.out.println("!!! Unknown Option !!! \n");

                }
            } catch (Exception ex) {
                Logger.getLogger(AfterLogin.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("log out successfully");

    }

    void Options() {
        System.out.println("1-) My name ~ surname\n"
                + "2-) My address\n"
                + "3-) logout\n");
    }

    void userNameSurname() {
        System.out.println("Name    : " + userInformation.getName());
        System.out.println("Surname : " + userInformation.getSurname() + "\n");
    }

    void userAddress() {
        System.out.println(userInformation.getAddress());
    }
}
