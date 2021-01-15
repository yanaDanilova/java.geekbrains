package ru.geekbrains.lesson6;

public class Cat extends Animals {

    private static int count;

    public static int getCount() {
        return count;
    }

    public Cat (String name, int maxDistanceR, float maxHeight) {
        super(name, maxDistanceR, maxHeight);
       count++;
    }


    public boolean swim(int distanceS){
        System.out.print("The cats can't swim! ");
        return false;

}
    }
