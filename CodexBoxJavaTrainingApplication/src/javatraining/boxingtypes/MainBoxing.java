package javatraining.boxingtypes;

import sun.awt.SunHints;

public class MainBoxing {
    public static void main(String[] args) {
        Boxing b = new Boxing();
        System.out.println("method values is: "+b.box(37));
        // wrapper class variable printing
        System.out.println(b.n);
        // GETTING VARIABLE WHICH IS INITIALIZED IN INTERFACE
        Integer getR1 = boxingInterface.getR;
        System.out.println(getR1);

        //BOXING
        Integer integerValue = new Integer(b.num1);
        System.out.println("boxing value of int is: "+integerValue);
        Short shortValue = new Short(b.s);
        System.out.println("boxing value is: "+shortValue);
        Long longValue = new Long(b.l);
        System.out.println("long value is: "+longValue);
        Byte byte_value = new Byte(b.by);
      // Float f1 = new Float(b.f);
       // Double d1 = new Double(b.d);

        Boxing b2 = new Boxing(2);
        System.out.println("constructed value for num2 is: "+ b2);
        int value = 2;
        Integer i = new Integer( value);
        System.out.println("autoboxing is: "+i);
        //Integer i2 = new Integer(3);
        Integer i2 = 3;
        int i3 = i2;
        System.out.println("unboxing is: "+ i3);
    }
}
