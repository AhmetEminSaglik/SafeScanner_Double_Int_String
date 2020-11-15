package main;

import print.AskForInfo;
import login.AfterLogin;
import login.LoginClass;
import user.UserInformation;
import user.address.AddressInfo;
import user.RegisteredUsers;
import safescanner.SafeScanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<RegisteredUsers> registeredUsersList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* for (int i = 0; i < 1050; i++) {
            System.out.println(i+" ) "+Character.toString(i));
        }*/
        while (true) {
            Options();
            SelectProcess();

        }

    }

    static void Options() {
        System.out.println("1-) Add User\n"
                + "2-) Login\n"
                + "3-) Exit\n");
        SafeScanner.howToCancelInfo();
    }

    static void SelectProcess() {

        int choose = -1;
        try {
            choose = new SafeScanner().getInteger();
        } catch (Exception ex) {
            System.err.println("Please enter  numbers  between given  options in the following line : ");

        }
        try {
            switch (choose) {

                case 1:
                    registeredUsersList.add(registerUser());
                    System.out.println("User is registered");
                    break;

                case 2:
                    if (registeredUsersList.size() > 0) {

                        UserInformation userInformation = new LoginClass(registeredUsersList).Login();
                        if (userInformation != null) {
                            new AfterLogin(userInformation);
                        }
                    } else {
                        System.out.println("!!! Nobody registered. Please sing up to login... \n");
                    }
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println("!!! Unknown Option !!! \n");

            }
        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    static RegisteredUsers registerUser() {
        try {
            RegisteredUsers registerUser = new RegisteredUsers();

            registerUser.setUserInformation(AddUser());

            AskForInfo.PleaseEnter("username");

            registerUser.setId(SafeScanner.getText());

            AskForInfo.PleaseEnter("password");
            registerUser.setPass(SafeScanner.getText());

            return registerUser;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;

    }

    static UserInformation AddUser() throws Exception {

        UserInformation userInfo = new UserInformation();
        SafeScanner.howToCancelInfo();

        AskForInfo.PleaseEnter("Name");
        userInfo.setName(SafeScanner.getString());

        AskForInfo.PleaseEnter("Surname");
        userInfo.setSurname(SafeScanner.getString());

        userInfo.setAddress(AddAddress());

        return userInfo;

    }

    static AddressInfo AddAddress() throws Exception {

        AddressInfo address = new AddressInfo();

        AskForInfo.PleaseEnter("Country");
        address.setCountry(SafeScanner.getString());

        AskForInfo.PleaseEnter("City");
        address.setCity(SafeScanner.getString());

        AskForInfo.PleaseEnter("Town");
        address.setTown(SafeScanner.getString());

        AskForInfo.PleaseEnter("Post Code");
        address.setPostCode(SafeScanner.getInteger());
        return address;

    }

    /*
 
    kullanici ekle --> kayitli kullaniciya ata  
    mainde  giris yap (kayitli kullanicilari gonder) --> onlardan birisi ise kayit yapilmis olsun ve ekrana bastir
   
    
    
    
    
    
    
    kullanici sinifini olustur 
    adress sinifini olustur
    kayitli kullanicilari olustur
    Login sinifini olustur
        
     */
}
