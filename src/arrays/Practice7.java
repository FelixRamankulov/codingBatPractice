package arrays;

import java.util.Arrays;

public class Practice7 {



    public static void main(String[] args) {

        String[] str = {"a","b","c","d"};
        String[] words = wordsFront(str,2);
        System.out.println(Arrays.toString(words));

    }

    public static String[] wordsFront(String[] words, int n) {

        String[]  arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = words[i];
        }
        return arr;





    }


}
