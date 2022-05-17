package javaassessment;

public class SwapingNumbers {
    public static void main(String[] args) {
        int num1 = 1034123, num2 = 1234452;
        System.out.println(num1+"  "+num2);
        num1=233242;
        num2=37466;
        System.out.println(num1+" "+num2);
        System.out.println("Before swapping int values: "+"number 1 is: "+num1+" "+"number 2 is "+num2);
        int temp;
        temp= num1;
        num1=num2;
        num2 = temp;
        System.out.println("After swaping int values : number1 is: "+num1+" "+"number2 is "+num2);

        float num3 = 3341.4f, num4 = 51234.6f;
        System.out.println("Before swapping float values: "+"f number 1 is: "+num3+" "+"f number 2 is "+num4);
        float temp1;
        temp1 = num3;
        num3 = num4;
        num4 = temp1;
        System.out.println("After swaping float values : number1 is: "+num3+" "+"number2 is "+num4);

        double num5 = 345233.42, num6 = 123439.476;
        System.out.println("Before swapping double values: "+"d number 1 is: "+num5+" "+"d number 2 is "+num6);
        double temp2;
        temp2= num5;
        num5=num6;
        num6 = temp2;
        System.out.println("After swaping double values : number1 is: "+num5+" "+"number2 is "+num6);

        char ch1 = 'c', ch2 = 'g';
        System.out.println("Before swapping char values: "+"char number1 is: "+ch1+" "+"char number 2 is "+ch2);
        char temp3;
        temp3= ch1;
        ch1=ch2;
        ch2 = temp3;
        System.out.println("After swaping char values : char is: "+ch1+" "+"char2 is: "+ch2);

        byte b1 = 111, b2 = 3;
        System.out.println("Before swapping byte values: "+"byte number 1 is: "+b1+" "+"byte number 2 is "+b2);
        byte temp4;
        temp4= b1;
        b1=b2;
        b2 = temp4;
        System.out.println("After swaping byte values : num is: "+b1+" "+"num is: "+b2);

        long l1 = 1111111111, l2 = 353338333;
        System.out.println("Before swapping long values: "+"long number 1 is: "+l1+" "+"long number 2 is "+l2);
        long temp6;
        temp6= l1;
        l1 = l2;
        l2 = temp6;
        System.out.println("After swaping long values : number 1 is: "+ l1+" "+"number 2 is "+l2);

        short s1 = 12367 , s2 = 7353;
        System.out.println("Before swapping short values: "+"short number 1 is: "+s1+" "+"short number 2 is "+s2);
        short temp5;
        temp5 = s1;
        s1=s2;
        s2 = temp5;
        System.out.println("After swaping short values : number 1 is: "+s1+" "+"number 2 is "+s2);

        boolean a= true;
        boolean b= false;
        System.out.println("Before swapping boolean values: "+" value is: "+a+" "+"value2 is "+b);

        boolean temp7;
        temp7= a;
        a = b;
        b = temp7;
        System.out.println("After swaping boolean values : number 1 is: "+a+" "+"number 2 is "+b);


    }
}
