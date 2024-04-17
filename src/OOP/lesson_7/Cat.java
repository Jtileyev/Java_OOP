package OOP.lesson_7;

public class Cat {
    String ownerName;
    double weight;
    String color;

    public Cat(String ownerName, double weight, String color) {
        this.ownerName = ownerName;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Cat{ownerName='%s', weight=%f, color='%s'}", ownerName, weight, color);
    }
}
