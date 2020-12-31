package ru.geekbrains.lesson4;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static final int SIZE = 5;
    public static final int DOT_WIN = 4;
    public static final char map[][] = new char[SIZE][SIZE];

    public static char DOT_EMPTY = '•';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        initialMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isGameEnd(DOT_X)) {
                break;
            }

            compTurn();
            printMap();
            if (isGameEnd(DOT_O)){
                break;
            }
        }

    }

    private static boolean isGameEnd (char symbol) {
        if(isSymbolWin(symbol))
        {
            System.out.println(symbol ==DOT_X ? "Человек победил!" : "Компьютер победил!");
            return true;
        }
        if(isMapFull())
        {
            System.out.println("Ничья!");
            return true;
        }
        return false;

    }

    private static boolean isMapFull()
    {
        for (char[] row : map) {
            for (char cellValue : row) {
                if( cellValue == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSymbolWin (char symbol) {

     if (checkRowAndCol(symbol)){
         return true;
     }
     return (checkDiagonal(symbol));

    }

    private static boolean checkDiagonal(char symbol) {
        int diagonalCounter = 0;
        int sideDiagonalCounter = 0;
        for (int i = 0; i < map.length; i++) {
            diagonalCounter = (map[i][i] == symbol) ? diagonalCounter + 1 : 0;
            sideDiagonalCounter = (map[i][map.length - 1 - i] == symbol) ? sideDiagonalCounter + 1 : 0;
            if (diagonalCounter == DOT_WIN || sideDiagonalCounter == DOT_WIN) {
                return true;
            }
        }
        return false;
    }


    private static boolean checkRowAndCol(char symbol){
            for (int i = 0; i < map.length; i++) {
                int rowCounter = 0;
                int colcounter = 0;
                for (int j = 0; j < map.length; j++) {
                    rowCounter = (map[i][j] == symbol) ? rowCounter + 1 : 0;
                    colcounter = (map[j][i] == symbol) ? colcounter + 1 : 0;
                    if (rowCounter == DOT_WIN || colcounter == DOT_WIN) {
                        return true;
                    }
                }
            }
            return false;
        }


    private static void humanTurn()
    {
        int rowIndex;
        int colIndex;

        do {
            System.out.println("Введите номер строки: ");
            rowIndex = SCANNER.nextInt() - 1;
            System.out.println("Введите номер стобца: ");
            colIndex = SCANNER.nextInt() - 1;
        }
        while (!isCellValid(rowIndex, colIndex, DOT_X));

        map[rowIndex][colIndex] = DOT_X;

    }
    private static void compTurn()
    {
        int rowIndex ;
        int colIndex ;
        Random rand = new Random();

        do {
            rowIndex = rand.nextInt(SIZE);
            colIndex = rand.nextInt(SIZE);
        }
        while (!isCellValid(rowIndex, colIndex, DOT_O));

        map[rowIndex][colIndex] = DOT_O ;

    }



    private static boolean isCellValid(int rowIndex, int colIndex, char symbol)
    {
        if(!isArrayIndexValid(rowIndex) || !isArrayIndexValid(colIndex))
        {
            System.out.println("Вы ввели неправильное значение! Введите число от 1 до " + SIZE);
            return false;
        }

        if(map[rowIndex][colIndex] != DOT_EMPTY)
        {
            if(symbol == DOT_X)
            {
                System.out.println("Это место занято.Попробуйте еще! ");
            }
            return false;
        }
        return true;
    }


    private static boolean isArrayIndexValid(int index)
    {
        return index >= 0 && index <= SIZE;
    }


    private static void printMap()
    {

        printHead();
        printBodyGame();
    }

    private static void printBodyGame() {
        for (int i= 0; i < SIZE; i++)
        {
            System.out.print((i + 1) + " " );
            for (int j = 0; j < SIZE; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printHead() {
        System.out.println();
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initialMap()
    {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++)
        {
            for (int colIndex = 0; colIndex < SIZE; colIndex++)
            {
                map[rowIndex][colIndex] = DOT_EMPTY;
            }
        }
    }
}
