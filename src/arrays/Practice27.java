package arrays;

public class Practice27 {
    public static void main(String[] args) {

    }
    public static boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] ==1 || nums[i] ==4 )){
                return false;
            }
        }
        return true;
    }
}
