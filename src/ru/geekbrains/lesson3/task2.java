package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2
{

    public static int FAKE_WORD_LENGTH = 25;
    public static String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args)
    {

        gameWord();
    }

    public static void gameWord()
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int index = rand.nextInt(WORDS.length);
        String hiddenWord = WORDS[index];
        System.out.println("Я загадала одно из этих слов :" + Arrays.toString(WORDS) +"\nУгадай какое!");
        do {
            System.out.println("Введите слово:");
            String playerWord = scan.nextLine();
            if(hiddenWord.equals(playerWord))
            {
                System.out.println("Поздравляю!Вы выиграли!");
                break;
            }
            if (hiddenWord != playerWord)
            {
                System.out.println("Загадано другое слово!Смотри подсказку и попробуй еще раз!");
                help(hiddenWord,playerWord);
                System.out.println();
            }
        }
        while (true);


    }

    private static void help(String hiddenWord, String playerWord)
    {
        for (int i = 0; i < FAKE_WORD_LENGTH; i++)
        {
            char chr = '#';
            if(i < hiddenWord.length() && i < playerWord.length() && hiddenWord.charAt(i) == playerWord.charAt(i))
            {
                chr = playerWord.charAt(i);
            }
            System.out.print(chr);
        }
    }

}
