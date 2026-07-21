package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class CLT extends Employee {
    private final double salary;
    private final double overtimeRate;
    private static final int STANDARD_HOURS = 220;

    public CLT(String name, double salary, double overtimeRate) {
        super(name);
        this.salary = salary;
        this.overtimeRate = overtimeRate;
    }

    }

    public double getSalary() {
        return salary;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }
}

