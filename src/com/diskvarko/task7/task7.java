package com.diskvarko.task7;

import java.util.Arrays;
import java.util.Scanner;

// 3.Вывести на консоль те числа, длина которых меньше (больше)
// средней длины по всем числам, а также длину.
public class task7 {
    public  static void main (String args[]){
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
        int sum = 0;
        for (int k: ar){
            sum+=k;
        }
        double middle = sum / n;
        for (int k:ar){
            if(k < middle){
                int index = Arrays.asList(ar).indexOf(k);
                System.out.println(arr[index] +" " + "The length is: " + k);
            }
        }
    }

}
