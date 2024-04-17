package Start.lesson_5;

public class While {
    public static void main(String[] args) {
        int number = 0;

        while (number < 10) {
            number++;
            if (number == 3){
                System.out.println("Достигли 3");
                break;
            }
            System.out.println(number);
        }
    }
}
