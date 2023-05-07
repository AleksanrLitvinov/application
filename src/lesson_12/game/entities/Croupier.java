package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.Player;

public class Croupier extends PlayerImp {

    @Override
    public boolean needCard() {
        if (countValuesAllCardOnHand() > 17) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isCroupier() {
        return true;
    }
}