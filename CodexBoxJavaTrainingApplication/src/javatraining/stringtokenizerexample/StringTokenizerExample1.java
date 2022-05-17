package javatraining.stringtokenizerexample;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
    public static void main(String[] args) {

        /* String s="shgdf sjgfb jhfg ";
        String[] s1=s.split(" ");
        System.out.println(s1); */
        StringTokenizer st=new StringTokenizer("i have to be a fullstack web developer"," ");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
            StringTokenizer st1 = new StringTokenizer("");
                   }

    }
}
