package Start.lesson_6;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Jaras";
        int age = 18;

        System.out.printf("Меня завут %s мне %d лет",name,age);

        String text = """
                Hello my name is %s
                My age is %d
                """.formatted(name,age);
        System.out.printf(text);
    }
}

