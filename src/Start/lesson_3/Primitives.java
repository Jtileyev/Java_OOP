package Start.lesson_3;

public class Primitives {
    public static void main(String[] args) {
        // Возможные значения TRUE(1) или FALSE(0)
        boolean exampleBool = true;

        //Byte сосотоит из 8 битов (0111 111)
        byte maxBite = 127;
        byte minBite = -128;

        //Short состоит из 2 двух байтов или же 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer состоит из 4 байтов или же 32 битов
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        //Long состоит из 8 байтов иди же 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Double - число с плавающей точкой, 64 bit
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 bit
        float cola = 0.33F;

        double doubleNumber = 1.1234567890123467890;
        float floatNumber = 1.1234567890123467890F;
        //System.out.println(doubleNumber);
        //System.out.println(floatNumber);

        //Char - character (символ), 16 bit
        char letter = 70;
        //System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);
    }
}
