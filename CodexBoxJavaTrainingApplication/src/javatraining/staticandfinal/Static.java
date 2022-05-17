package javatraining.staticandfinal;

public class Static {
    // static can be used for methods, variable, blocks.
    // static block
    static {
        int c = 10;
        c++;
        int d = 11;
        int mul = c*d;
        System.out.println("static block will execute first.before main method only.");
        System.out.println(mul);
    }
    // static variable
    static int num = 20;
    // static method
     static void number () {
         int a = 20;
         int b = 21;
         int sum = a+b;
         System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println(num);
        number();
        //System.out.println(c);
    }
}
