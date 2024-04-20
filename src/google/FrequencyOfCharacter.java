package google;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {


    public static void main(String[] args) {

        String str = "Football";
        int a = 12;
        String b = String.valueOf(a);
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for (char ch : str.toCharArray()){
            if (map.get(ch) == null){
                map.put(ch,1);
            } else {
                map.put(ch,map.get(ch)+1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println("Char  |  Frequency");
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }


    }


}
