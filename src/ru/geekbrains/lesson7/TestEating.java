package ru.geekbrains.lesson7;

public class TestEating {

    public static void main(String[] args) {

        Cat[] catsArray =  new Cat[3];
        catsArray[0] = new Cat("Milka", 7);
        catsArray[1] = new Cat("Lucky", 12);
        catsArray[2] = new Cat("Lusy", 8);
        Plate plate = new Plate(25);

        catsArray[0].eat(plate);
        catsArray[1].eat(plate);
        catsArray[2].eat(plate);
        System.out.println(plate.toString());

        plate.addFood();

    }
}
