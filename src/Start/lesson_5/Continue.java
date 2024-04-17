package Start.lesson_5;

public class Continue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int value : numbers){
            if(value == 3){
                continue;
            }
            System.out.println(value);
        }
    }
}
