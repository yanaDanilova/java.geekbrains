package ru.geekbrains.lesson7;

public class Cat {

    private final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }


    public void eat(Plate plate){
        System.out.println(this.name +" goes to eat...");
        satiety = plate.decreaseFood(getAppetite());
        System.out.println("Is " + this.name + " full now? " +  satiety);
    }


}

