package academy.devdojo.maratonajava.desafios.PaymentProcessingSystem.domain;

public class Pix extends PaymentMethod {
    protected static final double FEE_VALUE = 0;
    protected final String instantPaymentKey;

    public Pix(double purchaseAmount, String instantPaymentKey) {
        super(purchaseAmount);
        if (!isValidCpf(instantPaymentKey) && !isValidEmail(instantPaymentKey) && !isValidPhone(instantPaymentKey) && !isValidRandomKey(instantPaymentKey)) {
            throw new IllegalArgumentException("Invalid Pix key format.");
        }
        this.instantPaymentKey = instantPaymentKey;
    }

    private boolean isValidCpf(String instantPaymentKey) {
        return instantPaymentKey.matches("\\d{11}") || instantPaymentKey.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }

    private boolean isValidEmail(String instantPaymentKey) {
        return instantPaymentKey.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    private boolean isValidPhone(String instantPaymentKey) {
        return instantPaymentKey.matches("\\d{11}") || instantPaymentKey.matches("\\(\\d{2}\\)\\s?\\d{5}-\\d{4}");
    }

    private boolean isValidRandomKey(String instantPaymentKey) {
        return instantPaymentKey.matches("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    }

    @Override
    public double calculateTheFee() {
        return FEE_VALUE;
    }

    @Override
    public void proof() {
        super.proof();
        System.out.println("Instant Payment Key: " + instantPaymentKey);
    }
}
