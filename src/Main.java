
import java.util.ArrayList;
import worker.ContinuouslyWorker;
import worker.PartTimeWorker;

public class Main {

    static ArrayList<PartTimeWorker> partWork = new ArrayList<PartTimeWorker>();
    static ArrayList<ContinuouslyWorker> contWork = new ArrayList<ContinuouslyWorker>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Worker Program\n".toUpperCase());
        while (true) {
            ProcessInfo();
            SelectProcess();
        }
    }

    public static PartTimeWorker AddPartimeWorker() throws Exception {
        PartTimeWorker ptw = new PartTimeWorker();

        askForName();
        ptw.setName(SafeScanner.getString());

        askForSurname();
        ptw.setSurname(SafeScanner.getString());

        askForNo();
        ptw.setNo(SafeScanner.getInteger());

        askForAmaountToEarn();
        ptw.setamountToEarn(SafeScanner.getDouble());

        askForHours();
        ptw.setWorkingHour(SafeScanner.getInteger());

        return ptw;
    }

    public static ContinuouslyWorker AddContinuouslyWorker() throws Exception {
        ContinuouslyWorker cw = new ContinuouslyWorker();

        askForName();
        cw.setName(SafeScanner.getString());

        askForSurname();
        cw.setSurname(SafeScanner.getString());

        askForNo();
        cw.setNo(SafeScanner.getInteger());

        askForAmaountToEarn();
        cw.setamountToEarn(SafeScanner.getDouble());

        askForMounths();
        cw.setWorkingMonthly(SafeScanner.getInteger());

        return cw;
    }

    static void ProcessInfo() {
        System.out.println("1-) Add Parttime Worker\n"
                + "2-) Add Continuously Worker\n"
                + "3-) Show all workers\n"
                + "4-) Exit\n\n"
                + "Please  enter one of the giving above option\n");

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
                    SafeScanner.howToCancelInfo();

                    partWork.add(AddPartimeWorker());

                    showAddedParttimeWork(partWork.get(partWork.size() - 1));

                    break;

                case 2:
                    SafeScanner.howToCancelInfo();
                    contWork.add(AddContinuouslyWorker());
                    showAddedContinuouslyWork(contWork.get(contWork.size() - 1));
                    break;
                case 3:
                    showAllWorkers();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("!!! Unknown Option !!! \n");

            }
        } catch (Exception ex) {
            System.err.println(ex);
        }

    }

    static void askForName() {
        System.out.println("Please enter Name");
    }

    static void askForSurname() {
        System.out.println("Please enter Surname");
    }

    static void askForNo() {
        System.out.println("Please enter No");
    }

    public static void askForAmaountToEarn() {
        System.out.println("Please enter the Amount will be Earned");
    }

    static void askForHours() {
        System.out.println("Please enter how many hours will be worked ");
    }

    static void askForMounths() {
        System.out.println("Please enter the month is worked");
    }

    static void showAddedParttimeWork(PartTimeWorker partWork) {
        System.out.println("Name : " + partWork.getName());
        System.out.println("Surname : " + partWork.getSurname());
        System.out.println("No : " + partWork.getNo());
        System.out.println("Working Hour : " + partWork.getWorkingHour());
        System.out.println("Amount to Earn : " + partWork.getamountToEarn());
        System.out.println("Salary : " + partWork.calculateSalary());
        bigSpace();
    }

    static void showAddedContinuouslyWork(ContinuouslyWorker conWork) {
        System.out.println("Name : " + conWork.getName());
        System.out.println("Surname : " + conWork.getSurname());
        System.out.println("No : " + conWork.getNo());
        System.out.println("Working Hour : " + conWork.getWorkingMonthly());
        System.out.println("Amount to Earn : " + conWork.getamountToEarn());
        System.out.println("Salary : " + conWork.calculateSalary());
        bigSpace();

    }

    static void showAllWorkers() {

        if (partWork.size() > 0) {
            System.out.println("*******************************************************\n"
                    + "PARTTIME WORKERS : \n");

            for (int i = 0; i < contWork.size(); i++) {
                showAddedParttimeWork(partWork.get(i));

            }
        } else {
            System.out.println("You did not add any Parttime Worker".toUpperCase());
        }

        if (contWork.size() > 0) {
            System.out.println("*******************************************************\n"
                    + "CONTINUOUSLY WORKERS : \n");
            for (int i = 0; i < contWork.size(); i++) {
                showAddedContinuouslyWork(contWork.get(i));

            }
        } else {
            System.out.println("You did not add any Continuously Worker\n".toUpperCase());
        }

        System.out.println("/////////////////////////////////////////////////\n");

    }

    static void bigSpace() {
        System.out.println("\n\n");
    }
}
