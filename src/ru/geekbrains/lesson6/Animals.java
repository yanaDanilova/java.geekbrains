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
        this.name = name;
        this.maxDistanceR = maxDistanceR;
        this.maxHeight = maxHeight;
        count++;
    }


    public boolean run(int distanceR) {
        if (distanceR <= maxDistanceR) return true;
        return false;
    }

    public boolean jump(float height){
        if(height <= maxHeight) return true;
        return false;
    }

    public boolean swim(int distanceS){
        if(distanceS <= maxDistanceS) return true;
        return false;
    }


    }
