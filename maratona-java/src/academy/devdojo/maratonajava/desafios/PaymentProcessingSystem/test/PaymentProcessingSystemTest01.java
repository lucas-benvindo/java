package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.test;

import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.CreditCard;

public class PaymentProcessingSystemTest01 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000, 5);
        System.out.println(creditCard.calculateTheFee());
        System.out.println(creditCard.calculateTheFee());
    }
}
