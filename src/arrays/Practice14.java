package arrays;

public class Practice14 {



    public static void main(String[] args) {




    }

    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for(int i = 0; i < key.length; i++) {
            if(key[i].charAt(0) == answers[i].charAt(0)) {
                score += 4;
            } else if(answers[i].charAt(0) != '?') {
                score -= 1;
            }
        }

        return score;
    }





}
