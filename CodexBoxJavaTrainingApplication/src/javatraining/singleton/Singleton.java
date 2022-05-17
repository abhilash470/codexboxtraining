package javatraining.singleton;


public class Singleton {
    private static Singleton singleton_number;
    private String s;

    private Singleton() {
        s = "Singleton is mechanism";
    }

    public static Singleton getInstance() {
        if(singleton_number == null){
          singleton_number = new Singleton();
        }
        return singleton_number;
    }
    public static void main(String[] args) {
        Singleton sin1 = new Singleton();
        Singleton sin2 = new Singleton();
        Singleton sin3 = new Singleton();
        System.out.println(sin1.getInstance());
        System.out.println(sin2.getInstance());
        System.out.println(sin3.getInstance());
        if(sin1 == sin2 ){
            System.out.println();
        }


    }
}
