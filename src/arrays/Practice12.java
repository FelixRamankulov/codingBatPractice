package arrays;

public class Practice12 {


    public static void main(String[] args) {



    }
    public static int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int index = 0;

        for (int i = 0; index < count; i++) {
            if (nums[i] >=0 && nums[i] <=10 || nums[i] >=90 && nums[i] <= 100){
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;



    }

}
