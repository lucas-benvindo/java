package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class Funcionario {
    private final String name;
    private final double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
