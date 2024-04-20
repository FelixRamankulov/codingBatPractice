package arrays;

import java.util.ArrayList;
import java.util.List;

public class Practice8 {



    public static void main(String[] args) {


    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len){
                strings.add(words[i]);
            }
        }
        return strings;
    }

}
