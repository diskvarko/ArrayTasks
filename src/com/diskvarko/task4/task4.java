package com.diskvarko.task4;

import java.util.Scanner;

//  Ввести целые числа как аргументы командной строки,
//  подсчитать их сумму (произведение) и вывести результат на консоль.
public class task4 {
    public static void main (String [] args){
        int sum = 0;
        int comp = 0;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        sum = x+y;
        comp = x*y;
        System.out.println("SUMMARY = " +  sum);
        System.out.println("Composition = " + comp);
    }
}
