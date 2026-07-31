package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class BankSlip extends PaymentMethod{
    protected static final double FEE = 2;

    public BankSlip(double purchaseAmount) {
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
