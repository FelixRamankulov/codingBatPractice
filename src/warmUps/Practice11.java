package warmUps;

public class Practice11 {
    public static void main(String[] args) {
        System.out.println(mixStart("miz"));

    }
    public static boolean mixStart(String str){
        if (str.length() >2 &&  str.substring(1,3).equals("ix")){
            return true;

        }
        return false;

    }
}
