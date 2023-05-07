package lesson_12.game.entities;

import lesson_12.game.interfaces.BlackJackGame;
import lesson_12.game.interfaces.DeckOfCard;
import lesson_12.game.interfaces.Player;

public class BlackJackGameImp implements BlackJackGame {

    Player [] playersInGame = new Player[3];

    DeckOfCard deckOfCard = new DeckOfCardImp();

    // Добавит игрока в игру
    @Override
    public void addPlayerInGame(Player player) {
        for (int i = 0; i < playersInGame.length; i++) {
            if (playersInGame[i] == null){
                playersInGame[i] = player;
                break;
            }
        }

    }

    @Override
    public void giveTwoCardsToEachPlayerOnStart() {
        for (Player player : playersInGame) {
           if (player != null) {
               player.takeCard(deckOfCard.getRandomCard());
               player.takeCard(deckOfCard.getRandomCard());
           }
        }
    }

    @Override
    public void giveCardIfNeedToPlayer() {
        for (Player player : playersInGame) {
            if (player != null) {
              while (player.needCard()) {
                  player.takeCard(deckOfCard.getRandomCard());
              }
            }
        }
    }

    @Override
    public void printWinner() {
        for (Player player : playersInGame) {
            if (player != null) {
                if (player.countValuesAllCardOnHand() > 21) {
                      player.setInGame(false);
                }
            }
        }
        if (countAllPlayerInGame() == 0) {
            System.out.println("Победила игра ");
        }
        if (countAllPlayerInGame() == 1) {
            System.out.println("У нас есть один победител");
            for (Player player : playersInGame) {
                if (player != null && player.isInGame()) {
                    player.showCardOnHand();
                    System.out.println("Выйграл игрок с " + player.countValuesAllCardOnHand() + " очков на руках");
                    return;
                }
            }
        }

        int bestValue = 0;
       if (countAllPlayerInGame() > 1) {
           for (Player player : playersInGame) {
               if (player != null && bestValue < player.countValuesAllCardOnHand()) {
                   bestValue = player.countValuesAllCardOnHand();
               }
           }
       }

       String nameOfWinner = "";
        for (Player player : playersInGame) {
                if (player != null && player.countValuesAllCardOnHand() == bestValue &&
                        !player.isCroupier() && !nameOfWinner.startsWith("Winner is not Croupier")){
                    System.out.println("Выйграл игрок с таким количечтвом очков");
                    player.showCardOnHand();
                    nameOfWinner = "Winner is not Croupier";
                    System.out.println(player.countValuesAllCardOnHand());
                } else  if (player != null && player.countValuesAllCardOnHand() == bestValue &&
                        player.isCroupier()){
                    System.out.println("Выйграл крупье с таким количечтвом очков");
                    player.showCardOnHand();
                    System.out.println(player.countValuesAllCardOnHand());
                }
        }

    }

    @Override
    public int countAllPlayerInGame() {
        int countOfPlayers = 0;
        for (Player player : playersInGame) {
            if (player != null && player.isInGame()) {
              countOfPlayers++;
            }
        }
        return countOfPlayers;
    }
}
