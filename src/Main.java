import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private int id;
    private String fruitName;
    private int price;

    public Main() {
    }

    public Main(int id, String fruitName, int price) {
        this.id = id;
        this.fruitName = fruitName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Main{id=" + id + ", fruitName='" + fruitName + "', price=" + price + "}";
    }

    public static void main(String[] args) {
        List<Main> fruits = new ArrayList<>();
        fruits.add(new Main(1, "Mango", 100));
        fruits.add(new Main(2, "Apple", 150));
        fruits.add(new Main(3, "Banana", 50));

        // Sorting by price in ascending order
        fruits.sort(Comparator.comparingInt(Main::getPrice));
        fruits.forEach(System.out::println);
        System.out.println("--------------------------------");
        // Sorting by price in decending order
        fruits.sort(Comparator.comparingInt(Main::getPrice).reversed());
        fruits.forEach(System.out::println);
    }
}
