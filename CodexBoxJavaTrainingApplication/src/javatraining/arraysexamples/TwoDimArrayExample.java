package javatraining.arraysexamples;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        int[][] arr = {{1, 4, 9}, {4, 2, 9}, {13, 54, 7}};
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        // System.out.println(" ");
        System.out.println("************************");
//*************************************************************************************************
        int[][][] arr1 = {{{1, 4, 2}, {4, 2, 6}}, {{3, 4, 7}, {5, 4, 7}},{{5,4,3},{1,4,5}}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    System.out.print(arr1[i][j][k] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
