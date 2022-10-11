package hackerrank;

import java.util.HashMap;

// comment is a change to explore github
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // contains all the same characters IN the same frequencies
        char[] charsInStringA = a.toCharArray();
        char[] charsInStringB = b.toCharArray();

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hashmap2 = new HashMap<Character, Integer>();

        hashmap = frequencies(a);
        hashmap2 = frequencies(b);

        //  Collections.sort(hashmap);

        // for(int index = 0; index < a.length(); index++) {
        //     char c = a.charAt(index);
        //     Integer count = hashmap.get(c);
        //     if(count != null) {
        //         hashmap.put(c, count++);
        //     } else {
        //         hashmap.put(c, 1);
        //     }
        // }
        // return false;
        return false;
    }

    public static HashMap<Character, Integer> frequencies(String a) {
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

        for (int index = 0; index < a.length(); index++) {
            char c = a.charAt(index);
            Integer count = hashmap.get(c);
            if (count != null) {
                hashmap.put(c, count++);
            } else {
                hashmap.put(c, 1);
            }
        }
        return new HashMap<Character, Integer>();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}