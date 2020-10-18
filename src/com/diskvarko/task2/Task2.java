package com.diskvarko.task2;

import java.util.Scanner;

// Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Task2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ARGUMENTS:");
        int numberOfArguments = in.nextInt();
        int [] array = new int[numberOfArguments];
        System.out.println("ENTER TNE ARGUMENTS:");
        for (int i=0; i<numberOfArguments; i++){
            array[i]=in.nextInt();
        }
        System.out.print("Original line: ");
        for (int v: array)
        System.out.print(v + " ");
        System.out.println();
        System.out.print("Reverse line: ");
        for(int i=numberOfArguments-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

}

}
