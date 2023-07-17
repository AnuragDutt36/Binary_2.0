public class EnumExample {
    // Define an enum for days of the week
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        // Access enum constants
        Day today = Day.FRIDAY;
        System.out.println("Today is " + today);

        // Perform operations based on enum value
        if (today == Day.FRIDAY || today == Day.SATURDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        // Iterate over all enum constants
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
