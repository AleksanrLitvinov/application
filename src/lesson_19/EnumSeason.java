package lesson_19;

public enum EnumSeason {
    WINTER(1, "Зима"), SPRING(2, "Весна"),
    SUMMER(3, "Лето"), AUTUMN(4, "Осень");
    private int numberOfSeason;
    private String russianName;

    EnumSeason(int numberOfSeason, String russianName) {
        this.numberOfSeason = numberOfSeason;
        this.russianName = russianName;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public String getRussianName() {
        return russianName;
    }
}
