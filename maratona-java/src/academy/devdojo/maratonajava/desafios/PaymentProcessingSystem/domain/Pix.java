package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class Pix extends PaymentMethod{
    protected static final double FEE = 0;

    public Pix(double purchaseAmount) {
        super(purchaseAmount);
    }

    @Override
    public double calculateTheFee() {
        return FEE;
    }

    @Override
    public String toProcessPayment() {
        return "";
    }
}
