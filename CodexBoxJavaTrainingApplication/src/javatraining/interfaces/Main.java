package javatraining.interfaces;

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.total_distance();
        System.out.println( d1.total_distance(2,3));
        System.out.println(d1.total_distance(22.5f,43.5f));
        distance2 d2 = new distance2();
        d2.total_distance();
        d2.total_distance(3,4);
        d2.total_distance(87.4f,76.3f);
        InterfacesExample d3 = new distance2();
        d3.totaldistance();

        }
    }

