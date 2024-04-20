package arrays;

import java.sql.Array;

public class Practice1 {

    public static void main(String[] args) {
        int[] ab = {6,2,3,4};
        boolean ac = firstLast6(ab);
        System.out.println(ac);
    }
    public static boolean firstLast6(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] !=6 && nums[nums.length-1] != 6){
                return false;
            }
        }
        return true;

        }
}
