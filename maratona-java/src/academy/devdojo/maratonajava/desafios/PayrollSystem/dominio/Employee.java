package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class Employee {
    private final String name;
    private int hoursWorked;

    public Employee(String name) {
        this.name = name;
    }

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
