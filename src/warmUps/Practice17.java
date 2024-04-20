package warmUps;

public class Practice17 {
    public static void main(String[] args) {


        System.out.println(lastDigit(17,23313));

    }
    public static boolean lastDigit(int a , int b ){
        return (a % 10 == b % 10);
    }
}
