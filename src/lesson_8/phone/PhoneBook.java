package lesson_8.phone;

public class PhoneBook {
    // fields
    Contact [] contacts = new Contact[100];

    // constructor
    public PhoneBook() {
    }


    // methods
    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    //    1
//
//    Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.

    public void cube(int number) {
        System.out.println(number * number * number);
    }

//     2
//
//    Напишите метод, который бы возвращал в консоль:
//    true, если число больше 5
//    и false, если число меньше 5

    public void isTheNumberGreaterThanFive(int number) {
        System.out.println(number >= 5);
    }

//    3
//
//    Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
//    Например, из двух чисел 7 и 3 метод должен вывести в консоль 3.

    public void min(int left, int right) {
        if (left > right) {
            System.out.println(right);
        } else {
            System.out.println(left);
        }
    }

//    4
//
//    Необходимо написать метод, который бы возводил число в степень.
//    И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.

    public int powerNumber(int number, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= number;

        }
        return res;
    }
}
