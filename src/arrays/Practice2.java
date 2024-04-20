package arrays;

public class Practice2 {
    public static void main(String[] args) {
        String a = "Horse";
        System.out.println(a.substring(1));

        System.out.println(withoutEnd2("Cbd"));
    }

    public String comboString(String a, String b) {
        return "sd";
    }

    public static String left2(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(2, str.length());

        }
        return str;
    }
    public static String withoutEnd2(String str){
        if(str.length() >= 3){
            return str.substring(1,str.length()-1);
        } else return "";
    }
    public String middleTwo(String str) {
        return "sd";
    }

}
