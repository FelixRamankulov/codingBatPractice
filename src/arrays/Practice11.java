package arrays;

import java.util.Arrays;

public class Practice11 {



    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8};
        int [] b = copyEvens(a,4);
        System.out.println(Arrays.toString(b));


    }


    public static int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for(int i = 0; index < count; i++) {
            if(nums[i] % 2 == 0) {
                arr[index] = nums[i];
                index++;
            }
        }

        return arr;
    }



}
