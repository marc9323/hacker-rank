package hackerrank;

import java.util.*;

public class ReverseWordsInSentence {

    public static void main(String[] args) {
        System.out.println(reverseWords("That was boolsjit"));
    }

    public static String reverseWords(String sentence) {

        // use split to get an array of words
        String[] words = sentence.split(" ");

        Collections.reverse(Arrays.asList(words));

        String newString = "";
        for(String word : words) {
            newString += word + " ";
        }


        return newString;
    }
}
