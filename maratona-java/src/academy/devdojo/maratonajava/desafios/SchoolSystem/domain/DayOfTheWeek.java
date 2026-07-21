package academy.devdojo.maratonajava.desafios.SchoolSystem.domain;

public enum DayOfTheWeek {
    MONDAY(1, true),
    TUESDAY(2, true),
    WEDNESDAY(3, true),
    THURSDAY(4, true),
    FRIDAY(5, true),
    SATURDAY(6, false),
    SUNDAY(7, false);

    private final int dayOfTheWeekNumber;
    private final boolean isWeekday;

    DayOfTheWeek(int dayOfTheWeekNumber, boolean isWeekday) {
        this.dayOfTheWeekNumber = dayOfTheWeekNumber;
        this.isWeekday = isWeekday;
    }

    public int getDayOfTheWeekNumber() {
        return dayOfTheWeekNumber;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}
