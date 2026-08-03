package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.LocalDate;

public class BankSlip extends PaymentMethod {
    protected static final double FEE_VALUE = 3;
    protected final LocalDate expirationDate;

    public BankSlip(double purchaseAmount, LocalDate expirationDate) {
        super(purchaseAmount);
        if (expirationDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Your bank slip has expired.");
        }
        this.expirationDate = expirationDate;
    }

    @Override
    public double calculateTheFee() {
        return FEE_VALUE;
    }

    @Override
    public void proof() {
        super.proof();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
