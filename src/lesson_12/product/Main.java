package lesson_12.product;



public class Main {

//    1
//
//    Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//    Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
//    Создать класс Basket, содержащий массив купленных товаров.
//    Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
    public static void main(String[] args) {

        Product product1 = new Product("Молоко", 65.4, 7);
        Product product2 = new Product("Кефир", 80.3, 9);

        Product[] products1 = {product1, product2};

        Product product3 = new Product("Пиво", 65.4, 7);
        Product product4 = new Product("Вино", 80.3, 9);

        Product[] products2 = {product3, product4};

        Category category1 = new Category("Кисломолочное", products1);
        Category category2 = new Category("Алкогольные", products2);

        Product[] products = {product1, product2, product3, product4};

        Basket basket = new Basket(products);


        User user = new User("Singleton", "re1243qwe", basket);
    }
}
