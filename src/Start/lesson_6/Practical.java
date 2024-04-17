package Start.lesson_6;

public class Practical {
    public static void main(String[] args) {
        String text = "My name is Jaras Tileyev";
        System.out.println(text.substring(11).toLowerCase());
        String[] array = text.split(" ");
        for (String str : array) {
            System.out.println(str);
        }
    }
}
