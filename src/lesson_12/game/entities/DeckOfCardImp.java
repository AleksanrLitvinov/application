package lesson_12.game.entities;

import lesson_12.game.interfaces.CardBJ;
import lesson_12.game.interfaces.DeckOfCard;

import java.util.concurrent.ThreadLocalRandom;

public class DeckOfCardImp implements DeckOfCard {

    CardBJ[] cardBJS = new CardBJImpl[52];

    public DeckOfCardImp() {
        cardBJS[0] = new CardBJImpl("Äâîéęŕ Ňđĺô", 2);
        cardBJS[1] = new CardBJImpl("Äâîéęŕ ×ĺđâč", 2);
        cardBJS[2] = new CardBJImpl("Äâîéęŕ Áóáč", 2);
        cardBJS[3] = new CardBJImpl("Äâîéęŕ Ďčęč",2);

        cardBJS[4] = new CardBJImpl("Ňđîéęŕ Ňđĺôŕ", 3);
        cardBJS[5] = new CardBJImpl("Ňđîéęŕ ×ĺđâč", 3);
        cardBJS[6] = new CardBJImpl("Ňđîéęŕ Áóáíű", 3);
        cardBJS[7] = new CardBJImpl("Ňđîéęŕ Ďčęč", 3);

        cardBJS[8] = new CardBJImpl("×ĺňâĺđęŕ Ňđĺôŕ", 4);
        cardBJS[9] = new CardBJImpl("×ĺňâĺđęŕ ×ĺđâč", 4);
        cardBJS[10] = new CardBJImpl("×ĺňâĺđęŕ Áóáíű", 4);
        cardBJS[11] = new CardBJImpl("×ĺňâĺđęŕ Ďčęč", 4);

        cardBJS[12] = new CardBJImpl("Ď˙ňĺđęŕ Ňđĺôŕ", 5);
        cardBJS[13] = new CardBJImpl("Ď˙ňĺđęŕ ×ĺđâč", 5);
        cardBJS[14] = new CardBJImpl("Ď˙ňĺđęŕ Áóáíű", 5);
        cardBJS[15] = new CardBJImpl("Ď˙ňĺđęŕ Ďčęč", 5);

        cardBJS[16] = new CardBJImpl("Řĺńňĺđęŕ Ňđĺôŕ", 6);
        cardBJS[17] = new CardBJImpl("Řĺńňĺđęŕ ×ĺđâč", 6);
        cardBJS[18] = new CardBJImpl("Řĺńňĺđęŕ Áóáíű", 6);
        cardBJS[19] = new CardBJImpl("Řĺńňĺđęŕ Ďčęč", 6);

        cardBJS[20] = new CardBJImpl("Ńĺěĺđęŕ Ňđĺôŕ", 7);
        cardBJS[21] = new CardBJImpl("Ńĺěĺđęŕ ×ĺđâč", 7);
        cardBJS[22] = new CardBJImpl("Ńĺěĺđęŕ Áóáíű", 7);
        cardBJS[23] = new CardBJImpl("Ńĺěĺđęŕ Ďčęč", 7);

        cardBJS[24] = new CardBJImpl("Âîńüěĺđęŕ Ňđĺôŕ", 8);
        cardBJS[25] = new CardBJImpl("Âîńüěĺđęŕ ×ĺđâč", 8);
        cardBJS[26] = new CardBJImpl("Âîńüěĺđęŕ Áóáíű", 8);
        cardBJS[27] = new CardBJImpl("Âîńüěĺđęŕ Ďčęč", 8);

        cardBJS[28] = new CardBJImpl("Äĺâ˙ňęŕ Ňđĺôŕ", 9);
        cardBJS[29] = new CardBJImpl("Äĺâ˙ňęŕ ×ĺđâč", 9);
        cardBJS[30] = new CardBJImpl("Äĺâ˙ňęŕ Áóáíű", 9);
        cardBJS[31] = new CardBJImpl("Äĺâ˙ňęŕ Ďčęč", 9);

        cardBJS[32] = new CardBJImpl("Äĺń˙ňęŕ Ňđĺôŕ", 10);
        cardBJS[33] = new CardBJImpl("Äĺń˙ňęŕ ×ĺđâč", 10);
        cardBJS[34] = new CardBJImpl("Äĺń˙ňęŕ Áóáíű", 10);
        cardBJS[35] = new CardBJImpl("Äĺń˙ňęŕ Ďčęč", 10);

        cardBJS[36] = new CardBJImpl("Âŕëĺň Ňđĺôŕ", 10);
        cardBJS[37] = new CardBJImpl("Âŕëĺň ×ĺđâč", 10);
        cardBJS[38] = new CardBJImpl("Âŕëĺň Áóáíű", 10);
        cardBJS[39] = new CardBJImpl("Âŕëĺň Ďčęč", 10);

        cardBJS[40] = new CardBJImpl("Äŕěŕ Ňđĺôŕ", 10);
        cardBJS[41] = new CardBJImpl("Äŕěŕ ×ĺđâč", 10);
        cardBJS[42] = new CardBJImpl("Äŕěŕ Áóáíű", 10);
        cardBJS[43] = new CardBJImpl("Äŕěŕ Ďčęč", 10);

        cardBJS[44] = new CardBJImpl("Ęîđîëü Ňđĺôŕ", 10);
        cardBJS[45] = new CardBJImpl("Ęîđîëü ×ĺđâč", 10);
        cardBJS[46] = new CardBJImpl("Ęîđîëü Áóáíű", 10);
        cardBJS[47] = new CardBJImpl("Ęîđîëü Ďčęč", 10);

        cardBJS[48] = new CardBJImpl("Ňóç Ňđĺôŕ", 11);
        cardBJS[49] = new CardBJImpl("Ňóç ×ĺđâč", 11);
        cardBJS[50] = new CardBJImpl("Ňóç Áóáíű", 11);
        cardBJS[51] = new CardBJImpl("Ňóç Ďčęč", 11);
    }

    @Override
    public CardBJ getRandomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 51);
        return cardBJS[randomIndex];
    }
}
