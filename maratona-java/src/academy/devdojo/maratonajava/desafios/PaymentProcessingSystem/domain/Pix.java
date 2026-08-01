package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class Pix extends PaymentMethod{
    protected static final double FEE_VALUE = 0;
    protected final String instantPaymentKey;

    public Pix(double purchaseAmount, String instantPaymentKey) {
        super(purchaseAmount);
        this.instantPaymentKey = instantPaymentKey;
    }

    @Override
    public double calculateTheFee() {
        return FEE_VALUE;
    }

    @Override
    public String toProcessPayment() {
        return "";
    }
}
