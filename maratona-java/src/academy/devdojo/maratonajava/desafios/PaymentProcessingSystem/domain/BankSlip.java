package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class BankSlip extends PaymentMethod{
    protected static final double FEE_VALUE = 3;

    public BankSlip(double purchaseAmount) {
        super(purchaseAmount);
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
