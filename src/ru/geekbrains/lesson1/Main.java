package ru.geekbrains.lesson1;

public class Main {
    //задание №1
    public static void main(String[] args)
    {
        // задание №2
        byte byteTest = 2;
        short shortTest = 78;
        int intTest = 867;
        long longTest = 567000000000000L;
        float floatTest = 17.45f;
        double doubleTest = 345.567;
        char chairTest = '*';
        boolean booleanTest = true;

        //вызов метода для задания №3
        float value = calculation(0.8f, 1.2f, 8.2f, 0.5f);
        System.out.println(value);

        //вызов метода для задания №4
        boolean compareResult = isSumMore10andLess20(7,5);
        System.out.print(compareResult);

        //вызов метода для задания №5
        definingNumber(5);

        //вызов метода для задания №6
        boolean definingNumberResult =  isNumberPositiv(-9);
        System.out.print(definingNumberResult);

        //вызов метода для задания №7
        greetings("Jana");

        //вызов метода для задания №8
        int year = 2020;
        highGradeYear(year);
    }

    //метод для задания №3
    public static float calculation(float a, float b, float c, float d)
    {
        return (a * (b + (c / d)));
    }

    //метод для задания №4
    public static boolean isSumMore10andLess20(int a,int b)
    {
        int c = a + b;
        if  (c >= 10 && c <= 20)
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }

    //метод для задания №5
    public static void definingNumber(int a)
    {
        if(a >= 0)
        {
            System.out.println("\nЧисло является положительным!");
        }
        else
        {
            System.out.println("\nЧисло является отрицательным!");
        }
    }

    //метод для задания №6
    public static boolean isNumberPositiv(int a)
    {
        if(a >= 0)
        {
            return(false);
        }
        else
        {
            return(true);
        }
    }

    //метод для задания №7
    public static void greetings(String name)
    {
        System.out.println("\nПривет, " + name + "!!!");
    }

    //метод для задания №8 (это задание сделала только после разбора домашнего задания на уроке)
    public static void highGradeYear(int year)
    {
        if(year %4  == 0 && year %100 != 0)
        {
            System.out.println("Год является высокосным!");
        }
        else if (year %400 == 0)
        {
            System.out.println("Год является высокосным!");
        }

        else
        {
            System.out.println("Год не является высокосным!");

        }
    }


}
