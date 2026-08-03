package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.YearMonth;

public class CreditCard extends PaymentMethod {
    protected int installments;
    protected static final double INTEREST_RATE = 0.05;
    protected final YearMonth expirationDate;
    protected final String cardNumber;

    public CreditCard(double purchaseAmount, int installments, YearMonth expirationDate, String cardNumber, String cvv) {
        super(purchaseAmount);
        if (installments < 1) {
            throw new IllegalArgumentException("The number of installments must be greater than or equal to 1");
        }
        this.installments = installments;
        if (expirationDate.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("Your credit card´s expiration date has passed.");
        }
        this.expirationDate = expirationDate;
        if (!isValidCardNumber(cardNumber)) {
            throw new IllegalArgumentException("The card´s number is invalid");
        }
        this.cardNumber = cardNumber;
        if (!isValidCvv(cvv)) {
            throw new IllegalArgumentException("The card's cvv is invalid");
        }
    }

    private boolean isValidCardNumber(String cardNumber) {
        return cardNumber.matches("\\d{16}") || cardNumber.matches("\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4}");
    }

    private boolean isValidCvv(String cvv) {
        return cvv.matches("\\d{3,4}");
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
    public void proof() {
        super.proof();
        System.out.println("Interest Rate: 5%");
        System.out.println("Installments: " + installments);
        System.out.println("Card Number:  **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Expiration Date: " + expirationDate);
    }
}
