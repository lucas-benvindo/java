package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.YearMonth;

public class CreditCard extends Card {
    protected int installments;
    private static final double INTEREST_RATE = 0.05;

    public CreditCard(double purchaseAmount, int installments, YearMonth expirationDate, String cardNumber, String cvv) {
        super(purchaseAmount, expirationDate, cardNumber, cvv);
        this.installments = installments;
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public double calculateTheFee() {
        double feeValue = 0;
        double outstandingBalance = purchaseAmount;
        double installmentValue = purchaseAmount / installments;
        for (int i = 1; i <= installments; i++) {
            feeValue += outstandingBalance * getInterestRate();
            outstandingBalance = outstandingBalance - installmentValue;
        }
        return feeValue;
    }

    @Override
    public void proof() {
        super.proof();
        System.out.println("Installments: " + installments);
    }
}
