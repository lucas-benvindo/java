package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.YearMonth;

public class DebitCard extends PaymentMethod {
    protected static final double INTEREST_RATE = 0.01;
    protected final YearMonth expirationDate;
    protected final String cardNumber;

    public DebitCard(double purchaseAmount, YearMonth expirationDate, String cardNumber, String cvv) {
        super(purchaseAmount);
        if (expirationDate.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("Your debit card´s expiration date has passed.");
        }
        this.expirationDate = expirationDate;
        if (!isValidCardNumber(cardNumber)) {
            throw new IllegalArgumentException("The card´s number is invalid");
        }
        this.cardNumber = cardNumber;
        if (!isValidCvv(cvv)) {
            throw new IllegalArgumentException("The card´s cvv is invalid");
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
        double feeValue;
        feeValue = purchaseAmount * INTEREST_RATE;
        return feeValue;
    }

    @Override
    public void proof() {
        super.proof();
        System.out.println("Interest Rate: 1%");
        System.out.println("Card Number:  **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Expiration Date: " + expirationDate);
    }
}
