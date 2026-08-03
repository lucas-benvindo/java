package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

import java.time.LocalDate;

public abstract class PaymentMethod {
    protected double purchaseAmount;

    public PaymentMethod(double purchaseAmount) {
        if (purchaseAmount <= 0) {
            throw new IllegalArgumentException("Please enter a purchase amount greater than zero.");
        }
        this.purchaseAmount = purchaseAmount;
    }

    public abstract double calculateTheFee();

    public void proof(){
        System.out.println("Date: " + LocalDate.now());
        System.out.println("Purchase Amount: R$ " + purchaseAmount);
        System.out.println("Fee: R$ " + this.calculateTheFee());
    }
}
