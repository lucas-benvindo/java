package academy.devdojo.maratonajava.desafios.PayrollSystem.domain;

public class CLT extends Employee {
    private final double salary;
    private final double overtimeRate;
    private static final int STANDARD_HOURS = 220;

    public CLT(String name, double salary, double overtimeRate) {
        super(name);
        this.salary = salary;
        this.overtimeRate = overtimeRate;
    }

    @Override
    double calculatePayment() {
        // Math.max avoids negative overtime when hoursWorked < STANDARD_HOURS
        double overtimeHours = Math.max(0, super.getHoursWorked() - STANDARD_HOURS);
        double extraHoursPayment = overtimeHours * overtimeRate;
        return salary + extraHoursPayment;
    }

    public double getSalary() {
        return salary;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }
}

