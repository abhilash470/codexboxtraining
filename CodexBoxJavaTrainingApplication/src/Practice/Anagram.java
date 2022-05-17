package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function


        if(a == null || b == null){
            if(a != null || b != null){
                return false;
            }
            return true;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String Arr_a = new String(ch1);
        String Arr_b = new String(ch2);
        return Arr_a.equals(Arr_b);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
