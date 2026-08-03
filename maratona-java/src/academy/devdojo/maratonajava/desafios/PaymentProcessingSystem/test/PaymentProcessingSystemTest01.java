package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.test;


import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.BankSlip;
import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.CreditCard;
import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.DebitCard;
import academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain.Pix;

import java.time.LocalDate;
import java.time.YearMonth;

public class PaymentProcessingSystemTest01 {
    public static void main(String[] args) {
        BankSlip bankSlip = new BankSlip(500, LocalDate.of(2032, 5, 21));
        bankSlip.proof();

        System.out.println("=================");

        CreditCard creditCard = new CreditCard(200, 3, YearMonth.of(2027,10), "5502 5862 1475 8521", "774");
        creditCard.proof();

        System.out.println("=================");

        DebitCard debitCard = new DebitCard(120, YearMonth.of(2029, 5), "9674 2005 5632 7458", "855");
        debitCard.proof();

        System.out.println("=================");
        Pix pix = new Pix(170, "11949905875");
        pix.proof();
    }
}

