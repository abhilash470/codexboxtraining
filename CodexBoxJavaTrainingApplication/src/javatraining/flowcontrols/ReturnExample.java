package javatraining.flowcontrols;

import java.util.Scanner;

public class ReturnExample {
    Scanner sc=new Scanner(System.in);
    int sum() {
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ReturnExample().sum());
    }
}
