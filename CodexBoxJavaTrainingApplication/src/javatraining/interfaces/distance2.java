package javatraining.interfaces;

public class distance2 extends Distance implements InterfacesExample{
    static final int NUMBER = 2000;
    distance2() {
        System.out.println(super.distance =10);
    }
    distance2(int a,int b){
        super();
    }

    void total_distance() {
        System.out.println(NUMBER * 2);
    }

    int total_distance(int a, int b) {
        int total_distance = (a + b) * 2;
        return total_distance;
    }

    float total_distance(float distance1, float r_distance) {
        float total_distance = distance1 + r_distance;
        return total_distance;
    }

    @Override
    public void totaldistance() {
        System.out.println("inheritance is implemented");
    }
}
