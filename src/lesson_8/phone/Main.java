package lesson_8.phone;

public class Main {
    public static void main(String[] args) {
//        Contact vasya = new Contact("Vasiliy", "895146542312", "test1@mail.ru");
//        Contact petya = new Contact("Petr", "895146542312", "test2@mail.ru");
//        Contact olya = new Contact("Olga", "895146321312", "test3@mail.ru");
//        Contact vova = new Contact("Vladimir", "895146542369", "test4@mail.ru");
//        Contact alex = new Contact("Alexey", "895146554612", "test5@mail.ru");

        PhoneBook phoneBook = new PhoneBook();

//        phoneBook.addContact(vasya);
//        phoneBook.addContact(petya);
//        phoneBook.addContact(olya);
//        phoneBook.addContact(vova);
//        phoneBook.addContact(alex);

        phoneBook.isTheNumberGreaterThanFive(5);
        phoneBook.min(4, 8);
        phoneBook.cube(2);

        //    4
//
//    Необходимо написать метод, который бы возводил число в степень.
//    И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
        int sum = phoneBook.powerNumber(2, 3) + phoneBook.powerNumber(4, 2);
        System.out.println(sum);



    }




}
