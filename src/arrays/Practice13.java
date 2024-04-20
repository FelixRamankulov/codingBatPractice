package arrays;

public class Practice13 {



    public static void main(String[] args) {



    }


    public static int matchUp(String[] a, String[] b) {
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() >0 && b[i].length() > 0 &&a[i].charAt(0) == b[i].charAt(0)){
                count++;
            }

        }
        return count;
    }



}
