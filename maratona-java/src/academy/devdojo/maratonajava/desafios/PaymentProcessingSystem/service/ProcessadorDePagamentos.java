package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.service;

import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.PaymentMethod;

public class ProcessadorDePagamentos {

    public static double calculateTotalFee(PaymentMethod[] paymentMethods){
        double totalFee = 0;
        for ( PaymentMethod paymentMethod: paymentMethods){
            totalFee += paymentMethod.calculateTheFee();
        }
        return totalFee;
    }
}
