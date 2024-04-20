package warmUps;

public class Practice10 {
    public static void main(String[] args) {

    }
    public static  String delDel(String str){
       if(str.length()>4 && str.substring(1,4).equals("del")){
           return str.substring(0,1) + str.substring(4);

       }
       return str;
    }
}
