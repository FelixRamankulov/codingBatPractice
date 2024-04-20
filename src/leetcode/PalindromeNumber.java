package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {


        int a = 1213;
        String b = String.valueOf(a);
        int start = 0;
        int end = b.length()-1;
        while (end > start){
            if (b.charAt(start) != b.charAt(end)){
                System.out.println("It is not a palindrome");
                System.exit(0);
            }
            start++;
            end--;

        }
        System.out.println("It is a palindrome");

    }
}
