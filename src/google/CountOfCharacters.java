package google;

public class CountOfCharacters {
    public static void main(String[] args) {
        String s = "Hello Java";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("number of characters in the string is: " + count);
    }
}
