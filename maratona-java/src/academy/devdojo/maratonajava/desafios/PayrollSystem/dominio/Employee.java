package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public abstract class Employee {
    private final String name;
    private int hoursWorked;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculatePayment();

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
