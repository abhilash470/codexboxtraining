package javatraining.arraysexamples;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int temp;
        temp=arr[0];
        arr[1]=arr[2];
        arr[2]=temp;
        System.out.println(arr[1]);
    }


}
