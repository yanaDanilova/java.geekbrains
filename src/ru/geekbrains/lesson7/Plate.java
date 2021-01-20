package ru.geekbrains.lesson7;

public class Plate{

    private int food;

    public Plate ( int food){
        this.food = food;
    }
    public boolean decreaseFood (int appetite){
        if(this.food - appetite >= 0) {
            this.food -= appetite;
            return true;
        }
        else{
            System.out.println("The cat can't eating. There's not enough food on the plate! ");
            return false;
        }
    }

     public void addFood(){
          System.out.println(this.food += this.food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

}

