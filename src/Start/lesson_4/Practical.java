package Start.lesson_4;

public class Practical {
    public static void main(String[] args) {
        boolean isWorkTransmission = true;
        boolean isWorkEngine = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = true;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int isFineWheelCount = 0;
        isFineWheelCount += isFineWheel1 ? 1 : 0;
        isFineWheelCount += isFineWheel2 ? 1 : 0;
        isFineWheelCount += isFineWheel3 ? 1 : 0;
        isFineWheelCount += isFineWheel4 ? 1 : 0;

        if ((isWorkTransmission && isWorkEngine) && isFineWheelCount >= 3) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Не работает");
        }

    }
}
