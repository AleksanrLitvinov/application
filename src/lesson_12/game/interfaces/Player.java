package lesson_12.game.interfaces;

public interface Player {

    // Взять карту из колоды

    void takeCard(CardBJ card);

    // Посчитать сумму карт на руках

    int countValuesAllCardOnHand();

    // Нужна ли дополнительная карта

    boolean needCard();

    // Выводит карту на руках

    void showCardOnHandAhdSymbol();

    // В игре
    boolean isInGame();

    void setInGame(boolean inGame);

    boolean isCroupier();
}
