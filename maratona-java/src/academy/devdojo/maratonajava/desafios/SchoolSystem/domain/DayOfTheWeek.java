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

    public static DayOfTheWeek getDayByNumber(int number){
        for (DayOfTheWeek dayOfTheWeek: values()){
            if(dayOfTheWeek.getDayOfTheWeekNumber() ==  number){
                return dayOfTheWeek;
            }
        }
        return null;
    }

    public static int getNumberByDayName(String dayOfTheWeekName) {
        if (dayOfTheWeekName == null) {
            return 0;
        }
        try {
            DayOfTheWeek dayOfTheWeek = DayOfTheWeek.valueOf(dayOfTheWeekName.trim().toUpperCase());
            return dayOfTheWeek.getDayOfTheWeekNumber();
        } catch (IllegalArgumentException e) {
            return 0;
        }
    }

    public DayOfTheWeek getNextDay() {
        if (this.getDayOfTheWeekNumber() == 7) {
            return MONDAY;
        }
        return getDayByNumber(this.getDayOfTheWeekNumber() + 1);
    }

    public int getDayOfTheWeekNumber() {
        return dayOfTheWeekNumber;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}
