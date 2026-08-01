package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public abstract class PaymentMethod {
    protected double purchaseAmount;

    public PaymentMethod(double purchaseAmount) {
        if (purchaseAmount <= 0){
            throw new IllegalArgumentException("Please enter a purchase amount greater than zero.");
        }
        this.purchaseAmount = purchaseAmount;
    }

    public abstract String toProcessPayment();
    public abstract double calculateTheFee();
}
