package arrays;

public class Practice9 {


    public static void main(String[] args) {




    }

    public boolean hasOne(int n) {

        String a = String.valueOf(n);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1'){
                return true;
            }
        }
        return false;
    }

}
