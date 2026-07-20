package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class CLT extends Employee {
    private final double salary;
    private final double productivityBonus;

    public CLT(String name, double salary, double productivityBonus) {
        super(name);
        this.salary = salary;
        this.productivityBonus = productivityBonus;
    }

    public double getSalary() {
        return salary;
    }

    public double getProductivityBonus() {
        return productivityBonus;
    }

}

