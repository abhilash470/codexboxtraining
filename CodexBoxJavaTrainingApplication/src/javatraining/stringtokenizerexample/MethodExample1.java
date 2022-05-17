package javatraining.stringtokenizerexample;

import java.util.Scanner;

public class MethodExample1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        MethodExample1 sub=new MethodExample1();
        System.out.println( sub.token(" "," "));
        MethodExample1 sum = new MethodExample1();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum is"+" "+sum.var(a,b));

    }
    public String token(String s,String s1){
        s="I have to become fullstack web developer";
        s1="make practice";
        return s+s1;
    }
    private int var(int a,int b){
        int c= a+b;
        return c;
    }

}
