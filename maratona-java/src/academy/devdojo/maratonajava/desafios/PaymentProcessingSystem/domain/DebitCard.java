package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class DebitCard extends PaymentMethod{
    protected static final double INTEREST_RATE = 0.01;

    public DebitCard(double purchaseAmount) {
        super(purchaseAmount);
    }

    @Override
    public double calculateTheFee() {
        double feeValue;
        feeValue = purchaseAmount * INTEREST_RATE;
        return feeValue;
    }

    @Override
    public String toProcessPayment() {
        return "";
    }
}
