package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.YearMonth;

public abstract class Card extends PaymentMethod {
    protected final YearMonth expirationDate;
    protected final String cardNumber;

    public Card(double purchaseAmount, YearMonth expirationDate, String cardNumber, String cvv) {
        super(purchaseAmount);
        if (expirationDate.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("Your card's expiration date has passed.");
        }
        this.expirationDate = expirationDate;
        if (!isValidCardNumber(cardNumber)) {
            throw new IllegalArgumentException("The card's number is invalid");
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

    public abstract double getInterestRate();

    @Override
    public void proof() {
        super.proof();
        System.out.printf("Interest Rate: %.0f%%%n", getInterestRate() * 100);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Expiration Date: " + expirationDate);
    }
}
