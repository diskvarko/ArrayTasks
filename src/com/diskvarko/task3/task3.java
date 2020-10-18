package com.diskvarko.task3;

import java.util.Random;
import java.util.Scanner;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class task3 {
    
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int number = in.nextInt();
        int array[] = new int[number];
        for (int i=0; i< number; i++){
            array[i] = random.nextInt();
    }
        for (int a: array) System.out.println(a);
        System.out.println("      ");
        for (int a: array) System.out.print(a + " ");

        }

   }