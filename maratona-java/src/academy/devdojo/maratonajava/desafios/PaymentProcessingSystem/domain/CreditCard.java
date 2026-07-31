package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class CreditCard extends PaymentMethod{

    public CreditCard(double purchaseAmount) {
        super(purchaseAmount);
    }

    @Override
    public double calculateTheFee() {
        return 0;
    }

    @Override
    public String toProcessPayment() {
        return "";
    }
}
