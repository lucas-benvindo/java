package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class CreditCard extends PaymentMethod{
    protected int installments;
    protected static final double INTEREST_RATE = 0.05;


    public CreditCard(double purchaseAmount, int installments) {
        super(purchaseAmount);
        if (installments < 1){
            throw new IllegalArgumentException("The number of installments must be greater than or equal to 1");
        }
        this.installments = installments;
    }

    @Override
    public double calculateTheFee() {
        double feeValue = 0;
        double outstandingBalance = purchaseAmount;
        double installmentValue = purchaseAmount / installments;
        for (int i = 1; i <= installments; i++) {
            feeValue += outstandingBalance * INTEREST_RATE;
            outstandingBalance = outstandingBalance - installmentValue;
        }
        return feeValue;
    }

    @Override
    public String toProcessPayment() {
        return "";
    }
}
