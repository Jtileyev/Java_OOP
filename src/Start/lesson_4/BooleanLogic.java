package Start.lesson_4;

public class BooleanLogic {
    public static void main(String[] args) {
        // Сынок купил хлеб ?
        boolean isBoughtBread = true;
        boolean isBoughtMilk = true;

        if(isBoughtBread && isBoughtMilk) {
            System.out.println("Он купил Хлеб и Молоко");
        } else if (isBoughtBread) {
            System.out.println("Он купил только Хлеб");
        } else if (isBoughtMilk) {
            System.out.println("Он купил только Молоко");
        } else {
            System.out.println("Он нечего не купил");
        }

        boolean isBoughtCandy = false;

        if (!isBoughtCandy) {
            System.out.println("Молодец что не купил сладостей");
        }
    }
}
