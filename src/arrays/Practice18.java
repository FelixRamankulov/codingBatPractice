package arrays;

public class Practice18 {




    public static void main(String[] args) {

    int[] nums = {10,5,6,7,9};
    int a = bigDiff(nums);
        System.out.println(a);
    }

    public static int bigDiff(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > max)
                max = nums[i];
            else if(nums[i] < min)
                min = nums[i];
        }
        return (max-min);


    }




}
