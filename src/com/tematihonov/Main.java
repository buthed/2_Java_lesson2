package com.tematihonov;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Task 1");
        System.out.println("Задан массив: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]");
        System.out.print("Результат: ");
        task1(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        System.out.println("");
        System.out.println("");

        //task2
        System.out.println("Task 2");
        System.out.println("Задан пустой массив размером 8");
        System.out.print("Результат: ");
        task2(new int[8]);
        System.out.println("");
        System.out.println("");

        //task3
        System.out.println("Task 3");
        System.out.println("Задан массив: [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");
        System.out.print("Результат: ");
        task3(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("");
        System.out.println("");

    }


    public static void task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 0;
                    break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void task2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i*3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
        if (array[i]<6) {
            array[i] = array[i]*6;
        }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

