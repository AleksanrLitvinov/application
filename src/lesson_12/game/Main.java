package lesson_12.game;

import lesson_12.game.entities.BlackJackGameImp;
import lesson_12.game.entities.Croupier;
import lesson_12.game.entities.PlayerImp;
import lesson_12.game.interfaces.BlackJackGame;

import java.util.Scanner;

//        1 - Добавить имена игрокам
//        2 - регулировать кол-во игроков
//        3 - отрегулировать процесс выявления победителя, разбирали на уроке, что последний шаг проверки барахлит
//        4 * - добавить символ каждой карты и выводить саму карту с её символом + текстовое описание

public class Main {

    public static void main(String[] args) {

        // 1 - Создать игру
        BlackJackGame game = new BlackJackGameImp();
        // 2 - Создавать игроков
        System.out.println("Введите количество игроков");
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Имя игрока");
            Scanner scannerName = new Scanner(System.in);
            game.addPlayerInGame(new PlayerImp(scannerName.nextLine()));
        }
        // 3 - Создать крупье Добавит играка и крупье в игру
        Croupier croupier = new Croupier();
        game.addPlayerInGame(croupier);
        // 4 - Раздовать по две карты каждому игроку
        game.giveTwoCardsToEachPlayerOnStart();
        // 5 - Раздовать по одной карти игроку пока ему требуется
        game.giveCardIfNeedToPlayer();
        // 6 - Определить победителя
        game.printWinner();


    }
}
