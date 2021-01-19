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

        //task4
        System.out.println("Task 4");
        System.out.println("Задан двумерный массив 10х10");
        System.out.println("Результат: ");
        task4(new int[10][10]);
        System.out.println("");
        System.out.println("");

        //task5
        System.out.println("Task 5");
        System.out.println("Задан массив: [ 1, 5, -3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]");
        System.out.println("Результат: ");
        task5(new int[]{1, 5, -3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        System.out.println("");
        System.out.println("");

        //task6
        System.out.println("Task 6");
        System.out.println("Не смог решить без помощи интернета");
        System.out.println("");
        System.out.println("");

        //task7
        System.out.println("Task 7");
        System.out.println("Не смог решить без помощи интернета");
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

    public static void task4(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j==i)  array[i][j] = 1;
                else  array[i][j] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) max = array[i];
            if (array[i]<min) min = array[i];
        }
        System.out.println("Максималное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
    }


}

