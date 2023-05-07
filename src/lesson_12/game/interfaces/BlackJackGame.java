package lesson_12.game.interfaces;

public interface BlackJackGame {
    // Добавит игрока в игру

    void addPlayerInGame(Player player);

    // Выдать на по 2 карты

    void giveTwoCardsToEachPlayerOnStart();

    // Выдать дополнительные карты

    void giveCardIfNeedToPlayer();

    // Определить и вывести победителя

    void printWinner();

    // Посчитать количество играков в игре

    int countAllPlayerInGame();
}
