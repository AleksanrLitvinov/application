package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCard;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardImp implements DeckOfCard {

    CardBJ[] cards = new CardBJImpl[52];

    private static char CLUBS = 9827;
    private static char WORMS = 9829;
    private static char DIAMONDS = 9830;
    private static char SPADES = 9824;


    public DeckOfCardImp() {
        cards[0]=new CardBJImpl("Двойка Трефа", 2, CLUBS);
        cards[1] = new CardBJImpl("Двойка Черви", 2, WORMS);
        cards[2] = new CardBJImpl("Двойка Бубны", 2, DIAMONDS);
        cards[3] = new CardBJImpl("Двойка Пики", 2, SPADES);

        cards[4] = new CardBJImpl("Тройка Трефа", 3, CLUBS);
        cards[5] = new CardBJImpl("Тройка Черви", 3, WORMS);
        cards[6] = new CardBJImpl("Тройка Бубны", 3, DIAMONDS);
        cards[7] = new CardBJImpl("Тройка Пики", 3, SPADES);

        cards[8] = new CardBJImpl("Четверка Трефа", 4, CLUBS);
        cards[9] = new CardBJImpl("Четверка Черви", 4, WORMS);
        cards[10] = new CardBJImpl("Четверка Бубны", 4, DIAMONDS);
        cards[11] = new CardBJImpl("Четверка Пики", 4, SPADES);

        cards[12] = new CardBJImpl("Пятерка Трефа", 5, CLUBS);
        cards[13] = new CardBJImpl("Пятерка Черви", 5, WORMS);
        cards[14] = new CardBJImpl("Пятерка Бубны", 5, DIAMONDS);
        cards[15] = new CardBJImpl("Пятерка Пики", 5, SPADES);

        cards[16] = new CardBJImpl("Шестерка Трефа", 6, CLUBS);
        cards[17] = new CardBJImpl("Шестерка Черви", 6, WORMS);
        cards[18] = new CardBJImpl("Шестерка Бубны", 6, DIAMONDS);
        cards[19] = new CardBJImpl("Шестерка Пики", 6, SPADES);

        cards[20] = new CardBJImpl("Семерка Трефа", 7, CLUBS);
        cards[21] = new CardBJImpl("Семерка Черви", 7, WORMS);
        cards[22] = new CardBJImpl("Семерка Бубны", 7, DIAMONDS);
        cards[23] = new CardBJImpl("Семерка Пики", 7, SPADES);

        cards[24] = new CardBJImpl("Восьмерка Трефа", 8, CLUBS);
        cards[25] = new CardBJImpl("Восьмерка Черви", 8, WORMS);
        cards[26] = new CardBJImpl("Восьмерка Бубны", 8, DIAMONDS);
        cards[27] = new CardBJImpl("Восьмерка Пики", 8, SPADES);

        cards[28] = new CardBJImpl("Девятка Трефа", 9, CLUBS);
        cards[29] = new CardBJImpl("Девятка Черви", 9, WORMS);
        cards[30] = new CardBJImpl("Девятка Бубны", 9, DIAMONDS);
        cards[31] = new CardBJImpl("Девятка Пики", 9, SPADES);

        cards[32] = new CardBJImpl("Десятка Трефа", 10, CLUBS);
        cards[33] = new CardBJImpl("Десятка Черви", 10, WORMS);
        cards[34] = new CardBJImpl("Десятка Бубны", 10, DIAMONDS);
        cards[35] = new CardBJImpl("Десятка Пики", 10, SPADES);

        cards[36] = new CardBJImpl("Валет Трефа", 10, CLUBS);
        cards[37] = new CardBJImpl("Валет Черви", 10, WORMS);
        cards[38] = new CardBJImpl("Валет Бубны", 10, DIAMONDS);
        cards[39] = new CardBJImpl("Валет Пики", 10, SPADES);

        cards[40] = new CardBJImpl("Дама Трефа", 10, CLUBS);
        cards[41] = new CardBJImpl("Дама Черви", 10, WORMS);
        cards[42] = new CardBJImpl("Дама Бубны", 10, DIAMONDS);
        cards[43] = new CardBJImpl("Дама Пики", 10, SPADES);

        cards[44] = new CardBJImpl("Король Трефа", 10, CLUBS);
        cards[45] = new CardBJImpl("Король Черви", 10, WORMS);
        cards[46] = new CardBJImpl("Король Бубны", 10, DIAMONDS);
        cards[47] = new CardBJImpl("Король Пики", 10, SPADES);

        cards[48] = new CardBJImpl("Туз Трефа", 11, CLUBS);
        cards[49] = new CardBJImpl("Туз Черви", 11, WORMS);
        cards[50] = new CardBJImpl("Туз Бубны", 11, DIAMONDS);
        cards[51] = new CardBJImpl("Туз Пики", 11, SPADES);
    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51);
        return cards[randomIndex];
    }
}
