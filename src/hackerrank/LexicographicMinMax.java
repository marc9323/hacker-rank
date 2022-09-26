package hackerrank;

public class LexicographicMinMax {

    public static void main(String[] args) {

        System.out.println(minMax(4, "Hello World of Lego Blocks for Bims Toys for children aeiou"));
    }

    public static String minMax(int k, String str) { // 2,  "Hello"
        String currStr = str.substring(0, k);  // "Hello"
        String lexMin = currStr; // "Hello"
        String lexMax = currStr; // "Hello"


        for (int index = k; index < str.length(); index++) {
            currStr = currStr.substring(1, k) + str.charAt(index); // el + l, ll, lo
            System.out.println(currStr);
            if (lexMax.compareTo(currStr) < 0) {
                System.out.println("Current LexMax: " + lexMax + " compared to: " + currStr);
                lexMax = currStr;
            }
            if (lexMin.compareTo(currStr) > 0) {
                System.out.println("Current LexMin: " + lexMin + " compared to: " + currStr);
                lexMin = currStr;
            }
        }

        return lexMin + "\n" + lexMax;
    }
}
