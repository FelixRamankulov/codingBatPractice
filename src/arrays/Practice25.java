package arrays;

public class Practice25 {
    public static void main(String[] args) {

    }

    public boolean more14(int[] nums) {
        int oneCount =0;
        int fourCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] ==1){
                oneCount++;
            }
            if (nums[i] == 4){
                fourCount++;
            }
        }
        if (oneCount > fourCount) return true;
        return false;

    }
}
