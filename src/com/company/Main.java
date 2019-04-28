package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String names [] = {"Vova", "Petya", "Dima", "Stas", "Vanya", "Sasha"};
        int ages [] = {20, 15, 36, 67, 78, 104, 50, 3, 40, 27};
        int grad [] = {-25, 38, 30, 23, 19, 13, 7, -5, -16, 40, 38, -5, 0};
        //int age =ages[new Random().nextInt(ages.length)];
        int age = new Random().nextInt(108);
        int temp = grad[new Random().nextInt(grad.length)];
        System.out.println("Hey, "+names[new Random().nextInt(names.length)]);
        System.out.println("You're "+age+" years old");
        System.out.println("Outside is "+temp+" degreese");

        if ((age > 20 && age < 45) && (temp < 30 && temp > -20)) {
            System.out.println("let's go party!!");
        }
        else if ((age<20) && (temp > 0 && temp < 28)) {
            System.out.println("Let's go outside");
        }
        else if ((age > 45) && (temp > -10 && temp < 25)) {
            System.out.println("Let's go outside");
        }
        else {
            System.out.println("let's stay at home");
        }
    }
}
