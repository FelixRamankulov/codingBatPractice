package arrays;

public class Practice3 {
    public static void main(String[] args) {
        String name = "Feliks";
        System.out.println(name.substring(0,2));
        int[] num = {2,3,45,4};
        System.out.println(num.length);
        System.out.println(altPairs("notebookasdasd"));
        System.out.println(stringYak("yakpak"));


        for (int i = 0; i < name.length(); i++) {

        }
       String asda =  stringX("adaxxgqfaxxsdadxxaad");
        System.out.println(asda);

        String n = "1233";
        int a = Integer.parseInt(n);
        System.out.println(a);

//        System.out.println(hasBad("xba"));
//        System.out.println(stringBits("Hello"));

    }
//    public static boolean hasBad(String str){
//
//        if( str.length() >3 && str.startsWith("bad") || str.substring(1,4).equals("bad")){
//            return true;
//        }else return false;
//    }
    public String alarmClock(int day, boolean vacation) {
        if(!vacation && day >= 1 || day <6 ){
            return "7:00";
        } else if (!vacation && day >=1 || day < 6 ){
            return "10:00";
        } else return "off";
    }
    public static int arrayCount9(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9){
                sum++;
            }
        }
        return sum;
    }
    public static int stringMatch(String a, String b) {
        int count = 0;
        for(int i = 0 ; i < a.length()-2; i++){
            String aL = a.substring(i,i+2);
            String bL = b.substring(i,i+2);
            if(aL.equals(bL)){
                return count++;
            }

        }
        return count;


    }
    public static String stringX(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i <str.length()-1 && str.charAt(i)=='x')){
                temp += str.charAt(i);
            }

        }
        return temp;

    }
    public static String altPairs(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i += 4) {
            temp += str.charAt(i);
            if (i + 1 < str.length()) {
                temp += str.charAt(i + 1);
            }
        }
        return temp;
    }
    public static String stringYak(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if (str.contains("yak")) {
             return  str.replace("yak","");
            }
        }
        return str;
    }
    public static int array667(int[] nums) {
    int counter =0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 6 && nums[i + 2] == 6) {
                counter++;
            } else {
                if (nums[i] == 6 && nums[i + 2] == 7) {
                    counter++;
                }
            }
        }
        return counter;
    }
    public static boolean noTriples(int[] nums) {
        if(nums.length <= 3){
            return true;
        }
        for (int i = 0; i < nums.length-2; i++) {
           if (nums[i] == nums[i +1]&& nums[i +1]==nums[i+2]){
               return false;
           }

        }
        return true;
    }
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i+1]==nums[i]+5&&nums[i+2]==nums[i]-1||nums[i +2]==nums[i]-2){
                return true;
            }
        }
        return false;
    }
    public static boolean sameFirstLast(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums.length >1 && nums[0] == nums[nums.length-1]){
                return true;
            }
        }
        return false;
    }
    public static int[] makePi() {
         int[] arr = {3,1,4};
         return arr;
    }
    public static boolean commonEnd(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i]==b[i] || a[a.length-1] == b[b.length-1]){
                return true;
            }
        }
        return false;
    }
    public int sum3(int[] nums) {
        int asd =0;
        for (int i = 0; i < nums.length; i++) {
            return asd += nums[i];

        }
        return asd;
    }
//    public static int[] rotateLeft3(int[] nums) {
//
//    }
//    public static boolean array123(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//
//
//        }
//    }
    
    
//    public static String stringBits(String str) {
//        for(int i = 0; i < str.length();i++){
//            return str.charAt(str.length())
//        }
//        return str;
//
//    }

}
