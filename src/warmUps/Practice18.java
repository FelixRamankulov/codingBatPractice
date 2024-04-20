package warmUps;

public class Practice18 {
    public static void main(String[] args) {
        System.out.println(endUp("hiqweij"));

        int a = 717;
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (i == '7'){
                count++;
            }

        }
        System.out.println(count);


    }
    public static String endUp(String str){
    if (str.length() <= 3) return str.toUpperCase();
  int cut = str.length() - 3;
  String front = str.substring(0, cut);
  String back  = str.substring(cut);  // this takes from cut to the end

  return front + back.toUpperCase();
}


    public static boolean scoresIncreasing(int[] scores) {

        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] == 100 && scores[i + 1] ==100){
                return true;
            }
        }
        return false;

    }
}
