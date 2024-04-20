package google;
import java.util.HashMap;
import java.util.Map;

public class Practice5 {

    public static void main(String[] args) {
        String str = "Tombstone";
        HashMap<Character,Integer> map = new HashMap<>();
        str = str.toLowerCase();
        for (char ch : str.toCharArray()){
            if (map.get(ch) == null){
                map.put(ch,1);
            }
            else {
                map.put(ch,map.get(ch) +1);
            }
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + "   "  + entry.getValue());
        }


    }


}
