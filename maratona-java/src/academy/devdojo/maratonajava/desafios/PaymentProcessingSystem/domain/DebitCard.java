package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.YearMonth;

public class DebitCard extends Card {
    private static final double INTEREST_RATE = 0.01;

    public DebitCard(double purchaseAmount, YearMonth expirationDate, String cardNumber, String cvv) {
        super(purchaseAmount, expirationDate, cardNumber, cvv);
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public double calculateTheFee() {
        double feeValue;
        feeValue = purchaseAmount * getInterestRate();
        return feeValue;
    }

}
