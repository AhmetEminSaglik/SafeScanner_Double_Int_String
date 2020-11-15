package safescanner;

import java.util.InputMismatchException;
import java.util.Scanner;
import safescanner.language.CharacterControl;

public class SafeScanner {

    static Scanner scanner = new Scanner(System.in);

    public static double getDouble() throws Exception {
        try {

            String text = scanner.nextLine();

            isCancelled(text);

            double val = Double.parseDouble(text);
            if (val > 0) {
                return val;
            }
            System.err.println("You have to enter  numbers bigger than 0");
            return getDouble();

        } catch (NumberFormatException ex) {
            System.err.println("You have to enter just numbers!!! ");
            return getDouble();
        }
    }

    public static Integer getInteger() throws Exception {
        try {

            String text = scanner.nextLine();
            text = text.trim();
            isCancelled(text);

            int val = Integer.parseInt(text);

            if (val > 0) {
                return val;
            }
            System.err.println("You have to enter  numbers bigger than 0");
            return getInteger();

        } catch (NumberFormatException ex) {
            System.err.println("You have to enter just numbers!!! ");
            return getInteger();
        }
    }

    public static String getString() throws Exception { //return just string
        try {

            String text = getText();

            char[] a = text.toLowerCase().toCharArray();
            if (a.length == 0) {
                throw new InputMismatchException();
            }
            text = text.trim();

            for (int i = 0; i < a.length; i++) {
                if (text.length() == 0 || (!CharacterControl.isLetter(a[i]))) { //if (text.length() == 0 || (!CharacterControl.isLetter(a[i]) && !Character.isSpaceChar(a[i]))) {
                    throw new InputMismatchException();
                }

            }
            return text;
        } catch (java.util.InputMismatchException ex) {
            System.err.println("You have to enter just String");
            return getString();
        }

    }

    public static void howToCancelInfo() {
        System.out.println("If you want to cancel process you can enter Cancel (lower case ~ upper case  no matter )");
    }

    public static boolean isCancelled(String text) throws Exception {
        text = text.toLowerCase();
        text = text.trim();
        if (text.equals("cancel")) {
            throw new Exception("\n*\n- - - - - - PROCESS IS CANCELLED - - - - - - PROCESS IS CANCELLED - - - - - - PROCESS IS CANCELLED - - - - - - \n*\n");
        }
        return false;
    }

    public static String getText() throws Exception { // return every input
        String text = scanner.nextLine();
        text = text.trim();
        isCancelled(text);
        
        if(text.length()==0){
            System.err.println("You cant enter just space");
            return getText();
        }

        return text;

    }

    public static int followindLine_EnterOnlyNumber(String text) {
        int choice;
        try {
            choice = getInteger();
        } catch (Exception ex) {
            System.err.println("Please enter  numbers  between given  options : \n");
            System.out.println(text);
            return followindLine_EnterOnlyNumber(text);

        }
        return choice;
    }

}
