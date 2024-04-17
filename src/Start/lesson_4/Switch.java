package Start.lesson_4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 3;
        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Ya zaebalsa Pisat");
        }
    }
}
