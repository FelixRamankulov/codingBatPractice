package arrays;

import java.util.Map;

public class Practice30 {


    public static void main(String[] args) {


    }

    /**
     * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
     * If both keys are present, append their 2 string values together and store the result under the key "ab".
     * <p>
     * <p>
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"}
     * mapAB({"b": "There"}) → {"b": "There"}
     */
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));

        }
        return map;
    }


    /**
     * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
     *
     *
     * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
     * topping1({}) → {"bread": "butter"}
     * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */

    public Map<String, String> topping1(Map<String, String> map) {
       map.put("bread", "butter");

       if (map.containsKey("ice cream")){
           map.put("ice cream", "cherry");
       }
       return map;
}

/**
 * Given a map of food keys and their topping values, modify and return the map as follows:
 * if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
 * If the key "spinach" has a value, change that value to "nuts".
 *
 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("yogurt")){
            map.put("yogurt",map.get("yogurt"));
        } else {
            map.put("yogurt",map.get("ice cream"));
        }

        if (map.containsKey("spinach")){
            map.put("spinach","nuts");
        }

        return map;

}







    }






