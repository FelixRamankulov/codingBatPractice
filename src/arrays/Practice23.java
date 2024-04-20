package arrays;

public class Practice23 {
    public static void main(String[] args) {

    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] ==1 || nums[i] ==3)){
                return true;
            }

        }
        return false;

    }


}
