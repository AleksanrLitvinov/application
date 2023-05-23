package lesson_16;

public class FridgeMain {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();

        fridge.putProducts("Apple", 5);
        fridge.putProducts("Bananas", 6);
        fridge.putProducts("PineApple", 2);
        fridge.putProducts("Qiwi", 3);
        fridge.putProducts("Milk", 1);
        fridge.putProducts("Potatoes", 1);
        fridge.putProducts("Tomatoes", 3);
        fridge.putProducts("Meat", 2);

        fridge.takeProduct("Bananas", 3);
    }
}
