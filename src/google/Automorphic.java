package google;

public class Automorphic {


    public static void main(String[] args) {



    }

    static boolean IsAutomorphic(int n ){

        int sq = n*n;

        while (n>0){
            if (n%10 != sq%10){
                return false;
            }else {
                n= n/10;
                sq = sq/10;
            }
        }
        return true;

    }






}
