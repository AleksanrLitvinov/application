package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;

public class CardBJImpl implements CardBJ {

    private int value;
    private String nameOfCard;

    private char symbol;

    public CardBJImpl(String nameOfCard, int value, char symbol) {
        this.nameOfCard = nameOfCard;
        this.value = value;
        this.symbol = symbol;
    }

    // Вывод карты на консоль
    @Override
    public void printCard() {
        System.out.print(nameOfCard + " ");
    }
    //
    @Override
    public void printSymbol() {
        System.out.print(symbol);
        System.out.println();
    }

    // Получить значения карты
    @Override
    public int getValue() {
        return value;
    }
}
