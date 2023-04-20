package lesson_9.game;

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

    Scanner scanner;

    char[][] table;

    Random random;

    public TicTacToe() {
        scanner = new Scanner(System.in);
        random = new Random();
        table = new char[3][3];
    }

    public void playGame() {
        System.out.println("Game is started!");
        initTable();
        printTable();
        while (true) {
            turnHuman();
           if(checkWin('x')) {
               printTable();
               System.out.println("YOU WON");
               break;
           }

           if (isTableFull()){
               System.out.println("DRAW");
               break;
           }
           turnAI();
           printTable();
           if (checkWin('o')) {
               printTable();
               System.out.println("AI WON");
               break;
           }
        }
    }

    public void turnAI() {
        int x, y;
        do {
            x = random.nextInt(0, 3);
            y = random.nextInt(0, 3);
        } while (!isCellValid(x, y));

        table[x][y] = '0';
    }

    private boolean isTableFull() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
               if (table[x][y] == '.') return false;
            }
        }
        return true;
    }


    public void initTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = '.';
            }
        }

    }

    public void printTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void turnHuman() {
        int x, y;

        do {
            System.out.println("Enter x and y from [0...2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellValid(x, y));

        table[x][y] = 'x';

    }


    public boolean isCellValid(int x, int y) {
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            return false;
        }
            return table [x][y] == '.';
    }

    // Проверяет выйграл
    public boolean checkWin(char symbol) {


        if (table[0][0] == symbol && table[0][1] == symbol && table[0][2] == symbol) return true;
        if (table[1][0] == symbol && table[1][1] == symbol && table[1][2] == symbol) return true;
        if (table[2][0] == symbol && table[2][1] == symbol && table[2][2] == symbol) return true;


        if (table[0][0] == symbol && table[1][0] == symbol && table[2][0] == symbol) return true;
        if (table[0][1] == symbol && table[1][1] == symbol && table[2][1] == symbol) return true;
        if (table[0][2] == symbol && table[1][2] == symbol && table[2][2] == symbol) return true;

        if (table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) return true;
        if (table[0][2] == symbol && table[1][1] == symbol && table[2][0] == symbol) return true;

        return false;

    }

}
