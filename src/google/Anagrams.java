package google;

import java.util.Arrays;

public class Anagrams {



    public static void main(String[] args) {


        String s1 = "keep";
        String s2 = "peek";
        System.out.println(isAnagrams("peek","keep"));








    }

    static boolean isAnagrams(String s1 , String s2){

        if (s1.length()!= s2.length()){
            return false;
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1,ch2)){
                return true;
            }
            else {
                return false;
            }


        }

    }




}
