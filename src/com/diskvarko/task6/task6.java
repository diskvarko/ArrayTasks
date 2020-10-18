package com.diskvarko.task6;

import java.util.Arrays;
import java.util.Scanner;

// Задание. Ввести n чисел с консоли.
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину
public class task6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int a=0;
        while (a<n){
            for (int i = 0; i < n; i++) {
                int length = (int) (Math.log10(arr[a]) + 1);
               ar[i] = length ;
                // System.out.print(ar[i] + " ");
                a++;
            }
        }
        int max = ar[0];
        int min = ar[0];
        for(int i=0; i<n; i++){
            if (ar[i] > max) max = ar[i];
            if (ar[i] < min) min = ar[i];
        }
        int indexMax = Arrays.asList(ar).indexOf(max);
        int indexMin = Arrays.asList(ar).indexOf(min);

        System.out.println("Max element is: " + arr[indexMax] +" " + "The number of digits is: " + max);
        System.out.println("Min element is: " + arr[indexMin] +" " + "The number of digits is: " + min);
    }
}
