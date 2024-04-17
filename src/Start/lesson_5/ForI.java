package Start.lesson_5;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {3,2,10,5,8};

        for (int value : numbers){
            if(value % 2 == 0){
                System.out.println(value);
            }
        }

        for (int i = 0; i < numbers.length; i+=2) {
            System.out.println(i);
        }
    }
}
