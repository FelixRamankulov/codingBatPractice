package google;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,1};
        int[] duplicates = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("The duplicate number is" + arr[i] );
                    duplicates[i] = arr[i];

                }
            }

        }
        System.out.println(Arrays.toString(duplicates));
    }
}
