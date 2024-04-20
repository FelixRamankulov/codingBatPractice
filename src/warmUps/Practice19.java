package warmUps;

public class Practice19 {
    public static void main(String[] args) {
        System.out.println(everyNth("Bambaleo",2));

    }

    public static String everyNth(String str, int n){
        String temp = " ";
        for (int i = 0; i < str.length(); i = i + n) {
         temp =  temp + str.charAt(i);
        }
        return temp;

    }
}
