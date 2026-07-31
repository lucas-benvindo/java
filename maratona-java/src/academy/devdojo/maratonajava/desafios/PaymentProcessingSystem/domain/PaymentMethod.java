package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public abstract class PaymentMethod {
    protected double purchaseAmount;

    public PaymentMethod(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public abstract String toProcessPayment();
    public abstract double calculateTheFee();
}
