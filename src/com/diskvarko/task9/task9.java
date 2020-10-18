package com.diskvarko.task9;
// Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
import java.util.Random;
import java.util.Scanner;

public class task9 {
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
                System.out.print(a[i][j]+" ");
                }
            System.out.println("\n");

        }
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (a[i][0] > a[k][0]) {
                    for (int j = 0; j < n; j++) {
                        int temp = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = temp;
                    }
                }
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    }


