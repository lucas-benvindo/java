package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

// Base type shared by all contract types (CLT, PJ, Intern).
public abstract class Employee {
    private final String name;
    private int hoursWorked;

    protected Employee(String name) {
        this.name = name;
    }

    public abstract double calculatePayment();

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
