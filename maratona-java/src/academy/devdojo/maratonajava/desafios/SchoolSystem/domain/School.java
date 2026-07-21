package academy.devdojo.maratonajava.desafios.SchoolSystem.domain;

public class School {
    private final String name;
    private final DayOfTheWeek dayOfTheWeek;

    public School(String name, DayOfTheWeek dayOfTheWeek) {
        this.name = name;
        this.dayOfTheWeek = dayOfTheWeek;
    }
}
