package google;

import java.util.LinkedList;
import java.util.List;

public class Segregate {


    public static void main(String[] args) {

        int[] arr = {1,1,1,1,0,0,0,0,0};
        LinkedList ll = new LinkedList();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0){

                ll.addFirst(arr[i]);
            } else {
                ll.addLast(arr[i]);
            }


        }
        System.out.println(ll);



    }


}
