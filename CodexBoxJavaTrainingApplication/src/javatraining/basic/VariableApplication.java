package javatraining.basic;

public class VariableApplication {
    static String v3="static variable ";
    public int value1= 30;

    public static void main(String args[]){
        //instance variable
        VariableApplication v2=new VariableApplication();
        System.out.println(v2.value1);
        //local variable
        int value=19;
        System.out.println(value);
        System.out.println(value*v2.value1);
        //static variable printing
        System.out.println(v3);

    }

}
