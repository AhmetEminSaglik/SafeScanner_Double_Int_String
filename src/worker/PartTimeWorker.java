package worker;

public class PartTimeWorker extends Worker {
 
    private int WorkingHour;

    public PartTimeWorker() {
    }

    @Override
    public double calculateSalary() {

        return amountToEarn * WorkingHour;
    }

    public int getWorkingHour() {
        return WorkingHour;
    }

    public void setWorkingHour(int WorkingHour) {
        this.WorkingHour = WorkingHour;
    }

    
}
