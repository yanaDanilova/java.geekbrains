package ru.geekbrains.lesson6;

public abstract class Animals {

    private static int count;

    public static int getCount() {
        return count;
    }

    protected String name;
    protected int maxDistanceR;
    protected int maxDistanceS;
    protected float maxHeight;


    public Animals(String name, int maxDistanceR, int maxDistanceS , float maxHeight) {
        this.name = name;
        this.maxDistanceR = maxDistanceR;
        this.maxDistanceS = maxDistanceS;
        this.maxHeight = maxHeight;
        count++;
    }
    public Animals(String name, int maxDistanceR,float maxHeight){
        this(name, maxDistanceR, 0, maxHeight);
    }


    public boolean run(int distanceR) {
        return distanceR <= maxDistanceR;
    }

    public boolean jump(float height){
        return height <= maxHeight;
    }

    public boolean swim(int distanceS){
        return distanceS <= maxDistanceS;
    }


    }
