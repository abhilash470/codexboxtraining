package javatraining.arraysexamples;

import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
         //Scanner sc = new Scanner(System.in);
             //int n = sc.nextInt();
            //int arr1[] = new int[n];
            int[] arr2 = {3, 54, 2, 43, 2, 1, 543, 65};
            int[] arr3 = new int[]{4, 3, 2, 45, 76, 4, 3, 3};
            int alen= arr2.length;
            int blen = arr3.length;
            int[] result = new int[alen+blen];
            //using copy an array
           /* System.arraycopy(arr2,0,result,0,alen);
            System.arraycopy(arr3,0,result,alen,blen);
        System.out.println(Arrays.toString(result));

            */
        int position=0;
        for(int element:arr2){
            result[position] =element ;
            position++;
        }
        for(int element: arr3){
            result [position] = element;
            position++;
        }
        System.out.println(Arrays.toString(result));
    }

}