package worker;

public class Worker {

    private String name = null;
    private String surname = null;
    private int No = 0;
    protected double amountToEarn = 0;

    public Worker() {
    }

    public double calculateSalary() {

        return amountToEarn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public double getamountToEarn() {
        return amountToEarn;
    }

    public void setamountToEarn(double amountToEarn) {
        this.amountToEarn = amountToEarn;
    }

}
