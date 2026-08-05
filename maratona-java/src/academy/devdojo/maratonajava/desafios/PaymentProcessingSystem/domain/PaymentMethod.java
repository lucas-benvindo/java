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
        System.out.printf("Purchase Amount: R$ %.2f%n", purchaseAmount);
        System.out.printf("Fee: R$ %.2f%n", this.calculateTheFee());
    }
}
