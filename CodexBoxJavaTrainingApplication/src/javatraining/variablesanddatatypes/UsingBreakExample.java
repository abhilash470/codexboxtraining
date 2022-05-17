package javatraining.variablesanddatatypes;

import java.util.Scanner;

public class UsingBreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt(), num2 = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j <= n; j++){
             if (num1 == num2) {
                System.out.println("true");
                break;
            }

        }
    }
        System.out.println("false");
}
}


