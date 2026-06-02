package academy.devdojo.maratonajava.introducao;

/**
 * Given the value of a car, find out how many installments it can be paid for <br>
 * Condition installmentValue >= 1000
 */

public class Lesson06RepetitionStructures04 {
    public static void main(String[] args) {
        double carValue = 80_000;
        int maxInstallments = (int) (carValue / 1000);
        double installmentValue;

        for (int installment = 1; installment <= maxInstallments; installment++) {
            installmentValue = carValue / installment;
            System.out.println("You have the opportunity to pay in " + installment + " installments of €" + installmentValue);
        }
    }
}