package google;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {34,67,89,32,9,45};
        int smallestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallestNum){
                smallestNum = arr[i];
            }
        }
        System.out.println(smallestNum);
    }
}
