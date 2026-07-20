package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class CLT extends Employee {
    private double salary;
    private double productivityBonus;

    public CLT(String name) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getProductivityBonus() {
        return productivityBonus;
    }

    public void setProductivityBonus(double productivityBonus) {
        this.productivityBonus = productivityBonus;
    }
}

