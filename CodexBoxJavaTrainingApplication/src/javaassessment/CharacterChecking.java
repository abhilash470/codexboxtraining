package javaassessment;

import java.util.Scanner;

public class CharacterChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch=='A'|| ch== 'e'|| ch=='E' || ch== 'i' || ch == 'I' || ch=='o' || ch=='O'|| ch == 'u'|| ch=='U'){
            System.out.println(ch+" is a vowel ");
        }else{
            System.out.println(ch+" is a consonant");}
       /* switch(ch){
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
                switch(ch){
            case 'A':
                System.out.println("a is vowel");
                break;
            case 'E':
                System.out.println("e is vowel");
                break;
            case 'I':
                System.out.println("i is vowel");
                break;
            case 'O':
                System.out.println("o is vowel");
                break;
            case 'U':
                System.out.println("u is vowel");
                break;

            default:
                System.out.println(ch+ " is consonant");
                break;


        } */
    }
}
