package academy.devdojo.maratonajava.introducao;

/**
 * print all even numbers from 0 to 1000000
 */

public class Lesson06RepetitionStructures02 {
    public static void main(String[] args) {
        for (int count = 0; count <= 1_000_000 ; count++){
            if (count % 2 == 0){
                System.out.println(count);
            }
        }
    }
}
