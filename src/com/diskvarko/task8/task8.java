package com.diskvarko.task8;

import java.util.Random;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        ;

        System.out.print("Enter the size: ");
        int n = in.nextInt();
        Integer[][] a = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(50);
                System.out.println(a[i][j]);
            }
        }
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        Integer[][] arr = new Integer[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (a[i][j] != max) {
                    arr[i][j] = a[i][j];
                }

            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
