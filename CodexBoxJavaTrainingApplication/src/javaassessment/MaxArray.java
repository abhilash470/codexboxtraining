package javaassessment;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = new int[]{12,234,34,23,3,56,4};
        int max=0;
        for(int i=0;i<arr.length;i++) {
                if(max<arr[i]){
                    max=arr[i];
                }
        }
        System.out.println(max);
    }
}