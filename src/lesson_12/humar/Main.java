package lesson_12.humar;

public class Main {
//    3

//    Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
//
//    Примечание:
//    Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
//
//    Пример вывода:
//    Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
//    Имя: Катя, пол: женский, возраст: 55
//    Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
    public static void main(String[] args) {

        Human human = new Human("Аня",false, 47);
        Human human2 = new Human("Аня",false, 47,
                new Human("Витя"), new Human("Зоя"));
        System.out.println(human.toString());
        System.out.println(human2.toString());
    }
}
