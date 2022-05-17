package javatraining.variablesanddatatypes;

public class OperatorApplication {
    public static void main(String[] args) {
        int sum=0;
        byte value1 = 20 , value2 = 34;
        short value3 = 7564 , value4 =3485;
        int value5 = 24564534 , value6 = 123455754;
        long value7 = 374563746 , value8 = 238474587 ;
        float num1 = 20.345f , num2 = 877.345f;
        char ch1 = 'j' , ch2 = 'a';
        boolean bv1 = true;
        boolean bv2 = false;
        double num3 = 2003435.3457, num4 = 28756.23545;
        double value = num1+num2+num3+num4;
        // Arithmetic operators
        System.out.println(value);
        System.out.println(value-num3);
        System.out.println(num1*num2);
        System.out.println("divison is"+" "+(value5 / value6));
        System.out.println("modulo"+" "+(value2 % value1));
        // Unary operator
        value = -value;
        System.out.println(value);
        System.out.println(value == -value);

        //Ternary operator
        int result = (value1>value2)?(value1+value2) : (value1-value2);
        System.out.println(result);
        // Assignment operator
        num1 +=num2; // num1 =num1+num2
        System.out.println(num1);
        value1 -= value2;
        System.out.println(value1);
        value3 *= value4;
        System.out.println(value3);
       int num7 = 44 , num8 = 87;
        System.out.println(num7);
       num7 *=num8;
        System.out.println(num7);
        num7 /= 2;
        System.out.println(num7);
        num7 %=2;
        System.out.println(num7);
        //logical operator
        System.out.println("logical operator");
        if(num7/2 ==0 && num8/2==0){
            System.out.println(true);
        }
        else
            System.out.println(false);
        if(num8/2 ==0 || num7/2==0){
            System.out.println(true);
        }
        else
            System.out.println(false);
        // relational operator
        System.out.println("example for relational oparator" );
        if(num7 == num8){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(num1 == 0){
            System.out.println(num1);
        }
        else
            System.out.println("may equal to zero " );
        if(num8 > 0){
            System.out.println("true");
        }
        if(num8 <0){
            System.out.println("true");
        }
        if(num8 >= 9){
            System.out.println("true");
        }
        if(num8 <=7){
            System.out.println("true");
        }



    }
}
