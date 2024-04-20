package warmUps;

public class Practice7 {
    public static void main(String[] args) {
        in1020(11,22);
        System.out.println(in1020(12,99));

    }
    public static boolean in1020(int a , int b ){
        if ((a < 10 || a > 20) && (b < 10 || b >20)){
            return false;
        }
        return true;
    }
}
