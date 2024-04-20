package arrays;

public class Practice20 {


    public static void main(String[] args) {



    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 13)
                i++;
            else
                sum += nums[i];
        }
        return sum;

    }




}
