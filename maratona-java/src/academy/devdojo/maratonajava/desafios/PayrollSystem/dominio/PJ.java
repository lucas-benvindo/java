package academy.devdojo.maratonajava.desafios.PayrollSystem.dominio;

// Above hoursThreshold, a reduced rate kicks in (plateau effect).
public class PJ extends Employee {
    private final double hourlyRate;
    private final double reducedRate;
    private final double hoursThreshold;

    public PJ(String name, double hourlyRate, double reducedRate, double hoursThreshold) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.reducedRate = reducedRate;
        this.hoursThreshold = hoursThreshold;
    }

    @Override
    double calculatePayment() {
        if (super.getHoursWorked() <= hoursThreshold) {
            return super.getHoursWorked() * hourlyRate;
        }
        double hourlyRatePayment = hoursThreshold * hourlyRate;
        double reducedRatePayment = (super.getHoursWorked() - hoursThreshold) * reducedRate;
        return hourlyRatePayment + reducedRatePayment;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getReducedRate() {
        return reducedRate;
    }

    public double getHoursThreshold() {
        return hoursThreshold;
    }
}
