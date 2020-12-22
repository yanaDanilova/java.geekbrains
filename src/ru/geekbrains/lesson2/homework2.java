package ru.geekbrains.lesson2;

import java.util.Arrays;

public class homework2 {

    public static void main(String[] args) {
        //вызов метода для вычисления суммы массива
         sum();

       //вызов метода для задания №1
        arrChange0To1();
        //вызов метода для задания №2 с помощью цикла for
        fillArr();
        //вызов метода для задания №2 с помощью цикла do while
        fillArrVariant2();
        //вызов метода для задания №3
        arrMultiplyBy6();
        //вызов метода для задания №4
        arrFillDiagonal();
        //вызов метода для задания №5
        arrMinMax();
        //вызов метода для задания №5(улучшенный)
        arrayMinToMax();
        //вызов метода копирования массива в массив
        copyArray();
        //вызов метода для задания №6


    }


        //метод для задания №1
        public static void arrChange0To1() {
            int arr1[] = {0, 1, 1, 0, 0, 1};

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == 0) {
                    System.out.println(arr1[i] = 1);
                } else {
                    System.out.println(arr1[i] = 0);
                }
            }

        }
        //метод для задания №2  c помощью цикла do while
        public static void fillArr()
        {
            int[] arr2 = new int[8];
            int i = 0;
            int k = 0;
            do
            {
                System.out.println(arr2[i]= k);
                i++;
                k+=3;
            }
            while(i < arr2.length);

        }
        //метод для задания №2 c помощью цикла for
        public static void fillArrVariant2()
        {
            int[] arr2 = new int[8];
            int j = 0;

            for(int i = 0; i < arr2.length;i++)
            {
                System.out.println(arr2[i]=j);
                j+=3;
            }
        }

        //метод для задания №3
        public static void arrMultiplyBy6()
        {
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < arr3.length; i++)
            {
                if (arr3[i] < 6)
                {
                    arr3[i] = arr3[i] * 2;
                }

            }
            System.out.println(Arrays.toString(arr3));
        }

    //метод для задания №4
    public static void arrFillDiagonal()
    {
        int[][] biArr = new int[4][4];

        for(int i = 0; i < biArr.length; i++)
        {

            biArr[i][i] = 1;
            biArr[i][biArr.length -1 -i] =1;


        }
        System.out.println(Arrays.deepToString(biArr));

    }
//метод для задания №5
    public static void arrMinMax()
    {
        int[] arr3 = {3,10,2,17,45,1};
        int k = arr3[0];
        int max = 0;
        int min = 0;

       for(int i = 1; i < arr3.length;i++)
       {
           if(arr3[i] > k)
           {
              max = arr3[i];
           }
           else
           {
               min = arr3[i];
           }
           k = arr3[i];
       }
       System.out.println("Самое большое значение: " + max + " " + "Самое маленькое значение: " + min);

    }

    static void arrayMinToMax()
    {
    int array [] = new int[] {3, 5,67,1,58};

    int min = array[0];
    int max = array[0];

        for(int i = 0; i < array.length; i++)
    {
        if (min > array[i])
        {
            min = array[i];
        }
        else if (max < array[i])
        {
            max = array[i];
        }

    }
        System.out.println (min);
        System.out.println (max);
}
   static void copyArray()
   {
    int[] array = {3,6,79};

    int copyArray[] = Arrays.copyOf(array,array.length);

       System.out.println(Arrays.toString(copyArray));

      /* или через обычный цикл

       for(int i = 0; i < copyArray.length; i++)
    {
        copyArray[i] = array[i];

    }
        System.out.println(Arrays.toString(copyArray));

*/
}

// метод для задание №6

    static void sum() {
        int[] arr0 = {2, 3, 1, 3, 3};
        int sum = 0;

        for (int value : arr0) {
            sum += value;

        }
        System.out.println(sum);
    }
}
