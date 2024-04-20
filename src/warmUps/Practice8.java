package warmUps;

public class Practice8 {
    public static void main(String[] args) {

        System.out.println(hasTeen(4,4,20));

    }
    public static boolean hasTeen(int a , int b, int c ){
    if ((a < 13 || a > 19) && (b <13 || b >19 ) && (c < 13 || c > 19)){
        return false;
    }
    return true;
    }
}
