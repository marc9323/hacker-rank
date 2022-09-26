package hackerrank;

import java.util.*;
//import com.google.common.base.CharMatcher;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.split("[^a-zA-Z]");
        System.out.println("+++++++++++++++++++++");
        for(String token : tokens) {
            System.out.print(" " + token + " ");
        }
        int numTokens = 0;

        // count tokens
        for (int i=0; i < tokens.length; i++)
            if (tokens[i].length() > 0)
                numTokens++;

        System.out.println(numTokens);
        //System.out.println(tokens.length - 1);

        for (int i=0; i < tokens.length; i++)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);

    }
}
