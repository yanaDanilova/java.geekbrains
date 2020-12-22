package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class task1 {


    public static void main(String[] args) {
        game();

    }

    static void game() {

        Random rand = new Random();
        int randomNumber = rand.nextInt(10);

        Scanner scan = new Scanner(System.in);

        int numberOfAttempts = 0;
        while (numberOfAttempts < 3) {

            System.out.println("Угадайте число от 0 до 9!");
            int trying = scan.nextInt();

            if (trying > randomNumber) {
                System.out.println("Ваше число больше чем загаданное");
            } else if (trying < randomNumber) {
                System.out.println("Ваше число меньше чем загаданное");
            } else {
                System.out.println("Поздравляю! Вы угадали!");
                break;
            }
            numberOfAttempts++;

            if (numberOfAttempts == 3) {
                System.out.println("Количество попыток закончилось! Вы проиграли!");
                break;
            }
        }

        System.out.println("Повторить игру? Если да - 1, нет - 0");
        int repeatGame = scan.nextInt();

        if (repeatGame == 0) {
            System.out.println("Игра закончена! Спасибо за участие!");
        } else {
            game();
        }

    }

}

































