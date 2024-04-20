package google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateHash {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,4,6,7,7};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    set.add(arr[i]);
                }
            }

        }
        System.out.println(set);


    }








}
