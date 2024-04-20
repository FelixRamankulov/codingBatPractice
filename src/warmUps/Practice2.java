package warmUps;

public class Practice2 {
    public static void main(String[] args) {
        /**
         * Given a string, take the last char and return
         * a new string with the last char added at the front and back,
         * so "cat" yields "tcatt". The original string will be length 1 or more.
         *
         *
         * backAround("cat") → "tcatt"
         * backAround("Hello") → "oHelloo"
         * backAround("a") → "aaa"
         */

        System.out.println(backAround("Apple"));
    }

    /**
     *
     * @param str
     * @return
     *
     */
    public static String backAround(String str) {
                            //A| p p l |e
        char ch = str.charAt(str.length()-1);

        return ch + str + ch;

    }
}
