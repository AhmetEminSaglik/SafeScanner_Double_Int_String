
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {

    static double getDouble() throws Exception {
        try {

            Scanner scanner = new Scanner(System.in);
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

    static Integer getInteger() throws Exception {
        try {

            Scanner scanner = new Scanner(System.in);
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

    static String getString() throws Exception {
        try {

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            isCancelled(text);
            char[] a = text.toCharArray();
            if (a.length == 0) {
                throw new InputMismatchException();
            }
            text = text.trim();

            for (int i = 0; i < a.length; i++) {
                if (text.length() == 0 || (!Character.isLetter(a[i]) && !Character.isSpaceChar(a[i]))) {
                    throw new InputMismatchException();
                }

            }
            return text;
        } catch (java.util.InputMismatchException ex) {
            System.err.println("You have to enter just String");
            return getString();
        }

    }

    static void howToCancelInfo() {
        System.out.println("If you want to cancel process you can enter Cancel (lower case ~ upper case  no matter )");
    }

    static boolean isCancelled(String text) throws Exception {
        text = text.toLowerCase();
        text = text.trim();
        if (text.equals("cancel")) {
            throw new Exception(" - - - - - - PROCESS IS CANCELLED - - - - - - PROCESS IS CANCELLED - - - - - - PROCESS IS CANCELLED - - - - - - ");
        }
        return false;
    }

}
