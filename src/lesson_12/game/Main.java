package lesson_12.game;

import lesson_12.game.entities.BlackJackGameImp;
import lesson_12.game.entities.Croupier;
import lesson_12.game.entities.DeckOfCardImp;
import lesson_12.game.entities.PlayerImp;
import lesson_12.game.interfaces.BlackJackGame;
import lesson_12.game.interfaces.DeckOfCard;
import lesson_12.game.interfaces.Player;

public class Main {

    public static void main(String[] args) {
//        DeckOfCard deckOfCard = new DeckOfCardImp();
//        deckOfCard.getRandomCard().printCard();
//
//        PlayerImp player1 = new PlayerImp();
//
//        player1.takeCard(deckOfCard.getRandomCard());
//        player1.takeCard(deckOfCard.getRandomCard());
//        player1.takeCard(deckOfCard.getRandomCard());
//
//        System.out.println(player1.countValuesAllCardOnHand());
//        player1.showCardOnHand();
//
        // 1 - ������� ����
        BlackJackGame game = new BlackJackGameImp();
        // 2 - ��������� �������
        Player player1 = new PlayerImp();
        Player player2 = new PlayerImp();
        // 3 - ������� ������
        Croupier croupier = new Croupier();
        // 4 - ������� ������ � ������ � ����
        game.addPlayerInGame(player1);
        game.addPlayerInGame(player2);
        game.addPlayerInGame(croupier);
        // 5 - ��������� �� ��� ����� ������� ������
        game.giveTwoCardsToEachPlayerOnStart();
        // 6 - ��������� �� ����� ����� ������ ���� ��� ���������
        game.giveCardIfNeedToPlayer();
        // 7 - ���������� ����������
        game.printWinner();
    }
}
