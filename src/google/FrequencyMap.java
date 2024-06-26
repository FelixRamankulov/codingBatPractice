package google;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,7,7,1,4,4,7,7};


        Map<Integer,Integer> mapa = new HashMap<>();
        mapa.put(1,1);
        mapa.put(2,2);
        mapa.put(3,2);
        mapa.put(4,3);
        mapa.put(5,6);
        mapa.put(6,5);
        mapa.put(7,1);
        mapa.put(8,2);
        mapa.put(9,8);
        mapa.put(10,6);
        System.out.println(mapa.keySet());
        System.out.println(mapa.get(10));
        System.out.println(mapa.containsKey(7));


        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else {
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry entry : hm.entrySet()){
            System.out.println("ELement  |  Frequency");
            System.out.println(entry.getKey() + "          " + entry.getValue());
        }
    }
}
