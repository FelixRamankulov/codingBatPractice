package warmUps;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println(front3("Table"));
    }
    public static String front3(String str){
        String a = str.substring(0,3);
        for (int i = 0; i < 4; i++) {
            a+=a;

        }
        return a;
    }
}
