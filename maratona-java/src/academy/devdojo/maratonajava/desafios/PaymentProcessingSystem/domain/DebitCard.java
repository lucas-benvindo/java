package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class DebitCard extends PaymentMethod{

    public DebitCard(double purchaseAmount) {
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
