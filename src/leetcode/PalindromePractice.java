package leetcode;

public class PalindromePractice {
    public static void main(String[] args) {

    }
    static boolean isPalindromeCheck(int x){
        int temp = x;
        int rev = 0;
        while (x>0){
            int digit = x%10;
            rev = (rev *10)+digit;
            x = x/10;
        }
        if (rev==temp){
            return true;
        }else return false;


    }
}
