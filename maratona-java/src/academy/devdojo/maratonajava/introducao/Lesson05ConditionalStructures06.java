package academy.devdojo.maratonajava.introducao;

/**
 * Given the values from 1 to 7, print whether it is a weekday or weekend <br>
 * Considering 1 as Sunday
 */

public class Lesson05ConditionalStructures06 {
    public static void main(String[] args) {
        byte day = 4;

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
