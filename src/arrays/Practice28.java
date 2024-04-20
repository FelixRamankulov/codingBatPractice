package arrays;

public class Practice28 {


    public static void main(String[] args) {



    }

    public static int singleNumber(int[] nums) {

       int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
            
        }
        return result;

    }




}
