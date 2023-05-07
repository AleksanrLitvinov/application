package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

import java.util.Scanner;

public class PlayerImp implements Player {
    CardBJ[] cardBJS = new CardBJImpl[52];
    private boolean inGame = true;
    // ����� ����� �� ������
    @Override
    public void takeCard(CardBJ card) {
        for (int i = 0; i < cardBJS.length; i++) {
            if (cardBJS[i] == null) {
                cardBJS[i] = card;
                break;
         }
        }
    }

    // ��������� ����� ���� �� �����
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

    // ����� �� �������������� �����
    @Override
    public boolean needCard() {
        System.out.println("--------------���� �����---------------");
        this.showCardOnHand();
        System.out.println("� ��� �� ����� ������� �����:");
        System.out.println(this.countValuesAllCardOnHand());
        System.out.println("����� �� ��� ��� �����?");
        System.out.println("���� ����� ������� ��, ���� ���, ������ ������� Enter");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("��")) {
            return true;
        }
        return false;
    }

    // ������� ����� �� �����
    @Override
    public void showCardOnHand() {
        for (CardBJ c : cardBJS) {
            if (c != null) {
                c.printCard();
            }
        }
    }

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
}
