package ru.geekbrains.lesson6;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {

        Animals cat1 = new Cat("KittyCat",100, 2.3f);
        Animals dog1 = new Dog("LuckyDog",250, 10, 1.9f);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the distance to run! (in meters)");
        int howLongToRun = scanner.nextInt();

        System.out.println(cat1.name + " " + cat1.run(howLongToRun));
        System.out.println(dog1.name + " " + dog1.run(howLongToRun));


        System.out.println("Enter the length of the distance to swim! (in meters)");
        int howLongToSwim = scanner.nextInt();

        System.out.println(cat1.name + " " + cat1.swim(howLongToSwim));
        System.out.println(dog1.name + " " + dog1.swim(howLongToSwim));


        System.out.println("Enter the height of the jump! (in meters)");
        float howHeightToJump = scanner.nextFloat();

        System.out.println(cat1.name + " " + cat1.jump(howHeightToJump));
        System.out.println(dog1.name + " " + dog1.jump(howHeightToJump));

        System.out.println("Cats : " + Cat.getCount());
        System.out.println("Dogs : " + Dog.getCount());
        System.out.println("Animals : " + Animals.getCount());
    }
}

