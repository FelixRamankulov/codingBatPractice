package arrays;

public class Practice6 {
    public static void main(String[] args) {
        String[] nums = {"ad","asd","dsa","a","aa","asd","asd"};
        int result = wordsCount(nums,3);
        System.out.println(result);

    }



    public static int wordsCount(String[] words, int len) {
        int count =0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len){
                count++;
            }
        }
        return count;
    }
}
