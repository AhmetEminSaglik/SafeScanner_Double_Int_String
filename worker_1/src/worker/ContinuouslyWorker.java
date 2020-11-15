package worker;

public class ContinuouslyWorker extends Worker {

    private int WorkingMonthly;

    public ContinuouslyWorker() {
    }

    @Override
    public double calculateSalary() {

        return WorkingMonthly * amountToEarn;

    }

    public int getWorkingMonthly() {
        return WorkingMonthly;
    }

    public void setWorkingMonthly(int WorkingMonthly) {
        this.WorkingMonthly = WorkingMonthly;
    }

 
}
