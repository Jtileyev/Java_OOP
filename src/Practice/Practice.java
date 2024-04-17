package Practice;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {6,9,3,5,2};
        int sum = 0;
        for (int number : arr){
            if(number % 3 == 0){
                continue;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
