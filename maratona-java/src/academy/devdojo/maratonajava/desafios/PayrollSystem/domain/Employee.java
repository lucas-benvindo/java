package academy.devdojo.maratonajava.desafios.PayrollSystem.domain;

// Base type shared by all contract types (CLT, PJ, Intern).
public abstract class Employee {
    private final String name;
    private int hoursWorked;

    protected Employee(String name) {
        this.name = name;
    }

    // No parameters: each subclass already holds the data it needs to calculate.
    abstract double calculatePayment();

    public void printPayslip() {
        System.out.println("Name: " + name);
        System.out.println("Contract type: " + getClass().getSimpleName());
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Payment: " + calculatePayment());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    int getHoursWorked() {
        return hoursWorked;
    }

    void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
