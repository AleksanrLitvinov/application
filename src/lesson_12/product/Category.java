package lesson_12.product;

public class Category {
    private String name;
    public Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}
