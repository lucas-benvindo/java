package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

public class PJ extends Employee {
    private final double hourlyRate;
    private final double reducedRate;

    public PJ(String name, double hourlyRate, double reducedRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.reducedRate = reducedRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getReducedRate() {
        return reducedRate;
    }
}
