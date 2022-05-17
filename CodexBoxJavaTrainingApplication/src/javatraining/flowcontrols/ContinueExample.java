package javatraining.flowcontrols;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            int mul = num1 * num2;
            while(mul == 50) {
                continue;
            }
        System.out.println(mul);
        }

    }

