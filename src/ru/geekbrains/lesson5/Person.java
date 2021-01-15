package ru.geekbrains.lesson5;

import java.util.Arrays;

public class Person {

    private String name;
    private String position;
    private String email;
    private String mobil;
    private int age;
    private int salary;


    public Person(String name, String position, String email, String mobil, int age, int salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mobil = mobil;
        this.age = age;
        this.salary = salary;

    }

    public static void main(String[] args) {

        Person[] personArray = new Person[5];

        personArray[0] = new Person("Иванов Иван Иванович", "Программист", "ivan123@gmail.com", "+491734567856",
                33, 100000);
        personArray[1] = new Person("Артемов Артем Артемович", "Менеджер по продажам", "artem123@gmail.com", "+491734567856",
                23, 50000);
        personArray[2] = new Person("Петухов Валерий Валерьевич", "Заместитель директора", "valerii123@gmail.com", "+491734567856",
                36, 180000);
        personArray[3] = new Person("Александров Александр Александрович", "Директор", "alex123@gmail.com", "+491734567856",
                46, 280000);
        personArray[4] = new Person("Петров Петр Петрович", "Менеджер по работе с персоналом", "petr123@gmail.com", "+491734567856",
                26, 80000);

        printInfo(personArray);

    }

    private static void printInfo(Person[] personArray) {

        for (int i = 0; i < 5; i++) {
            if (personArray[i].age > 40) {
                System.out.println(personArray[i].name + " " + personArray[i].position + " " + personArray[i].email + " " + personArray[i].mobil + " " + personArray[i].age + " " + personArray[i].salary);
            }
        }

    }
}

