package javaassessment;

import java.util.Scanner;

public class OperationsExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt(), num2 =sc.nextInt();
        int c=sc.nextInt();
       if(c==1){ num1 += num2;
       } else if(c==2){ num1 -= num2;}
       else if(c==3){ num1 *= num2;}
       else if(c==4){ num1 /=num2; }
       else if(c==5){ num1 %=num2;}
        switch(c){
            case 1:
                System.out.println("addition is: "+num1);
                break;
            case 2:
                System.out.println("Subtraction is: "+num1);
                break;
            case 3:
                System.out.println("Multiplication is: "+num1);
                break;
            case 4:
                System.out.println("div is: "+num1);
                break;
            case 5:
                System.out.println("modulo is: "+num1);
                break;
        }
    }
}
