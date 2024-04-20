package arrays;

public class Practice5 {




    public static void main(String[] args) {


        int[] nums = {1,1,1,2,2,2};
//        System.out.println(nums.length/2);
        System.out.println(scoresAverage(nums));






    }


    public static int scoresAverage(int[] scores) {
        int first = average(scores,0,scores.length/2);
        int second = average(scores,scores.length/2,scores.length);
        return Math.max(first,second);
    }



    static int average(int[] scores,int start,int end){

        int sum = 0;

        for (int i = start; i <end ; i++) {
            sum += scores[i];
        }
        return sum / (end - start);


    }


}
