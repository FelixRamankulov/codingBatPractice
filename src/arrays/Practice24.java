package arrays;

public class Practice24 {

    public static void main(String[] args) {



    }

    public boolean sum28(int[] nums) {
        int a = 8;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                b = b += nums[i];
            }
        }
        if (b == a) {
            return true;
        }
        return false;
    }
}
