package javatraining.stringtokenizerexample;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {

    StringTokenizer st1 = new StringTokenizer("hello everyone"," ");
        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
            StringTokenizer st = new StringTokenizer("");
        }
        }
    }

