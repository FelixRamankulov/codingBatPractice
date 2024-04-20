package warmUps;

import java.util.Map;

public class Practice13 {
    public static void main(String[] args) {
        System.out.println(intMax(1,6,3));
    }
    public static int intMax(int a, int b, int c) {
        int max = 0;
        for (int i = 0; i <= 3; i++) {
            if (a > b && a >c){
                return a + max;
            } else if (b > a && b > c) {
                return b + max;
            } else {
                return c + max;
            }
        }
        return max;
    }
}
