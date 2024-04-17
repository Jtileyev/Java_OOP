package Start.lesson_4;

public class Ternary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 55;
        int moneyAfterShopping = money - breadPrice;
        int childMoney = moneyAfterShopping >= 50 ? 10 : 2;

        System.out.println(childMoney);
    }
}
