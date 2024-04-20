package google;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {

        int example = lengthOfLongestSubstring("Wagwan");
        System.out.println(example);

    }

    public static int lengthOfLongestSubstring(String s) {
        int end =0;
        int maxLength=0;
        int start = 0;
        List<Character> listOfNums = new ArrayList<>();
        while (end< s.length()){

            if (!listOfNums.contains(s.charAt(end))){
                listOfNums.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength,listOfNums.size());
            }
            else{

                listOfNums.remove(Character.valueOf(s.charAt(start)));
                start++;
            }


        }
        return maxLength;

    }



}
