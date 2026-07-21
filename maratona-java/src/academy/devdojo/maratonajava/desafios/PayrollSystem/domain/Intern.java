package academy.devdojo.maratonajava.desafios.PayrollSystem.domain;

public class Intern extends Employee {
    private final double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    double calculatePayment() {
        return stipend;
    }

    public double getStipend() {
        return stipend;
    }
}
