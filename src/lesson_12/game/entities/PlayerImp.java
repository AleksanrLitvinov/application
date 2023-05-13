package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

import java.util.Scanner;

public class PlayerImp implements Player {
    private String name;
    CardBJ[] cardBJS = new CardBJImpl[52];
    private boolean inGame = true;

    public PlayerImp(String name) {
        this.name = name;
    }

    public PlayerImp() {
    }

    // Взять карту из колоды
    @Override
    public void takeCard(CardBJ card) {
        for (int i = 0; i < cardBJS.length; i++) {
            if (cardBJS[i] == null) {
                cardBJS[i] = card;
                break;
         }
        }
    }

    // Посчитать сумму карт на руках
    @Override
    public int countValuesAllCardOnHand() {
        int result = 0;
        for (CardBJ c : cardBJS) {
            if(c != null) {
                result += c.getValue();
            }
        }
        return result;
    }

    // Нужна ли дополнительная карта
    @Override
    public boolean needCard() {
        System.out.println("--------------Ввши карты---------------");
        System.out.println("Игрок " + name);
        this.showCardOnHandAhdSymbol();
        System.out.println("У вас на руках столько очков:");
        System.out.println(this.countValuesAllCardOnHand());
        System.out.println("Нужно ли вам еще карта?");
        System.out.println("Если нужна введите да, если нет, просто нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    // Выводит карту на руках
    @Override
    public void showCardOnHandAhdSymbol() {
        for (CardBJ c : cardBJS) {
            if (c != null) {
                c.printCard();
                c.printSymbol();

            }
        }
    }
    //


    @Override
    public boolean isInGame() {
        return inGame;
    }

    @Override
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
