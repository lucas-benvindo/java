package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class CLT extends Employee {
    private double salary;

    public CLT(String name) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

