package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        int[] nums = {1,3,7,9,2};




       int[] method = twoSum(nums,11);
        System.out.println(Arrays.toString(method));



    }
    public static int[] twoSum(int[] nums, int target) {
        int[] needed = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }

            }
        }
        return new int[] {};
    }

}
