package arrays;

public class Practice10 {



    public static void main(String[] args) {

        System.out.println(dividesSelf(12));



    }
    public static boolean dividesSelf(int n) {
        int digits = n;

        while (digits / 10 != 0) {
            int rightmost = digits % 10;
            if (rightmost == 0 || n % rightmost != 0) {
                return false;
            }
            digits /= 10;
        }
        if (digits == 0 || n % digits != 0) {
            return false;
        } else {
            return true;
        }

    }

}
