package academy.devdojo.maratonajava.introducao;

/**
 * Annual income tax in the Netherlands <br>
 * €0,001 -- €34,712 = 9.70% <br>
 * €34,713 -- €68,507 = 37.35% <br>
 * Above €68,508 = 49.50%
 */

public class Lesson05ConditionalStructures04 {
    public static void main(String[] args) {
        double annualWageOfTaxPayer = 50_000;
        boolean isTaxable = annualWageOfTaxPayer > 0 ;
        boolean isFirstBracket = annualWageOfTaxPayer <= 34_712;
        boolean isSecondBracket = annualWageOfTaxPayer > 34_712 && annualWageOfTaxPayer <= 68_507;
        double taxRate;

        if (isTaxable){
            if (isFirstBracket){
                taxRate = 9.70;
            } else if (isSecondBracket){
                taxRate = 37.35;
            } else {
                taxRate = 49.50;
            }
            System.out.println("Your annual income tax is " + taxRate + "% of your wage.");
            System.out.println("You need to pay €" + annualWageOfTaxPayer * (taxRate / 100));
        } else {
            System.out.println("Type a number bigger than 0.");
        }
    }
}
