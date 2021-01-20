package ru.geekbrains.lesson6;

public class Dog extends Animals {

    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog (String name, int maxDistanceR, int maxDistanceS, float maxHeight) {
        super(name,maxDistanceR, maxDistanceS, maxHeight);
    count++;
    }



}
