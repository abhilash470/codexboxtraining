package javatraining.interfaces;

public class Distance{
    int distance =10;
    static final int NUMBER = 2000;
    void total_distance(){
        System.out.println(NUMBER*2);
    }
    int total_distance(int a,int b){
        int total_distance1 =(a+b)*2;
        return total_distance1;
    }
    float total_distance(float distance1,float r_distance){
        float total_distance2 = distance1 + r_distance;
        return total_distance2;
    }
}
