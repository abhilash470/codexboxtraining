package javatraining.variablesanddatatypes;

import java.util.Scanner;

public class ArmstrongUsingIfCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int div;
        int rem;
        int sum=0;
        int temp;
        temp=num;
        for(int i=1;i<4;i++) {
            if (num >= 100) {
                div = num / 100;
            }
            else if(num >= 10 && num<100){
                div = num / 10;
            }
            else
                div=num;

            if(num>=100) {
                rem = num % 100;
            }
            else if(num>=10 && num<100){
                rem = num % 10;
            }
            else
                rem= num;
            num = rem;
            sum += (int) Math.pow(div, 3);
           // System.out.println(sum);
        }
        System.out.println(sum);
        if(temp == sum){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
            System.out.println("Not An Armstrong");
        }
    }
}
