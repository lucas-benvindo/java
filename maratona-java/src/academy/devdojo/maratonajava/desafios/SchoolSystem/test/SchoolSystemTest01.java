package academy.devdojo.maratonajava.desafios.SchoolSystem.test;

import academy.devdojo.maratonajava.desafios.SchoolSystem.domain.DayOfTheWeek;
import academy.devdojo.maratonajava.desafios.SchoolSystem.domain.School;

public class SchoolSystemTest01 {
    public static void main(String[] args) {
        School marista = new School("Marista", new DayOfTheWeek[]{DayOfTheWeek.MONDAY, DayOfTheWeek.TUESDAY, DayOfTheWeek.WEDNESDAY, DayOfTheWeek.THURSDAY, DayOfTheWeek.FRIDAY});

        for (DayOfTheWeek dayOfTheWeek : marista.getDayOfTheWeek()) {
            System.out.println(marista.getName() + " operates on " + dayOfTheWeek);
        }

        System.out.println("===============");

        for (DayOfTheWeek dayOfTheWeek: DayOfTheWeek.values()){
            System.out.println("Day of the week: " + dayOfTheWeek.name());
            System.out.println("Day number: " + dayOfTheWeek.getDayOfTheWeekNumber());
            System.out.println("Is weekday?: " + dayOfTheWeek.isWeekday());
            System.out.println("Next day: " + dayOfTheWeek.getNextDay());
            System.out.println("===============");
        }
    }
}
